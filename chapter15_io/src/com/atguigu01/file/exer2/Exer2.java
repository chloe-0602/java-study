package com.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer2
 * Package: com.atguigu01.file.exer2
 * Description:
 *          判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
            提示：File类提供了文件过滤器方法(拓展)
 *          public String[] list(FilenameFilter filter)
 * @Author Xu, Luqin
 * @Create 2024/9/7 16:23
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        File file = new File("D:\\桌面壁纸");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for(String s : list){
            System.out.println(s);
        }
    }
}
