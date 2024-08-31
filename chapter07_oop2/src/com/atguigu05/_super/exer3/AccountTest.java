package com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 20:59
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("-----------------");
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.0045, 5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);


    }
}
