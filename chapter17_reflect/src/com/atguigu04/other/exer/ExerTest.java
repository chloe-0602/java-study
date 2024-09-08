package com.atguigu04.other.exer;

import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * ClassName: ExerTest
 * Package: com.atguigu04.other.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/9 0:23
 * @Version 1.0
 */
public class ExerTest {
    @Test
    public void test1() throws Exception {
        Properties pros = new Properties();

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
        pros.load(is);
        String fruitName = pros.getProperty("fruitName");

        Class<?> clazz = Class.forName(fruitName);
        Constructor<?> con = clazz.getDeclaredConstructor();
        con.setAccessible(true);

        Fruit fruit = (Fruit) con.newInstance();

        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }

}
