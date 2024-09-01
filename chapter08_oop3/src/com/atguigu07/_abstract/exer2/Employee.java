package com.atguigu07._abstract.exer2;

/**
 * ClassName: Employee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 * private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
 * 提供必要的构造器；
 * abstract方法earnings(),返回工资数额；
 * toString()方法输出对象的name,number和birthday。
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 22:47
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name=" + name +
                ", number=" + number +
                ", birthday=" + birthday.toDateString();
    }
}
