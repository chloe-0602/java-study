package com.atguigu04.other.annotation;

/**
 * @author shkstart
 * @create 9:35
 */
@Table(name = "t_customer")
public class Customer {
    @Column(columnName = "name", columType = "varchar")
    private String name;
    @Column(columnName = "age", columType = "int")
    public int age;

    public Customer(){
//        System.out.println("Customer()...");
    }

    public Customer(int age){
        this.age = age;
    }

    private Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("你好，我是一个Customer");
    }

    private String showNation(String nation){
        return "我的国籍是：" + nation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

