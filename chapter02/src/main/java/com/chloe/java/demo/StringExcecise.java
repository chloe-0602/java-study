package com.chloe.java.demo;

public class StringExcecise {
    public static void main(String[] args) {
//        String str1 = 4;                       //判断对错： 错
        String str2 = 3.5f + "";               //判断str2对错：
        System.out.println(str2);              //输出：对
        System.out .println(3+4+"Hello!");     //输出：对
        System.out.println("Hello!"+3+4);      //输出：对
        System.out.println('a'+1+"Hello!");    //输出：对
        System.out.println("Hello"+'a'+1);     //输出：对

//        System.out.println("*    *");               //输出：
//        System.out.println("*\t*");                 //输出：
//        System.out.println("*" + "\t" + "*");       //输出：
//        System.out.println('*' + "\t" + "*");       //输出：
        System.out.println('*' + '\t' + "*");       //输出：
        System.out.println('*' + "\t" + '*');       //输出：
        System.out.println("*" + '\t' + '*');       //输出：
        System.out.println('*' + '\t' + '*');       //输出：
    }
}
