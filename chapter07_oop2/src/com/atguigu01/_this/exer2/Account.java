package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:43
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt >0){
            System.out.println("deposit "+ amt);
            this.balance += amt;
        }

    }

    public void withdraw(double amt){
        if (balance >=amt && amt >0){
            System.out.println("withdraw.." + amt);
            this.balance -= amt;
        }else{
            System.out.println("no " + amt + " money...");
        }

    }
}
