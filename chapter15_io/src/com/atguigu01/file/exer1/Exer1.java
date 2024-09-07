package com.atguigu01.file.exer1;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer1
 * Package: com.atguigu01.file.exer1
 * Description:
 *创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
 * @Author Xu, Luqin
 * @Create 2024/9/7 16:19
 * @Version 1.0
 */
public class Exer1 {
    @Test
    public void test1(){
        File file = new File("hello.txt");
        System.out.println(file.getAbsoluteFile());
        File file1 = new File(file.getAbsoluteFile().getParent(), "abc.txt");
        System.out.println(file1.getAbsoluteFile());
    }

}
