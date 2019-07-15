package com.queue;

/**
 * @Author: WK
 * @Data: 2019/6/21 23:37
 * @Description: com.queue
 */
public class MyQueue {
    int[] elements;

    public MyQueue(){
        //构造一个空队列
        elements = new int[0];
    }
    /**
     * 入队
     */
    public void add(int element){
        //创建一个新数组
        int[] newArr = new int[elements.length+1];
        //把原来数组的元素复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //添加新的元素
        newArr[elements.length] = element;
        //新数组替换旧数组
        elements = newArr;
    }
    /**
     * 出队
     */
    public int poll(){
        //
        if (elements.length==0){
            throw new RuntimeException("Queue is Empty!!");
        }
        int element = elements[0];
        int[] newArr = new int[elements.length-1];
        //把原来数组中除了第一个元素都复制给新数组
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        elements = newArr;
        return element;
    }
    /**
     * 查看队头元素
     */
    public int peek(){
        if (elements.length==0){
            throw new RuntimeException("Queue is Empty!!");
        }
        return elements[0];
    }
}
