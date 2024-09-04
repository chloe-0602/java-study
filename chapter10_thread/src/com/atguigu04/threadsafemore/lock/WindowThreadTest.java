package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowThreadTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 9:40
 * @Version 1.0
 */
public class WindowThreadTest {
    public static void main(String[] args) {
        WindowThread w1 = new WindowThread();
        WindowThread w2 = new WindowThread();
        WindowThread w3 = new WindowThread();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class WindowThread extends Thread{
    private static int ticket = 100;
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+ "卖出：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            } finally {

                lock.unlock();
            }
        }
    }
}
