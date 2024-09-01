package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 10:52
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
