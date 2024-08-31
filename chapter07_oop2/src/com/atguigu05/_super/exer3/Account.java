package com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 20:55
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("余额不足！");
            System.out.println("您的账户余额为：" + balance);
            return;
        }
        balance-=amount;
        System.out.println("取款成功，取款为：" + amount + ", 余额为：" + balance);
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("请输入有效的取款金额！");
            return;
        }
        balance+=amount;
        System.out.println("存款成功成功，存款为：" + amount + ", 余额为：" + balance);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
