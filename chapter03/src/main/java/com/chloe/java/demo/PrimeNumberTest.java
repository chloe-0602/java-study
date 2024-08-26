package com.chloe.java.demo;

/**
 * **题目：找出100000以内所有的素数（质数）个数？
 * 目的：不同的代码的实现方式，可以效率差别很大。
 * 分析：素数（质数）：只能被1和它本身整除的自然数。  ---> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。
 * 比如：2、3、5、7、11、13、17、19、23、...
 */
public class PrimeNumberTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int count = 0;
        for (int i = 2; i < 100000; i++) {
            boolean flag = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }
        }

        long end = System.currentTimeMillis();

        /**
         * 时长是： 14679 ms
         * 质数个数是： 9592
         *
         * -- 1） 加上break之后
         * 时长是： 1431 ms
         * 质数个数是： 9592
         *
         * --2) 加上Math.sqrt
         * 时长是： 11 ms
         * 质数个数是： 9592
         */
        System.out.println("时长是： " + (end -start) + " ms");
        System.out.println("质数个数是： " + count);
    }
}
