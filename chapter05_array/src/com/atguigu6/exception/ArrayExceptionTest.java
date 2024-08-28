package com.atguigu6.exception;
/**
 *
 * 测试数组中常见的异常
 *
 * @author 尚硅谷-宋红康
 * @create 13:22
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		// 1. 数组角标越界的异常：
		int[] arr = new int[10];
//		System.out.println(arr[10]);
//		System.out.println(arr[-1]);

		// 2. 空指针异常：
//		int[] arr1 = new int[10];
//		arr1 = null;
//		System.out.println(arr1[0]);

		int[][] ints = new int[10][];
		System.out.println(ints[1][1]);

	}
}
