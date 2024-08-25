package com.chloe.java.demo;

/**
 * 赋值运算符
 */
public class SetValueTest {
    public static void main(String[] args) {
        int i1 = 10;
        long l1 = i1; //自动类型转换

        byte bb1 = (byte)i1; //强制类型转换

        int i2 = i1;

        //连续赋值的测试
        //以前的写法
        int a1 = 10;
        int b1 = 10;

        //连续赋值的写法
        int a2,b2;
        a2 = b2 = 10;

        int a3 = 10,b3 = 20;

        //举例说明+=  -=  *=  /=   %=
        int m1 = 10;
        m1 += 5; //类似于 m1 = m1 + 5的操作，但不等同于。
        System.out.println(m1);//15

        //练习1：开发中，如何实现一个变量+2的操作呢？
        // += 的操作不会改变变量本身的数据类型。其他拓展的运算符也如此。
        //写法1：推荐
        short s1 = 10;
        s1 += 2; //编译通过，因为在得到int类型的结果后，JVM自动完成一步强制类型转换，将int类型强转成short
        System.out.println(s1);//12
        //写法2：
        short s2 = 10;
        //s2 = s2 + 2;//编译报错，因为将int类型的结果赋值给short类型的变量s时，可能损失精度
        s2 = (short)(s2 + 2);
        System.out.println(s2);


        //练习2：开发中，如何实现一个变量+1的操作呢？
        //写法1：推荐
        int num1 = 10;
        num1++;
        System.out.println(num1);

        //写法2：
        int num2 = 10;
        num2 += 1;
        System.out.println(num2);

        //写法3：
        int num3 = 10;
        num3 = num3 + 1;
        System.out.println(num3);
    }
}
