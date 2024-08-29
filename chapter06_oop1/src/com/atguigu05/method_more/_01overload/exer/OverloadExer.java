package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverloadExer
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * <p>
 * <p>
 * 练习3：
 * 定义三个重载方法max()：
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 0:46
 * @Version 1.0
 */
public class OverloadExer {
    public void mOL(int i) {
        System.out.println("i: " + i);
    }

    public void mOL(int i, int j) {
        System.out.println("i: " + i + ", j: " + j);
    }

    public void mOL(String str) {
        System.out.println("str: " + str);

    }


    public int max(int i, int j) {
        return i > j ? i : j;
    }

    public double max(double i, double j) {
        return i > j ? i : j;
    }

    public double max(double i, double j, double k) {
//        double res;
//        double temp = max(i,j);
//        double temp1 = max(j,k);
//        if (temp > temp1){
//            res = temp;
//        }else {
//            res = temp1;
//        }
//        return res;
        return (max(i, j) > k) ? max(i, j) : k;
    }
}
