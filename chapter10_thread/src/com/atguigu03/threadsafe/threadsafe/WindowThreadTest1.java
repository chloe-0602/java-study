package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: WindowThreadTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *      使用synchronized 实现方法的线程安全
 * @Author Xu, Luqin
 * @Create 2024/9/4 9:40
 * @Version 1.0
 */
public class WindowThreadTest1 {
    public static void main(String[] args) {
        WindowThread1 w1 = new WindowThread1();
        WindowThread1 w2 = new WindowThread1();
        WindowThread1 w3 = new WindowThread1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class WindowThread1 extends Thread{
    private static int ticket = 100;
    private static boolean isFlag= true;
    @Override
    public void run() {
        while (isFlag){
            saleTicket();
        }
    }

//    public synchronized void saleTicket(){ // 此时的 同步监视器是 this. !!!!线程不安全
    public synchronized static void saleTicket(){ // 此时的 同步监视器是 WindowThread1.class 唯一线程安全
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+ "卖出：" + ticket);
            ticket--;
        }else{  
            isFlag = false;
        }
    }
}
