package com.atguigu05.communication;

/**
 * ClassName: PrinNumberTest
 * Package: com.atguigu05.communication
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 14:49
 * @Version 1.0
 */
public class PrinNumberTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread t1 = new Thread(printNumber, "线程1");
        Thread t2 = new Thread(printNumber, "线程2");

        t1.start();
        t2.start();
    }
}

class PrintNumber implements Runnable {

    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    break;
                }
            }
        }
    }
}
