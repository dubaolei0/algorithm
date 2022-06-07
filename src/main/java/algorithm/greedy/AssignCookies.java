package algorithm.greedy;

import java.util.Arrays;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName AssignCookies.java
 * @Description 分发饼干
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * <p>
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/assign-cookies
 * 输入: g = [1,2,3], s = [1,1]
 * 输出: 1
 * 解释:
 * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
 * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
 * 所以你应该输出1。
 * <p>
 * 输入: g = [1,2], s = [1,2,3]
 * 输出: 2
 * 解释:
 * 你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
 * 你拥有的饼干数量和尺寸都足以让所有孩子满足。
 * 所以你应该输出2.
 * @createTime 2022年06月07日 23:25:00
 */
public class AssignCookies {

    public static void main(String[] args) {
        // 孩子胃口
        int[] g = new int[]{1, 2, 3};
        // 饼干尺寸
        int[] s = new int[]{1, 2};
        int i = assignCookies(g, s);
        System.out.println(i);

    }

    /**
     * 贪心的思想是，用尽量小的饼干去满足小需求的孩子，所以需要进行排序先
     * @param g   孩子胃口
     * @param s   饼干尺寸
     * @return
     */
    public static int assignCookies(int[] g, int[] s) {
        // 升序排序
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++; //当用当前饼干可以满足当前孩子的需求，可以满足的孩子数量+1
            }
            cookie++; //饼干只可以用一次，因为饼干如果小的话，就是无法满足被抛弃，满足的话就是被用了
        }
        return child;
    }
}
