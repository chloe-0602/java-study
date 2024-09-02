package com.atguigu10._enum.exer1;

/**
 * ClassName: BankTest
 * Package: com.atguigu10._enum.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/2 12:00
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank1 instance = Bank1.instance;
    }
}
class Bank1{
    private Bank1(){
    }

    public static final Bank1 instance = new Bank1();
}

enum Bank2{
    CPB;
}
