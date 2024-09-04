package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowRunnableTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 9:26
 * @Version 1.0
 */
public class WindowRunnableTest {
    public static void main(String[] args) {
        WindowRunnable runnable = new WindowRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowRunnable implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){

                System.out.println(Thread.currentThread().getName()+ "卖出：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
