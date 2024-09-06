package com.atguigu02.selfdefine.exer2;

import org.junit.Test;

/**
 * ClassName: Exer2
 * Package: com.atguigu02.selfdefine.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 19:47
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        String[] arr = {"AA", "BB", "CC"};
        method1(arr, 0, 2);
        for (String str: arr) {
            System.out.print(str + "\t");
        }
    }

    @Test
    public void test2(){
        Integer[] arr = {33, 1, 2, 33, 22, 4, 5464};
        method2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
     * @param e
     * @param a
     * @param b
     * @param <E>
     */
    public static <E> void method1( E[] e,int a,int b){
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    /**
     * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
     * @param e
     * @param <E>
     */
    public static <E> void method2( E[] e){
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }
}
