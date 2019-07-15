package Jianz.Offer;

import java.util.Scanner;

/**
 * @Author: WK
 * @Data: 2019/6/28 13:37
 * @Description: Jianz.Offer
 */
public class Fibonacci {
    /**
     * 题目描述
       大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
        n<=39
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int fib = fib(sc.nextInt());
        System.out.println(fib);

    }
    public static int fib(int n){
        /**
         * 0 1 1 2 3 5 8 13
         */
        if (n==0){
            return 0;
        }else {
            if (n==1 || n==2){
                return 1;
            }else {
                return fib(n-2)+fib(n-1);
            }
        }

    }
}
