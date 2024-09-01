package com.atguigu06.polymorphism.exer3;


/**
 * ClassName: InstanceTest
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 0:34
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
        Person person = new Person();
        Person student = new Student();
        Person graduate = new Graduate();
        instanceTest.method(person);
        System.out.println("--------------");
        instanceTest.method(student);
        System.out.println("--------------");
        instanceTest.method(graduate);
    }
    public void method(Person e){
        System.out.println(e.getInfo());
        System.out.println("*****************");
        if (e instanceof Graduate){
            System.out.println("""
                    a graduated student
                    a student
                    a person
                    """);
        }else if (e instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        } else if(e instanceof Person){
            System.out.println("a person");
        }
    }
}

class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
