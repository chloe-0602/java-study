package com.atguigu4.search_sort.exer3;

/**
 * ClassName: BubbleSort
 * Package: com.atguigu4.search_sort.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 22:29
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, -16, 30, 23, -30, -49, 25, 21, 30};

        for (int j = 0; j < arr.length; j++) {
            boolean flag = true;
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
