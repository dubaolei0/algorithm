package algorithm.doublePointer;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName easy.java
 * @Description 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @createTime 2022年06月07日 10:59:00
 */
public class twoSum {
    public static void main(String[] args) {
        int target = 13;
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = twoSumTwo(nums, target);
        System.out.println("数组下标1："+ints[0] + "分数组下标2" + ints[1]);
    }

    /**
     * 方法1：hash表的形式
     * map中key存放的是数组值，value是数组值对应的数组下标
     * 数组中的元素最多遍历一次，时间复杂度为 O(n)  , 空间复杂度为O(n)，空间主要是哈希表的开销
     *
     * @param nums   数组
     * @param target 两数之和
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap();
        for (int i = 0; i < nums.length; i++) {
            if (concurrentHashMap.containsKey(target - nums[i])) {
                return new int[]{i, concurrentHashMap.get(target - nums[i])};
            }
            concurrentHashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("参数异常");
    }

    /**
     * 这个是双指针的解法，一个指针i在数组的最前面，一个指针j在数组的最后面。双指针得提前排序一下 : Arrays.sort(array)
     * 如果两个指针之和相等了返回
     * 如果两个指针之和小于target，就把指针i向右移动，因为这样指针i的元素值就可以变大嘛
     * 如果两个指针之和大于target，就把指针j向左移动，因为这样指针j的元素值就可以变小
     * 数组中的元素最多遍历一次，时间复杂度为 O(N)。只使用了两个额外变量，空间复杂度为 O(1)
     * @param nums  数组
     * @param target  两数之和
     * @return
     */
    public static int[] twoSumTwo(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException("参数异常");
    }
}
