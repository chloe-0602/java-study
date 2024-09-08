package com.atguigu04.other.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * ClassName: AnnotationTest
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/9 0:13
 * @Version 1.0
 */
public class AnnotationTest {
    @Test
    public void test1(){
        Class<Customer> calzz = Customer.class;
        Table table = calzz.getAnnotation(Table.class);
        System.out.println(table.name());
    }

    @Test
    public void test2() throws Exception {
        Class<Customer> clazz = Customer.class;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Column nameFieldAnnotation = nameField.getAnnotation(Column.class);
        System.out.println(nameFieldAnnotation.columnName());
        System.out.println(nameFieldAnnotation.columType());
    }
}
