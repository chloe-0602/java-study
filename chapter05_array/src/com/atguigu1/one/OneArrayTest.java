package com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {

    public static void main(String args[]) {
        //1. 数组的声明与初始化
        int[] ints2 = new int[1]; // 动态初始化
		int[] ints = new int[]{1,2};// 静态初始化

        //2. 数组元素的调用
		System.out.println(ints[1]);

        //3. 数组的长度
		System.out.println(ints.length);

        //4. 如何遍历数组
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}

    }

}
