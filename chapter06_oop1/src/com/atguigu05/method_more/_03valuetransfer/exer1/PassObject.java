package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 11:28
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle c, int time) {
        if (time < 1) {
            System.out.println("请输入大于0的数据");
            return;
        }

        System.out.print("Radius" + "\t" + "Area");
        int i = 1;
        for (; i < time + 1; i++) {
            Circle circle = new Circle();
            circle.radius = i;
            System.out.println();
            System.out.print(circle.radius + "\t\t" + circle.findArea());

        }

        c.radius = i;
    }
}
