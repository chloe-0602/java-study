package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: Test
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 11:29
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle,5);
        System.out.println();
        System.out.println("now: "+circle.radius);
    }
}
