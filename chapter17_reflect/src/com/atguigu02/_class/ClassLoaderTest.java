package com.atguigu02._class;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: ClassLoaderTest
 * Package: com.atguigu02._class
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/8 21:14
 * @Version 1.0
 */
public class ClassLoaderTest {
    /**
     * 需求：通过ClassLoader加载指定的配置文件
     */
    @Test
    public void test1() throws IOException {
        Properties pros = new Properties();

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        pros.load(is);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(name + "-" + password);
    }
}
