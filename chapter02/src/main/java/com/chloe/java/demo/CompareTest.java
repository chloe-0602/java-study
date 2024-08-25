package com.chloe.java.demo;

public class CompareTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        System.out.println(i1 == i2);//false
        System.out.println(i1 != i2);//true
        System.out.println(i1 >= i2);//false


        int m = 10;
        int n = 20;
        System.out.println(m == n);//false
        System.out.println(m = n);//20

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2);//false
        System.out.println(b1 = b2);//true
    }
}
