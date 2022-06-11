package algorithm.array;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName moveZeroes.java
 * @Description 移动零【数组类】    https://leetcode.cn/problems/move-zeroes/description/
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例1：
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @createTime 2022年06月11日 21:43:00
 */
public class moveZeroes {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 0, 3, 12};
        int[] result = moveZeroes(ints);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] moveZeroes(int[] ints) {
        //遍历数组，将不等于0的覆盖掉当前数组
        int j = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                ints[j] = ints[i];
                j++;
            }
        }
        // 剩下的都填补0
        for (int m = j; m < ints.length; m++) {
            ints[m] = 0;
        }
        return ints;
    }
}
