package com.search;

import com.array1.MyArray;

/**
 * @Author: WK
 * @Data: 2019/6/21 22:55
 * @Description: com.search
 */
public class TestArraySearch {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        //调用线性查找
        int i = myArray.search(6);
        System.out.println("index:"+i);
        System.out.println("------------");
        //调用二分查找
        int index = myArray.binarySearch(6);
        System.out.println("index:"+index);
    }
}
