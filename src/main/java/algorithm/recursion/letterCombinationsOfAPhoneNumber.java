package algorithm.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dubaolei
 * @version 1.0.0
 * @ClassName letterCombinationsOfAPhoneNumber.java
 * @Description 电话号码的字母组合   https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * @createTime 2022年06月13日 22:55:00
 */
public class letterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    /**
     *
     * @param combinations 返回值
     * @param phoneMap     电话Map
     * @param digits       输入数字
     * @param index        用来控制哪个按键  0  1
     * @param combination
     */
    private static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            // 输入按键的数字
            char dight = digits.charAt(index);
            // 获取按键上的英文
            String letters = phoneMap.get(dight);
            // 按键英文上的长度
            int lettersCount = letters.length();
            // 以第一个按键为维度，进backtrack，遍历第二个按键三个，index为1。 执行完backtrack则跳出，执行deleteCharAt还是0
            // 总共有两个for循环，第一个按键是一个，以第一个按键为维度匹配的第二个为维度是第二个for
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index+1, combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
