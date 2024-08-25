package com.chloe.java.demo;

public class Info {
    public static void main(String[] args) {
        String name = "chloe";
        int age = 27;
        char gender = '女';
        double weight = 50;
        boolean isMarried = false;
        String phoneNumber = "13112341234";

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("体重：" + weight);
        System.out.println("婚否：" + isMarried);
        System.out.println("电话：" + phoneNumber);
        //或者
        System.out.println("name = " + name + ",age = " + age + "，gender = " +
                gender + ",weight = " + weight + ",isMarried = " + isMarried +
                ",phoneNumber = " + phoneNumber);
    }
}
