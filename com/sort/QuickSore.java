package com.sort;

import java.util.Arrays;

/**
 * @Author: WK
 * @Data: 2019/6/26 23:50
 * @Description: com.sort
 */
public class QuickSore {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = new int []{9,0,1,6,6,1,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int start,int end) {
        /**
         * 当开始位置比结束位置小的时候才需要进行排序
         */
        if (start < end) {
            //定义一个标准数
            int stand = arr[start];
            //记录需要排序的下标
            int low = start;
            int hig = end;
            //循环找出比标准数大的数和比标准数小的数
            while (low<hig){
                //右边的数字比标准数大
                while (low<hig&&arr[hig]>=stand){
                    hig--;
                }
                //
                arr[low] = arr[hig];
                //左边的数字比标准数小
                while (low<hig&&arr[low]<=stand){
                    low++;
                }
                //使用左边的数字替换右边的数字
                arr[hig] = arr[low];
            }
            arr[low] = stand;
            //对标准数左边的数进行快排
            quickSort(arr,start,low);
            //对标准数右边的数进行快排
            quickSort(arr,low+1,hig);
        }
    }

}
