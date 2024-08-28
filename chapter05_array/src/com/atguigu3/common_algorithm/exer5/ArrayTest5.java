package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayTest5
 * Package: com.atguigu3.common_algorithm.exer5
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 13:01
 * @Version 1.0
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        // 方式1
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }

        //快慢指针
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
