package com.atguigu01.datastruc;

/**
 * ClassName: Stack
 * Package: com.atguigu01.datastruc
 * Description:
 *  数组实现栈
 * @Author Xu, Luqin
 * @Create 2024/9/6 23:23
 * @Version 1.0
 */
public class Stack {
    Object[] values;
    int size;

    public Stack(int length){
        values = new Object[length];
    }

    /**
     * 入栈
     * @return
     */
    public void push(Object ele){
        if(size > values.length){
            throw new RuntimeException("栈已满，无法添加");
        }
        values[size++] = ele;
    }

    /**
     * 出栈
     */
    public Object pop(){
        if(size <= 0){
            throw new RuntimeException("栈已空，无法出栈");
        }

        Object obj = values[size - 1];
//        objs[size-1] = null;
//        size--;
        values[--size] = null;

        return obj;
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
