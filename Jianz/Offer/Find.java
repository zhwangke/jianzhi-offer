package Jianz.Offer;

/**
 * @Author: WK
 * @Data: 2019/7/9 16:36
 * @Description: Jianz.Offer
 */
public class Find {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public static void main(String[] args) {
        int[][] array = {{2,6},{1,8,9},{4,5,8}};

        boolean b = find(1,array);
        System.out.println(b);

    }
    public static boolean find(int target, int [][] array){
        //确定数组长度
        for (int i = 0; i < array.length; i++) {
            //利用二分查找 定义变量 low high mid
            int low = 0 ;
            //定义每一个一维数组的长度(查询多少轮)
            int high = array[i].length-1;
            //开启循环遍历查找 查找到目标元素返回true
            int mid = (low+high)/2;
            while (low<=high){
                if (target==array[i][mid]){
                    return true;
                }
                if (target<array[i][mid]){
                    high = mid-1;
                }else if (target>array[i][mid]){
                    low = mid+1;
                }else {
                    //如果查询到目标元素返回true
                    return true;
                }
                mid = (low+high)/2;
            }
        }
        //查找失败
        return false;
    }
}
