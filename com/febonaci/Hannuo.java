package com.febonaci;
/**
 * @Author: WK
 * @Data: 2019/6/24 21:02
 * @Description: com.febonaci
 */
public class Hannuo {
    public static void main(String[] args) {
        handle(3,'A','B','C');
    }
        /**
         * n 共有n个盘子
         * from 开始的柱子
         * in 中间的柱子
         * to 目标柱子
         */
    public static void handle(int n,char from,char in,char to){
        if (n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else{
            /**
             * 无论多少盘子都认为只有两个盘子 上面的所有盘子和最小面的一个盘子
             *
             * 思路： 1.先把开始位置上面的全移到中间
             *       2.再把开始位置最下面的一个移到目标
             *       3.最后把中间位置的所有移到目标
             */

            //移动上面所有的盘子到中间位置
            handle(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);


            //把中间位置的所有盘子移动到目标位置
            handle(n-1,in,from,to);


        }
    }
}
