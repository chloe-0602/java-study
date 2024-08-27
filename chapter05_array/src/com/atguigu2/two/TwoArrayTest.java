package com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        //1. 数组的声明与初始化
        int[][] ints = new int[3][4];
        int[][] ints1 = new int[1][];

        //2. 数组元素的调用
        ints[1][1] = 1;
        ints[2][3] = 1;

        //3. 数组的长度
        System.out.println(ints.length);


        //4. 如何遍历数组
        int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(i);
            }
        }
    }
}
