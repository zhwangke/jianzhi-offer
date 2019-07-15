package Jianz.Offer;

/**
 * @Author: WK
 * @Data: 2019/6/28 14:02
 * @Description: Jianz.Offer
 */
public class JumpFloorTest {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * n = 1 2 3 4 5
     * 1 2 3 7 14
     * 1 1 2 3 5
     * 可以为求前n项斐波那契数列的和
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = JumpFloor(9);
        System.out.println("floor:"+i);

    }

    public static int JumpFloor(int target) {
        if (target<=2){
            return target;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
