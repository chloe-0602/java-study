package com.chloe.java.demo;

public class ForForTest2 {
    public static void main(String[] args) {
        /**
         * *
         * **
         * ***
         * ****
         * *****
         */
        for (int i = 1; i <= 5; i++) { // 外层控制行
            for (int j = 1; j <= i; j++) { // 不会写的时候，举例子； 当i= 1的时候 ，j需要循环一次，那么就是j <= i
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * *****
         * ****
         * ***
         * **
         * *
         */

        System.out.println("==================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============");

        /*
        菱形
         */
    }

}
