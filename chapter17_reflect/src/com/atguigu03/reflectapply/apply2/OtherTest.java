package com.atguigu03.reflectapply.apply2;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author shkstart
 * @create 14:45
 */
public class OtherTest {

    //（熟悉）获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型等
    //1. 获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
    //2. 获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class<?>[] interfaces = clazz.getInterfaces();
        for(Class f: interfaces){
            System.out.println(f);
        }
    }
    //3. 获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
    //4. 获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    //5. 获取运行时类的父类的泛型 (难)
    @Test
    public void test5() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.atguigu03.reflectapply.data.Person");
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] arguments = parameterizedType.getActualTypeArguments();
        for(Type arg: arguments){
            System.out.println(((Class)arg).getName());
        }
    }


}
