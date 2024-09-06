package com.atguigu01.datastruc;

import org.junit.Test;

/**
 * ClassName: StackQueueTest
 * Package: com.atguigu01.datastruc
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 23:39
 * @Version 1.0
 */
public class StackQueueTest {
    @Test
    public void testStack(){
        Stack stack = new Stack(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    }

    @Test
    public void testQueue(){
        Queue queue = new Queue(10);
        queue.add(12);
        queue.add(13);
        queue.add(14);

        System.out.println(queue);

        queue.get();

        System.out.println(queue);
    }

}
