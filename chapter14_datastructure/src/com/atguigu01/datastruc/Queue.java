package com.atguigu01.datastruc;

/**
 * ClassName: Queue
 * Package: com.atguigu01.datastruc
 * Description:
 * 数组实现Queue
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 23:32
 * @Version 1.0
 */
public class Queue {
    Object[] values;
    int size;

    public Queue(int length) {
        values = new Object[length];
    }

    public void add(Object ele) {
        if (size >= values.length) {
            throw new RuntimeException("queue is over, cannot add element...");
        }

        values[size] = ele;
        size++;
    }

    public Object get() {
        if (size <= 0) {
            throw new RuntimeException("queue is empty, cannot get element...");
        }
        Object value = values[0];
        for (int i = 0; i < size - 1; i++) {
            values[i] = values[i+1];
        }
        values[size-1] = null;
        size--;
        return size;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += values[i] + "\t";
        }
        return res;
    }
}
