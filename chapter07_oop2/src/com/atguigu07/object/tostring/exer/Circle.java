package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 10:53
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

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

    public double findArea(){
        return 3.14*radius*radius;
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Circle){
            Circle c = (Circle) o;
            return this.findArea() == c.findArea();
        }
        return false;
    }

    public String toString(){
        return "Circle[radius = "+ radius+"]";
    }

}
