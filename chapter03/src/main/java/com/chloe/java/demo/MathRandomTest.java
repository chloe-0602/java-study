package com.chloe.java.demo;

/**
 * 如何产生一个指定范围的随机整数？
 *
 * 1、Math类的random()的调用，会返回一个[0,1)范围的一个double型值
 *
 * 2、Math.random() * 100  --->  [0,100)
 *       (int)(Math.random() * 100)	---> [0,99]
 *       (int)(Math.random() * 100) + 5  ----> [5,104]
 *
 * 3、如何获取`[a,b]`范围内的随机整数呢？`(int)(Math.random() * (b - a + 1)) + a`
 *
 * 4、举例
 */
public class MathRandomTest {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        // [1, 6]
        int r1 = (int)(Math.random() * 6) + 1;
        System.out.println(r1);

        // [0, 100]
        int r2 = (int)(Math.random() * 101);
        System.out.println(r2);

        // [1, 100]
        int r3 = (int)(Math.random() * 100) + 1;
        System.out.println(r3);
    }
}
