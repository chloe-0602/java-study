package com.atguigu03.list.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.atguigu03.list.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/5 22:23
 * @Version 1.0
 */
public class StudentTest {
    @Test
    public void test(){

        List arrayList = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请录入学生的信息");
            System.out.println("1: 继续录入 ， 0：结束录入");
            int choose = scanner.nextInt();
            if (choose == 0){
                break;
            }

            if (choose==1){
                System.out.print("请输入学生姓名：");
                String name = scanner.next();
                System.out.print("请输入学生年龄：");
                int age = scanner.nextInt();
                arrayList.add(new Student(name, age));
            }
        }

        scanner.close();

        System.out.println("遍历学生信息：");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}