package com.atguigu05.method_more._02args;

import com.atguigu05.method_more._02args.ArgsTest;

/**
 * ClassName: Demo
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 8:07
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();
//        argsTest.print(2,6,4,5);
        argsTest.print(new int[]{2,6,4,5});



        argsTest.print(1);
    }
}
