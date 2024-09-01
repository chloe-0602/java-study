package com.atguigu05.field;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:40
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);//1
    }
}

class Order{


    {
        orderId = 2; // 不会报错
    }
    int orderId = 1;


    public Order(){
        super();
//        orderId = 3;
    }

    public Order(int orderId){
        this.orderId = orderId;
    }

    public void eat(){
        sleep();
    }// sleep()在方法区加载了，所以调用不报错

    public void sleep(){

    }
}
