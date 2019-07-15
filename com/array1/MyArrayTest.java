package com.array1;

/**
 * @Author: WK
 * @Data: 2019/6/21 18:36
 * @Description: com.array1
 */
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        int size = ma.size();
        System.out.println(size);
        ma.show();
        //添加元素
        ma.add(999);
        ma.add(994);
        ma.add(993);
        ma.add(991);
        System.out.println(ma.size());
        //显示元素到控制台
        ma.show();
        System.out.println("----------");
        ma.remove(1);
        ma.show();
        System.out.println("----------");
        ma.get(1);
        System.out.println("----------");
        ma.insert(1,100);
        ma.show();
        System.out.println("----替换----");
        ma.set(1,115);
        ma.show();
    }
}
