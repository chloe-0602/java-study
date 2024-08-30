package com.atguigu01._this.exer2;

/**
 * ClassName: Bank
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:46
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
       customers =   new Customer[10];
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f, l);
        customers[numberOfCustomer++] =customer;
    }

    public Customer getCustomer(int index){
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }

        return customers[index];
    }
}
