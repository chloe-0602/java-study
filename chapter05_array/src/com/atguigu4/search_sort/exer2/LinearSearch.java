package com.atguigu4.search_sort.exer2;

/**
 * ClassName: ArrayTest
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 13:52
 * @Version 1.0
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
//        int element = 5;
        int element = 25;

        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == element) {
                System.out.println("找到元素" + element + ", 索引为： " + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("找不到元素" + element);
        }
    }
}
