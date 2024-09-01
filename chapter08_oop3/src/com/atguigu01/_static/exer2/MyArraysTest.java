package com.atguigu01._static.exer2;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu01._static.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 13:33
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        System.out.println(MyArrays.getMax(arr));
        System.out.println(MyArrays.copy(arr).toString());
        System.out.println(MyArrays.getAvg(arr));
        System.out.println(MyArrays.getMin(arr));
    }
}
