package com.atguigu04.threadsafemore.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 11:46
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank {
    private Bank() {
    }

    private static volatile Bank instance = null;

    // 线程安全的方式1

/*
    public synchronized static Bank getInstance() { //同步监视器，Bank.class
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            instance = new Bank();
        }
        return instance;
    }
*/
    // 线程安全的方式2

/*    public static Bank getInstance() { //同步监视器，Bank.class
        synchronized (Bank.class) {
            if (instance == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                instance = new Bank();
            }
        }
        return instance;
    }*/

    /**
     *     //实现线程安全的方式3:
     *     相较于方式1和方式2来讲，效率更高。
     *     为了避免出现指令重排，需要将instance声明为volatile
     * @return
     */
    public static Bank getInstance() { //同步监视器，Bank.class
        if(instance == null){
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}