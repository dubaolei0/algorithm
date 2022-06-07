package algorithm.greedy;

import java.lang.ref.SoftReference;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName isSubsequence.java
 * @Description 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/is-subsequence
 * 示例1：
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 * 示例2：
 * 输入：s = "axc", t = "ahbgdc"
 * 输出：false
 * @createTime 2022年06月07日 22:50:00
 */
public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean result = result(s, t);
        System.out.println(result);
    }

    /**
     * 贪心算法
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean result(String s, String t) {
        // 声明两个变量，用于字符数组下标
        int i = 0;
        int j = 0;
        // 声明两个变量，用于跳出循环、判断结果
        int m = s.length();
        int n = t.length();
        // 如果大里面有小，则都移，如果没有小的，则固定小只移大
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;
    }
}
