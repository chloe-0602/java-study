package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 0:03
 * @Version 1.0
 */
public class GeometricObject {
    private String color;
    private double weight;

    protected GeometricObject(String color, double weight) {
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

    public double findArea(){
        return 0.0;
    }
}
