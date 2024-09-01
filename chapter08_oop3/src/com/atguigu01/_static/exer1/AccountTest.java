package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 13:20
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("1111", 2000, 0.045);
        Account account2 = new Account("222", 3000, 0.040);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println(Account.getInterest());
        System.out.println(Account.getMinBalance());
    }
}
