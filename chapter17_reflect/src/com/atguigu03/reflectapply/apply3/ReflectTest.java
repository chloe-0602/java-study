package com.atguigu03.reflectapply.apply3;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectTest
 * Package: com.atguigu03.reflectapply.apply3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/8 22:13
 * @Version 1.0
 */
public class ReflectTest {
    //********************如下是调用指定的属性************************
    /*
     * 反射的应用3-1：调用指定的属性
     *
     * */
    // public int age = 1;
    @Test
    public void test1() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field ageField = clazz.getDeclaredField("age");
        ageField.set(person, 2);
        System.out.println(ageField.get(person));
    }

    //private String name;
    @Test
    public void test2() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "Tom");
        System.out.println(nameField.get(person));
    }

    //   private static String info;
    @Test
    public void test3() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Field infoField = clazz.getDeclaredField("info");
        infoField.setAccessible(true);
        infoField.set(null, "hh oo aa");
        System.out.println(infoField.get(null));
    }

    // private String showNation(String nation,int age)
    @Test
    public void test4() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class, int.class);
        showNationMethod.setAccessible(true);
        Object returnValue = showNationMethod.invoke(person, "CHN", 20);
        System.out.println(returnValue);
    }

    //    public static void showInfo()
    @Test
    public void test5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Method showInfoMethod = clazz.getDeclaredMethod("showInfo");
        Object returnValue = showInfoMethod.invoke(null);
        System.out.println(returnValue);
    }

    // private Person(String name, int age)
    @Test
    public void test6() throws Exception {
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Person person = constructor.newInstance("Tom", 12);
        System.out.println(person);
    }

    /**
     * 使用Constructor替换原有的使用Class调用newInstance()的方式创建对象
     */
    @Test
    public void test7() throws Exception {
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person person = constructor.newInstance();
        System.out.println(person);
    }
}
