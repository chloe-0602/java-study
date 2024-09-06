package com.atguigu05.map.exer1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: SingerTest
 * Package: com.atguigu05.map.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 10:00
 * @Version 1.0
 */
public class SingerTest {
    @Test
    public void test(){
        Map singers = new HashMap();
        singers.put("周杰伦", new String[]{"双节棍", "本草纲目"});
        singers.put("陈奕迅", new String[]{"浮夸", "十年"});

        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入歌手和歌曲相关信息：");
        System.out.print("歌手:");
        System.out.println();
        String singer = scanner.next();
        String[] songs = (String[]) singers.get(singer);
        System.out.println("歌曲有： " + songs.toString());


        scanner.close();
    }
}
