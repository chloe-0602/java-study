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
        double balance = 0.0;

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
                    double addMoney = scanner.nextDouble();
                    if(addMoney > 0){
                        balance += addMoney;
                    }else {
                        System.out.println("存款需要大于0！");
                    }
                    System.out.println("--存款完成--");
                    break;
                case 2:
                    System.out.print("取款：");
                    double minusMoney = scanner.nextDouble();
                    if(minusMoney > 0 && balance >= minusMoney){
                        balance -= minusMoney;
                    }else{
                        System.out.println("您输入的数据非法或余额不足");
                    }
                    System.out.println("--取款完成--");
                    break;
                case 3:
                    System.out.println("余额：" + balance);
                    System.out.println("--显示余额完成--");
                    break;
                case 4:
                    System.out.println("--退出--");
                    System.out.println("欢迎下次进入此系统。^_^");
                    isFlag = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入~");
            }

        }while(isFlag);

        scanner.close();

    }
}

