package com.atguigu01.create.exer1;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu01.create.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 23:57
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
//        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();
//        evenNumberPrint.start();
//
//        OddNumberPrint oddNumberPrint = new OddNumberPrint();
//        oddNumberPrint.start();

        // 创建Thread类的 匿名子类的 匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " 打印偶数：" + i);
                        System.out.println("-------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " 打印奇数：" + i);
//                System.out.println("******************");
                    }
                }
            }
        }.start();
    }
}

class EvenNumberPrint extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " 打印偶数：" + i);
                System.out.println("-------------------");
            }
        }
    }
}

class OddNumberPrint extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 打印奇数：" + i);
//                System.out.println("******************");
            }
        }
    }
}
