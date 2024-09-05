package com.atguigu03.list.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: Exer2
 * Package: com.atguigu03.list.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/5 22:32
 * @Version 1.0
 */
public class Exer2 {

    @Test
    public void test1(){
        /**
         * a-z 97 - 122
         */
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)(Math.random() * (122 - 97 + 1) + 97) + "");
        }

        System.out.println(list);
        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");
        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("x:" + xCount);
    }

    public static int listTest(Collection list, String s){
        int count = 0;
        for(Object item: list){
            if(s.equals(item)){
                count++;
            }
        }
        return count;
    }
}
