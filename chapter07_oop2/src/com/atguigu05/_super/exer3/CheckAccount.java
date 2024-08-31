package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 21:05
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private int overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, int overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < super.getBalance()){
            super.withdraw(amount);
        } else if (overdraft >= amount - super.getBalance()) {
//            super.setBalance(0);
            overdraft -= (amount - super.getBalance());
            super.withdraw(getBalance());
            System.out.println("取款成功，取款为：" + amount + ", 余额为：" + super.getBalance()
            + "， 透支额度为：" + overdraft);
        }else {
            System.out.println("超过可透支额的限额！");
        }
    }
}
