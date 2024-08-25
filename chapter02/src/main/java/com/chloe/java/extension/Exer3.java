package com.chloe.java.extension;

/**
 * 3、判断如下代码的运行结果(难)
 */
public class Exer3 {
    public static void main(String[] args) {
//        int i = 1;
//        int j = i++;
//        int k = i++ * ++j + ++i * j++; // 2 * 2 + 4 * 2 = 4 + 8 = 12
//
//        System.out.println("i = " + i); // 4
//        System.out.println("j = " + j); // 3
//        System.out.println("k = " + k);//12


        //如下代码的计算结果是：
//        int i = 1;
//        i *= 0.2; //0
//        i++;
//        System.out.println("i=" + i);//i=1

        //如下代码的运算结果是：
//        int i = 2;
//        i *= i++; //  2 * 2 = 4
//
//        int j = 2;
//        j *= j+1; // 2 * 3 = 6
//
//        int k = 2;
//        k *= ++k; // 2 * 3 = 6
//
//        System.out.println("i=" + i);//i=4
//        System.out.println("j=" + j);//i=6
//        System.out.println("k=" + k);//i=6

//        float f=3.4; //错误，因为3.4默认是double类型
        System.out.println(15/2*2); //14，因为15/2结果是7
    }
}
