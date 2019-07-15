package Jianz.Offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: WK
 * @Data: 2019/7/2 18:46
 * @Description: Jianz.Offer
 */
public class GetLeastNumbers {
    /**
     * 输入n个整数，找出其中最小的K个数。
     * 例如输入7,4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     */
    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(input, 9);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        if (k>input.length){
            return arrayList;
        }
        for (int i = 0; i < input.length-1; i++) {
            for (int j=0;j<input.length-1-i;j++){
                if (input[j]>input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
