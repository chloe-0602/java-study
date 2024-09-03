package com.atguigu06.project.team.domain;

/**
 * ClassName: Employee
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:09
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetail(){
        return +id+
                "\t"+name+
                "\t"+age+
                "\t"+salary+"\t";
    }

    @Override
    public String toString() {
        return getDetail();
    }
}
