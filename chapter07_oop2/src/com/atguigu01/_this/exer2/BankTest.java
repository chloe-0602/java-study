package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:51
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jack", "Smith");
        bank.addCustomer("Jack1", "Smith");
        bank.addCustomer("Jack2", "Smith");

        Customer customer = bank.getCustomer(2);
        customer.setAccount(new Account(1000));
        bank.getCustomer(2).getAccount().withdraw(200);
        System.out.println(customer.getFirstName() + " " + customer.getLastName()
                + " " + customer.getAccount().getBalance());
    }
}
