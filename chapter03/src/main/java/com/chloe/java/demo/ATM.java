package com.chloe.java.demo;

import java.util.Scanner;

/**
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *
 * =========ATM========
 *    1、存款
 *    2、取款
 *    3、显示余额
 *    4、退出
 * 请选择(1-4)：
 */
public class ATM {
    public static void main(String[] args) {
        int balance = 0;

        boolean isFlag = true;
        int operator = 0;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("""
                     * =========ATM========
                     *    1、存款
                     *    2、取款
                     *    3、显示余额
                     *    4、退出
                     * 请选择(1-4)：""");
            operator = scanner.nextInt();
            switch (operator){
                case 1:
                    System.out.print("存款：");
                    balance += scanner.nextInt();
                    System.out.println("--存款完成--");
                    break;
                case 2:
                    System.out.print("取款：");
                    balance -= scanner.nextInt();
                    System.out.println("--取款完成--");
                    break;
                case 3:
                    System.out.println("余额：" + balance);
                    System.out.println("--显示余额完成--");
                    break;
                case 4:
                    System.out.println("--退出--");
                    isFlag = false;
                    break;
            }

        }while(isFlag);

        scanner.close();

    }
}

