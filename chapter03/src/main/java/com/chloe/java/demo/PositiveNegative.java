package com.chloe.java.demo;

import java.util.Scanner;

/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
public class PositiveNegative {
    public static void main(String[] args) {
        int num = 0;
        int positive = 0;
        int negative = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("请输入整数（输入为0时结束程序）：");
            num = scanner.nextInt();
            if(num > 0){
                positive++;
            }else if (num < 0){
                negative++;
            }else {
                System.out.println("exit...");
                break;
            }
        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        scanner.close();
    }
}
