package com.atguigu01._this.exer1;

/**
 * ClassName: Boy
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:22
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        this.name = i;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int i){
        this.age = i;
    }

    public int getAge(){
        return this.age;
    }

    public void marry(Girl girl){
        System.out.println("marry with girl: " + girl.getName());
    }
    public void shout(){
        System.out.println(this.name + " shout...");
    }
}
