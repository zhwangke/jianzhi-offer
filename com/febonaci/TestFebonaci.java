package com.febonaci;

import java.util.Scanner;

/**
 * @Author: WK
 * @Data: 2019/6/24 20:21
 * @Description: com.febonaci
 */
public class TestFebonaci {

    public static void main(String[] args) {
        //打印斐波那契 1 1 2 3 5 8 13
        int sum = 0;
        for (int i = 7;i>=1;i--){
            sum += feb(i);
        }
        System.out.println(sum);
    }
    public static int feb(int i){
        if (i==1|| i==2){
            return 1;
        }else {
            return feb(i-1)+feb(i-2);
        }
    }
}