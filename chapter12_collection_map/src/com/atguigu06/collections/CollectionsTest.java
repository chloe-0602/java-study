package com.atguigu06.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: CollectionsTest
 * Package: com.atguigu06.collections
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 10:51
 * @Version 1.0
 */
public class CollectionsTest {
    @Test
    public void test1(){
        List src = Arrays.asList(3, 4, 121, 3, 2, 1, 4);
        List dest = Arrays.asList(new Object[src.size()]);
        Collections.copy(dest, src);
        System.out.println(dest);
    }
    @Test
    public void test2(){
        List src = Arrays.asList(3, 4, 121, 3, 2, 1, 4);
        List list2 = Collections.synchronizedList(src);
        list2.add(23);
    }
}
