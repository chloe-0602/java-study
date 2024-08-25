package com.chloe.java.extension;

/**
 * 16、判断闰年
 * 给定一个年份，判断是否是闰年。输出"xxx年(是/不是)闰年"。
 * 闰年的判断标准是：
 * 1）可以被4整除，但不可被100整除
 * 2）可以被400整除
 */
public class Exercise16 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + (isLeapYear ? "是闰年": "不是闰年"));
    }
}
