package com.chloe.java.demo;

/**
 * 说明：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 */
public class ForTest4 {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;

        int minNum = (m < n) ? m: n;
        int maxNum = (m > n) ? m: n;

        // 最大公约数
        // for
        for (int i = minNum; i >= 1; i--) {
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数: " + i);
                break;
            }
        }

        // while
        int k = minNum;
        while (k >= 1){
            if(m % k == 0 && n % k == 0){
                System.out.println("最大公约数: " + k);
                break;
            }
            k--;
        }

        // 最小公倍数
        // for
        for (int i = maxNum; i <= m * n; i++) {
            if(i % m == 0 && i % n ==0){
                System.out.println("最小公倍数: " + i);
                break;
            }
        }

        int j = maxNum;
        while (j <= m * n ){
            if(j % m == 0 && j % n ==0){
                System.out.println("最小公倍数: " + j);
                break;
            }
            j++;
        }
    }
}
