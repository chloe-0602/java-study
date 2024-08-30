package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 18:17
 * @Version 1.0
 */
public class Person {
    private int age;
    public void setAge(int age){
        if(age >= 0 && age <= 130){
            this.age = age;
        }else {
            System.out.println("请输出人的合法年龄0~130");
        }
    }

    public int getAge(){
        return this.age;
    }
}
