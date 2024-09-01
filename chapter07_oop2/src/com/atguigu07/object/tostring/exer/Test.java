package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Test
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 10:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle("yellow", 2.0, 2.0);
        Circle circle2 = new Circle("white", 2.0, 2.0);
        boolean colorEqual = circle1.getColor()==circle2.getColor();
        System.out.println(colorEqual);
        System.out.println("----------");
        boolean equals = circle1.equals(circle2);
        System.out.println(equals);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
