package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecursionExer
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 * 练习1：
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * <p>
 * <p>
 * 练习2：
 * 已知有一个数列：f(0) = 1,f(1) = 4,
 * f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 14:46
 * @Version 1.0
 */
public class RecursionExer {
    public static void main(String[] args) {
        RecursionExer exer = new RecursionExer();
        int f = exer.f(10);
        System.out.println(f);

        System.out.println(f1(10));
    }

    public int f(int num) {
        if (20 == num) {
            return 1;
        } else if (21 == num) {
            return 4;
        } else {
//            f(n+2) = 2*f(n+1)+f(n)
            // 朝着已知的方向出发
            // f（10） = f(12) -2f(11) => f(11) = f(13) -f(12)
            return f(num + 2) - 2 * f(num + 1);
        }
    }

    public static int f1(int n) {
        if (0 == n) {
            return 1;
        } else if (1 == n) {
            return 4;
        } else {
            return 2 * f1(n - 1) + f1(n - 2);
        }
    }
}
