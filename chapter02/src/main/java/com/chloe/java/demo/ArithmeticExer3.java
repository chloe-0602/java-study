package com.chloe.java.demo;

public class ArithmeticExer3 {
    public static void main(String[] args) {
//        int i1 = 10;
//        int i2 = 20;
//        int i = i1++;
//        System.out.print("i="+i); //10
//        System.out.println("i1="+i1);//11
//        i = ++i1;
//        System.out.print("i="+i);//12
//        System.out.println("i1="+i1);//12
//
//        i = i2--;
//        System.out.print("i="+i);//20
//        System.out.println("i2="+i2);//19
//        i = --i2;
//        System.out.print("i="+i);//18
//        System.out.println("i2="+i2);//18

        System.out.println("=========================================");
//        byte bb1 = 127;
//        bb1++;
//        System.out.println("bb1 = " + bb1);//-128
//
//        int i = 1;
//        int j = i++ + ++i * i++;
//        System.out.println("j = " + j);

        int i = 2;
        int j = i++;
        System.out.println(j);

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m);
    }
}
