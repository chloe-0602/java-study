package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayTest1
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 13:08
 * @Version 1.0
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length+2] = 30;

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
