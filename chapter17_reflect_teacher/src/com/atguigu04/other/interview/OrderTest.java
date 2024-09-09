package com.atguigu04.other.interview;

import org.junit.Test;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:48
 * @Version 1.0
 */
public class OrderTest {
    @Test
    public void test1() throws ClassNotFoundException {
        String className = "com.atguigu04.other.interview.Order";
        Class.forName(className);
        Class.forName(className); // 加载过不会再加载啦！
    }

    @Test
    public void test2() throws ClassNotFoundException {
        String className = "com.atguigu04.other.interview.Order";
        ClassLoader.getSystemClassLoader().loadClass(className);// 这个没有执行 过程3：初始化
    }
}
