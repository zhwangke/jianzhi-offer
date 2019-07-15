package com.sort;

import java.util.Arrays;

/**
 * @Author: WK
 * @Data: 2019/6/26 23:23
 * @Description: com.sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = new int []{2,0,1,6,6,1,8};
        //外循环 遍历多少轮
        for (int i = 0; i < arr.length-1; i++) {
//            System.out.println(arr[i]);
            //每轮遍历多少次
            for (int j = 0;j<arr.length-1-i;j++){//每次确定一个元素的位置
                //如果前一个大于后就交换位置
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            }
        System.out.println(Arrays.toString(arr));
        }
}
