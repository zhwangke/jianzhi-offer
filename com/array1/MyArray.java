package com.array1;

/**
 * @Author: WK
 * @Data: 2019/6/21 18:31
 * @Description: com.array1
 */
public class MyArray {
    /**
     * 用于存储数据的数组
     */
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    /**
     * 获取数组长度的方法
     *
     * @return
     */
    public int size() {
        return elements.length;
    }

    /**
     * 往数组末尾添加一个元素
     */
    public void add(int element) {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        //把原来的数组元素复制到新的数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把添加的元素放入新的数组中
        newArr[elements.length] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }

    /**
     * 删除元素
     */
    public void remove(int index) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length - 1];
        //复制数据到新数组
        for (int i = 0; i < newArr.length; i++) {
            //想要删除的元素前面的元素
            if (i < index) {
                newArr[i] = elements[i];
                //后半部分元素后移赋值给新数组
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        //新数组替换旧数组
        elements = newArr;
    }

    /**
     * 打印所有元素到控制台
     */
    public void show() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    /**
     * 获取某个元素(跟删除操作一致 其实是获取某个下标的元素)
     */
    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    /**
     * 插入一个元素到指定位置
     */
    public void insert(int index, int element) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        //插入新元素
        newArr[index] = element;
        elements = newArr;
    }

    /**
     * 替换指定位置的元素
     */
    public void set(int index, int element) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

    /**
     * 线性查找
     */
    public int search(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }
    /**
     * 二分法查找
     */
    public int binarySearch(int target){
        //开始位置
        int low = 0;
        //结束位置
        int hig = elements.length-1;
        //中间位置
        int mid = (low+hig)/2;
        //循环多少次？不知道 用while
        while (true){
            //什么情况下没有这个元素
            if (low>=hig){
                return -1;
            }


            //先判断中间位置是不是目标元素
            if (elements[mid]==target){
                //如果是就记录目标元素位置，结束循环
                return mid;
            }else{//中间元素不是目标元素(重新定义开始 结束 中间 的位置)
                //判断中间元素是不是比目标元素大
                if (elements[mid]>target){
                    hig=mid-1;
                }else {
                    low = mid+1;
                }
                mid = (low+hig)/2;
            }
        }
    }
}

