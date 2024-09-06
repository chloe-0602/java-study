package com.atguigu01.use.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Package: com.atguigu01.use.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 15:26
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (100 + 1 - 0));
            list.add(random);
        }

        for (Integer item : list) {
            System.out.println(item);
        }

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer item) {
                return item % 2 == 0;
            }
        });

        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
