package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 23:48
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(int radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof Circle){
            Circle c = (Circle) o;
//            if (this.getRadius()>c.getRadius()){
//                return 1;
//            } else if (this.getRadius()<c.getRadius()) {
//                return -1;
//            }
            return Integer.compare(this.getRadius(), c.getRadius());
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
