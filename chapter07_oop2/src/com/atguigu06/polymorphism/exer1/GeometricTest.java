package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricTest
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 0:11
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest geometricTest = new GeometricTest();

        GeometricObject circle = new Circle("yellow", 1.2, 2.0);
        GeometricObject myRectangle = new MyRectangle("yellow", 1.2, 2.0, 3.0);
        geometricTest.displayGeometricobject(circle);
        geometricTest.displayGeometricobject(myRectangle);
        System.out.println(geometricTest.equalsArea(circle, myRectangle));
    }

    public boolean equalsArea(GeometricObject a, GeometricObject b){
        return a.findArea() == b.findArea();
    }

    public void displayGeometricobject(GeometricObject a){
        System.out.println("面积："+a.findArea());// 动态绑定 <--> 静态绑定
    }
}
