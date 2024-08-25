package com.chloe.java.demo;
import java.util.Scanner;

/**
 * 小明注册某交友网站，要求录入个人相关信息。如下：
 * 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎光临你好我好交友网站！");

        System.out.print("请输入你的网名：");
        String name = scanner.next();

        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.print("请输入你的体重：");
        double weight = scanner.nextDouble();

        System.out.print("你是否单身（true/false)：");
        boolean isSingle = scanner.nextBoolean();

        System.out.print("请输入你的性别：");
        char gender = scanner.next().charAt(0);//先按照字符串接收，然后再取字符串的第一个字符（下标为0）

        System.out.println();
        System.out.println("----------------- 你的基本情况如下：");
        System.out.println("网名：" + name + "\n年龄：" + age + "\n体重：" + weight +
                "\n单身：" + isSingle + "\n性别：" + gender);

        scanner.close();
    }
}
