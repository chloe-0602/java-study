package com.atguigu07._abstract.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu07._abstract.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 22:19
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
