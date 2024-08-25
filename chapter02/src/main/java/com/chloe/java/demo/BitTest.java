package com.chloe.java.demo;

public class BitTest {
    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("num << 1: "  + (num1 << 1));
        System.out.println("num << 2: "  + (num1 << 2));
        System.out.println("num << 3: "  + (num1 << 3));
        System.out.println("num << 28: "  + (num1 << 28));
        System.out.println("num << 29: "  + (num1 << 29));

        System.out.println();

        int num2 = -7;
        System.out.println("num << 1: "  + (num2 << 1));
        System.out.println("num << 2: "  + (num2 << 2));
        System.out.println("num << 3: "  + (num2 << 3));

        //面试题 高效 2 * 8
        System.out.println(2 << 3);
        System.out.println(8 << 1);
    }
}
