package com.atguigu08._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 23:51
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2);
        ComparableCircle c2 = new ComparableCircle(3);
        System.out.println(c1.compareTo(c2));
    }
}
