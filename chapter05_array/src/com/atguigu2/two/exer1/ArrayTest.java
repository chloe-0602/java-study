package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayTest
 * Package: com.atguigu2.two.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/27 22:21
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
