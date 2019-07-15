package com.search;

/**
 * @Author: WK
 * @Data: 2019/6/21 18:08
 * @Description: com.search
 */
public class TestSearch {

    public static void main(String[] args) {
        //线性查找
        int[] arr = new int[]{2,3,5,6,8,22,0};
        //目标元素
        int target = 8;
        //元素下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                index = i;
                break;
            }
        }
        //打印目标数组下表
        System.out.println(index);
    }
}
