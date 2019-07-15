package com.stack;

import com.array1.MyArray;

/**
 * @Author: WK
 * @Data: 2019/6/21 23:13
 * @Description: com.stack
 */
public class MyStack {
    //栈的底层是用数组存储数据
    int[] elements;

    public MyStack(){
        elements = new int[0];
    }
    //压入元素
    public void push(int element){
        //创建一个新数组
        int[] newArr = new int[elements.length+1];
        //复制数组元素
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //添加的元素放入新数组中
        newArr[elements.length] = element;
        //新数组替换旧数组
        elements = newArr;
    }
    /**
     * 取出栈顶元素
     *
     */
    public int pop(){
        if (elements.length==0){
            throw new RuntimeException("Stack is Empty!");
        }
        //取出数组最后一个元素
        int element = elements[elements.length-1];
        //创建一个新的数组
        int[] newArr = new int[elements.length-1];
        //遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        //返回栈顶元素
        return element;
    }
    /**
     * 查看栈顶元素
     */
    public int peek(){
        return elements[elements.length-1];
    }
    /**
     * 查看栈是否为空
     */
    public boolean isEmpty(){
        return elements.length==0;
    }
}
