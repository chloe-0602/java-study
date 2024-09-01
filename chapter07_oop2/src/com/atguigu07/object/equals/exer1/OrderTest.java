package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 1:42
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "order1");
        Order order2 = new Order(1001, "order1");
        boolean equals = order1.equals(order2);
        System.out.println(equals);

        String str1="aa";
        String str2="aa";
        System.out.println(str1==str2);// true
    }
}
