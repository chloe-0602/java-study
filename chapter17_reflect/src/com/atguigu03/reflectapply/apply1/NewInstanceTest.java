package com.atguigu03.reflectapply.apply1;

import com.atguigu01.example.Person;
import org.junit.Test;

/**
 * ClassName: NewInstanceTest
 * Package: com.atguigu03.reflectapply.apply1
 * Description:
 *  反射的应用1：创建运行时类的对象
 * @Author Xu, Luqin
 * @Create 2024/9/8 21:21
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);
    }
}
