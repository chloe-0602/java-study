package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayTest2
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 13:13
 * @Version 1.0
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int index = 4;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
