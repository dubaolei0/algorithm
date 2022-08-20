package algorithm.array;

import java.util.Arrays;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName removeDuplicatesFromSortedArray.java
 * @Description 删除数组中的重复项   https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * <p>
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * <p>
 * 将最终结果插入nums 的前 k 个位置后返回 k 。
 * <p>
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * @createTime 2022年06月12日 21:40:00
 */
public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i1 = removeDuplicatesFromSortedArray(ints);
        int[] ints1 = Arrays.copyOfRange(ints, 0, i1);
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
    }

    /**
     *双指针解法
     * 一个指针 j 进行数组遍历，另外一个指针 i 指向有效数组的最后一个位置。
     只有当 i 所指向的值和 j 不一致（不重复），才将 j 的值添加到 i 的下一位置。
     *
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param nums
     * @return
     */
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
