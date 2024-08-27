package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer2
 * Package: com.atguigu1.one.exer2
 * Description:
 *案例：输出英文星期几
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * 拓展：一年12个月的存储
 * 用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
 * {"January","February","March","April","May","June","July","August","September","October","November","December"}
 * @Author Xu, Luqin
 * @Create 2024/8/27 16:30
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(day[num-1]);
        scanner.close();
    }
}
