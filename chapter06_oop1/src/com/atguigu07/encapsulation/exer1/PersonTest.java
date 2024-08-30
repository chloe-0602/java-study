package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 18:20
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(131);
        p.setAge(129);

        int age = p.getAge();
        System.out.println(age);
    }
}
