package com.queue;

/**
 * @Author: WK
 * @Data: 2019/6/22 0:00
 * @Description: com.queue
 */
public class TestMyQueu {
    public static void main(String[] args) {
        //创建一个队列
        MyQueue myQueue = new MyQueue();
        //入队
        myQueue.add(9);
        myQueue.add(6);
        myQueue.add(1);
        myQueue.add(8);
        //出队
        System.out.println("--出队--");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());

        System.out.println(myQueue.peek());

    }
}
