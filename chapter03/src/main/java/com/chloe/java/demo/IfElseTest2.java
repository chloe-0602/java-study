package com.chloe.java.demo;

public class IfElseTest2 {
    public static void main(String[] args) {
        /**
         * 三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从大到小输出。
         */
        int num1 = 23,num2 = 32,num3 = 12;
        if(num1 >= num2){
            // {1} num1 {} num2 {2}
            if(num3 >= num1){
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }else if(num3 <= num2){
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        }else{
            // {1} num2 {} num1 {2}
            if(num3 >= num2){
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }else if(num3 <= num1){
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        }
    }
}
