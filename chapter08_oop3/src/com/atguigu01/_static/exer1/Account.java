package com.atguigu01._static.exer1;

/**
 * ClassName: Account
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 13:16
 * @Version 1.0
 */
public class Account {
    private int id; // 千万不要加
    private String password;
    private double balance;
    private static double interest;
    private static double minBalance = 1.0;
    private static int init = 1001;

    public Account() {
        this.id = init;
        password = "11111";
        interest = 0.045;

    }

    public Account(String password, double balance, double interest) {
        this();
        this.password = password;
        this.balance = balance;
        init++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Account.interest = interest;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                ", minBalance=" + minBalance +
                '}';
    }
}
