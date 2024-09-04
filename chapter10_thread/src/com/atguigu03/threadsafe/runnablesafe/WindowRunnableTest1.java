package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowRunnableTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *   使用synchronized 实现方法的线程安全
 * @Author Xu, Luqin
 * @Create 2024/9/4 9:26
 * @Version 1.0
 */
public class WindowRunnableTest1 {
    public static void main(String[] args) {
        WindowRunnable1 runnable = new WindowRunnable1();
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

class WindowRunnable1 implements Runnable{
    private int ticket = 100;
    private boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag){
            saleTicket();
        }
    }

    public synchronized void saleTicket(){ // 此时默认的同步监视器是this
        if(ticket>0){

            System.out.println(Thread.currentThread().getName()+ "卖出：" + ticket);
            ticket--;
        }else{
            isFlag=false;
        }
    }
}
