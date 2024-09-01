package com.atguigu07._abstract.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07._abstract.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 22:17
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public abstract double findArea();
}
