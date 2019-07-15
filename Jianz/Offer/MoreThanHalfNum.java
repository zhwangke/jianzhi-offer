package Jianz.Offer;

/**
 * @Author: WK
 * @Data: 2019/7/2 19:50
 * @Description: Jianz.Offer
 */
public class MoreThanHalfNum {
    /**
     *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        int i = MoreThanHalfNum_Solution(array);
        System.out.println(i);

    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int k = array.length/2;
        int count = 1;
        for (int i = 0; i < array.length-1; i++) {
            for (int j=0;j<array.length-1-i;j++){
                if (array[i]==array[j]){
                    System.out.println(array[i]+":"+(count++));

                }
            }
        }
        if (count<k){
            return 0;
        }
        return count;
    }

}
