package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 0:06
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
