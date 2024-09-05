package com.atguigu04.set.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer1
 * Package: com.atguigu04.set.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 0:24
 * @Version 1.0
 */
public class Exer1 {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(88);
        list.add(88);
        list.add(67);
        list.add(76);

        List list1 = duplicateList(list);
        for(Object o : list1){
            System.out.println(o);
        }
    }

    public static List duplicateList(List list){
        HashSet set = new HashSet(list);
        return new ArrayList(set);
    }
}


