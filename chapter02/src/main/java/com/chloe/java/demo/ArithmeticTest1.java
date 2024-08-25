package com.chloe.java.demo;

public class ArithmeticTest1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a + b);// 7
        System.out.println(a - b);// -1
        System.out.println(a * b);// 12
        System.out.println(a / b);// 计算机结果是0，为什么不是0.75呢？
        System.out.println(a % b);// 3

        //结果与被模数符号相同
        System.out.println(5%2);//1
        System.out.println(5%-2);//1
        System.out.println(-5%2);//-1
        System.out.println(-5%-2);//-1
        //商*除数 + 余数 = 被除数
        //5%-2  ==>商是-2，余数时1    (-2)*(-2)+1 = 5
        //-5%2  ==>商是-2，余数是-1   (-2)*2+(-1) = -4-1=-5
    }
}
