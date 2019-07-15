package com.stack;

/**
 * @Author: WK
 * @Data: 2019/6/21 23:25
 * @Description: com.stack
 */
public class TestMyStack {
    public static void main(String[] args) {
        //创建一个栈
        MyStack myStack = new MyStack();
        //压入元素
        myStack.push(4);
        myStack.push(1);
        myStack.push(0);
        myStack.push(5);
        myStack.push(7);
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println("--查看--");
        System.out.println(myStack.peek());

    }
}
