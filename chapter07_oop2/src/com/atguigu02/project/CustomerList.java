package com.atguigu02.project;

/**
 * ClassName: CustomerList
 * Package: com.atguigu02.project
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 12:16
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        }

        return false;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
//        customers[total - 1] = null;
//        total--;
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for(int i = 0;i < custs.length;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if(index < 0 || index >= total){
            return null;
        }else{
            return customers[index];
        }
    }

    public int getTotal() {
        return total;
    }


}
