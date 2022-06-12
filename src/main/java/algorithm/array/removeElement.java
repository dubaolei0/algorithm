package algorithm.array;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName removeElement.java
 * @Description 移除元素    https://leetcode.cn/problems/remove-element/description/
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
 * @createTime 2022年06月12日 22:40:00
 */
public class removeElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int count = 2;
        System.out.println(removeElement(nums, count));

    }

    /**
     * 思路：遍历数组，如果当前不相等，则放在i的位置
     *
     * @param nums
     * @param count
     * @return
     */
    public static int removeElement(int[] nums, int count) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != count) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
