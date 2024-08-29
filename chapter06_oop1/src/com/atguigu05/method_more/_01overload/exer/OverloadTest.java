package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverloadTest
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 0:50
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadExer exer = new OverloadExer();
        exer.mOL(1);
        exer.mOL(1, 2);
        exer.mOL("aaa");

        System.out.println(exer.max(1, 3));
        System.out.println(exer.max(3.2, 4.5));
        System.out.println(exer.max(43.2, 33.4, 38.5));
    }
}
