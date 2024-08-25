package com.chloe.java.demo;

/**
 * 自动类型提升
 */
public class VariableTest3 {
    public static void main(String[] args) {
        int i1 = 10;
        long l1 = i1;
        float f1 = l1;
        System.out.println(i1 + ", " +  l1  + ", " +  f1);

        long l2 = 123L;
        // 自动类型提升
        long l3 = 123;
//        long l4 = 123122331123133121;// int类型，超过了，报错
    }
}
