package com.chloe.java.demo;

public class BitExer {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;

        System.out.println("m = " + m + ", n = " + n);

        //（推荐）实现方式1：优点：容易理解，适用于不同数据类型    缺点：需要额外定义变量
        //int temp = m;
        //m = n;
        //n = temp;

        //实现方式2：优点：没有额外定义变量    缺点：可能超出int的范围；只能适用于数值类型
        //m = m + n; //15 = 10 + 5
        //n = m - n;//10 = 15 - 5
        //m = m - n;//5 = 15 - 10

        //实现方式3：优点：没有额外定义变量    缺点：不易理解；只能适用于数值类型
        m = m ^ n;
        n = m ^ n; //(m ^ n) ^ n
        m = m ^ n;

        System.out.println("m = " + m + ", n = " + n);
    }
}
