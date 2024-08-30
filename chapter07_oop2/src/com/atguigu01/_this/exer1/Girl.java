package com.atguigu01._this.exer1;

/**
 * ClassName: Girl
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:25
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
        System.out.println("init...");
    }

    public Girl(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public void setName(String i){
        this.name = i;
    }

    public String getName(){
        return this.name;
    }

    public void marry(Boy boy){
        System.out.println("merry with boy: " + boy.getName() + ", age: " + boy.getAge());
        boy.marry(this);

    }
    public int compare(Girl girl){
        System.out.println(this.name + " compare with " + girl.getName());
        if (this.age > girl.age){
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }
    }
}
