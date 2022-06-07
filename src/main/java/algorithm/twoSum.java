package algorithm;

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
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + "分割" + ints[1]);
    }

    /**
     * map中key存放的是数组值，value是数组值对应的数组下标
     *
     * @param nums   数组
     * @param target 和
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap();
        for (int i = 0; i < nums.length; i++) {
            if (concurrentHashMap.containsKey(target - nums[i])) {
                return new int[]{i, concurrentHashMap.get(nums[i])};
            }
            concurrentHashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("参数异常");
    }


}
