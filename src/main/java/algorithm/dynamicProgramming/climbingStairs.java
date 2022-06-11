package algorithm.dynamicProgramming;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName climbingStairs.java
 * @Description 爬楼梯[动态规划]   https://leetcode.cn/problems/climbing-stairs/
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 示例1：
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * @createTime 2022年06月11日 20:57:00
 */
public class climbingStairs {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(climbingStairs(num));
    }

    /**
     * case 1: result = 1; break;
     * case 2: result = 2; break;
     * case 3: result = 3; break;
     * case 4: result = 5; break;
     * case 5: result = 8; break;
     * case 6: result = 13; break;
     * case 7: result = 21; break;
     * case 8: result = 34; break;
     * case 9: result = 55; break;
     * case 10: result = 89; break;
     *
     * @param num
     * @return
     */
    public static int climbingStairs(int num) {
        if (num <= 2) {
            return num;
        }
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= num; i++) {
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }

        return i2;
    }
}
