package com.chloe.java.demo;

import java.util.Scanner;

/**
 * 编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
 */
public class SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("day: ");
        int day = scanner.nextInt();

        int sumDays = 0;

        switch (month){
            case 12:
                sumDays += 30;//这个30是代表11月份的满月天数
            case 11:
                sumDays += 31;//这个31是代表10月份的满月天数
            case 10:
                sumDays += 30;//这个30是代表9月份的满月天数
            case 9:
                sumDays += 31;//这个31是代表8月份的满月天数
            case 8:
                sumDays += 31;//这个31是代表7月份的满月天数
            case 7:
                sumDays += 30;//这个30是代表6月份的满月天数
            case 6:
                sumDays += 31;//这个31是代表5月份的满月天数
            case 5:
                sumDays += 30;//这个30是代表4月份的满月天数
            case 4:
                sumDays += 31;//这个31是代表3月份的满月天数
            case 3:
                sumDays += 28;//这个28是代表2月份的满月天数
            case 2:
                sumDays += 31;//这个31是代表1月份的满月天数
            case 1:
                sumDays += day;//这个day是代表当月的第几天

        }

        System.out.println("days: " + sumDays);
        scanner.close();
    }
}
