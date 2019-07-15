package com.search;

/**
 * @Author: WK
 * @Data: 2019/6/21 18:12
 * @Description: com.search
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        /**
         * 二分查找的目标数组必须是有序的
         */
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        //利用二分查找查找目标元素
        //目标元素
        int target = 9;
        //开始位置
        int low = 0;
        //结束位置
        int hig = arr.length-1;
        //中间位置
        int mid = (low+hig)/2;
        //记录目标元素位置
        int index = -1;
        //循环多少次？不知道 用while
        while (true){
            //先判断中间位置是不是目标元素
            if (arr[mid]==target){
                //如果是就记录目标元素位置，结束循环
                index = mid;
                break;
            }else{//中间元素不是目标元素(重新定义开始 结束 中间 的位置)
                //判断中间元素是不是比目标元素大
                if (arr[mid]>target){
                    hig=mid-1;
                }else {
                    low = mid+1;
                }
                mid = (low+hig)/2;
            }
        }
        System.out.println("index:"+index);
    }
}
