package com.atguigu4.search_sort.exer2;

/**
 * ClassName: BiSearch
 * Package: com.atguigu4.search_sort.exer2
 * Description: 案例2：二分法查找
 * 定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 14:11
 * @Version 1.0
 */
public class BinerySearch {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
//        int target = 5;
        int target = 50;

        boolean isFind = false;

        int head = 0;
        int end = arr2.length - 1;
        while (head <= end) {
            int mid = (end + head) / 2;
            if (target == arr2[mid]) {
                System.out.println("找到元素的：" + target + ", 位置是：" + mid);
                isFind = true;
                break;
            } else if (arr2[mid] > target) {
                end = mid - 1;
            } else {
                head = mid + 1;
            }
        }

        if (!isFind) {
            System.out.println("未找到元素：" + target);
        }
    }
}
