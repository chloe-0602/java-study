package com.atguigu03.threadsafe.exer;

/**
 * ClassName: AccounDepositTest
 * Package: com.atguigu03.threadsafe.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 11:03
 * @Version 1.0
 */
public class AccounDepositTest {
    public static void main(String[] args) {

        Account account = new Account();
        Customer cust1 = new Customer(account, "储户A");
        Customer cust2 = new Customer(account, "储户B");

        cust1.start();
        cust2.start();
    }
}


class Account{
    private double balance;

    public synchronized void deposit(double amt){ //this是否唯一

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
        }

        if(amt>0){
            balance+=amt;
        }
        System.out.println(Thread.currentThread().getName()+ "存钱1000块，余额为：" + balance);
    }
}

class Customer extends Thread{
    Account account;
    public Customer(Account acc){
        this.account=acc;
    }
    public Customer(Account acct, String name) {
        super(name);
        this.account = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.deposit(1000);
        }
    }
}