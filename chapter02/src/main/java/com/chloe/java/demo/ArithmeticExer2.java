package com.chloe.java.demo;

/**
 * 为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 */
public class ArithmeticExer2 {
    public static void main(String[] args) {
        int hours = 89;

        int day = hours / 24;
        int hour = hours % 24;

        System.out.println(day + ", " + hour);
    }
}
