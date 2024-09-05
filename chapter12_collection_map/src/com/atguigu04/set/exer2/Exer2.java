package com.atguigu04.set.exer2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName: Exer2
 * Package: com.atguigu04.set.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 0:27
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test(){
        HashSet set = new HashSet();
        while (set.size() < 10){
            set.add((int) (Math.random() * (20-1+1) + 1));
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
