package com.atguigu05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Package: com.atguigu05.communication
 * Description:
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 15:35
 * @Version 1.0
 */

/**
 * 店员(Clerk)
 *      店员一次只能持有固定数量的产品(比如:20）
 *
 *      如果生产者试图生产更多的产品，店员会叫生产者停一下
 *      如果店中有空位放产品了再通知生产者继续生产
 *      如果店中没有产品了，店员会告诉消费者等一下
 *      如果店中有产品了再通知消费者来取走产品
 */
class Clerk {
    private int productNum = 0;
    private final static int MAX_PRODUCT_NUM = 20;

    public synchronized void addProduct() {

        if (productNum >= MAX_PRODUCT_NUM) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "-生产者生产第 " + productNum + " 个产品");

            notifyAll();
        }

    }

    public synchronized void minusProduct() {
        if(productNum<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{

            System.out.println(Thread.currentThread().getName() + "-消费者消费第 " + productNum + " 个产品");
            productNum--;
            notifyAll();
        }
    }
}

class Producer extends Thread {

    private Clerk clerk;

    public Producer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("生产者开始生产...");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.addProduct();
        }
    }
}

class Consumer extends Thread {

    private Clerk clerk;

    public Consumer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    public void run() {
        while (true){
            System.out.println("消费者开始消费...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clerk.minusProduct();
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer1 = new Producer(clerk, "Producer-01");
        Consumer consumer1 = new Consumer(clerk, "Consumer-01");
        Consumer consumer2 = new Consumer(clerk, "Consumer-02");

        producer1.start();
        consumer1.start();
        consumer2.start();
    }
}
