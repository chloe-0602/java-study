package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 13:54
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank instance1 = Bank.getInstance();
        Bank instance2 = Bank.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 饿汉式
class Bank{
    // 1.私有化构造器
    private Bank(){

    }

    // 2.创建对象
    // 4.静态方法只能调用类属性，所以需要加static关键字
    private static Bank instance = new Bank();

    // 3.使用方法调用创建的instance对象, 因为是要单例，需要使用类去调用该方法，所以方法需要static
    public static Bank getInstance(){
        return instance;
    }
}
