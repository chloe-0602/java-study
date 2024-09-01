package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 0:08
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight) {
        super(color, weight);
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
