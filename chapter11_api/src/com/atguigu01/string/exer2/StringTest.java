package com.atguigu01.string.exer2;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: com.atguigu01.string.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 23:56
 * @Version 1.0
 */
public class StringTest {

    /**
     * 题目1：模拟一个trim方法，去除字符串两端的空格。
     */
    @Test
    public void test1() {
        String str = "  he llo  ";
        System.out.println(newTrim(str));

        String str1 = "     ";
        System.out.println(newTrim(str1));
    }

    private String newTrim(String str) {
        if (str != null) {
            int start = 0;
            int end = str.length() - 1;
            while (start < end && str.charAt(start) == ' ') {
                start++;
            }
            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {//还是需要处理的，不然有个空格
                return "";
            }
            return str.substring(start, end + 1);
        }
        return null;
    }

    /**
     * 题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
     * 比如"abcdefg"反转为"abfedcg"
     */
    @Test
    public void test2() {
        String str = "abcdefg";
        System.out.println(reverse(str, 2, 5));
        System.out.println(reverse1(str, 2, 5));

    }

    public static String reverse(String str, int fromIndex, int toIndex) {
        char[] charArray = str.toCharArray();
        for (int i = fromIndex, j = toIndex; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }

    public static String reverse1(String str, int fromIndex, int toIndex) {
        String str1 = "";
        str1 += str.substring(0, fromIndex);
        for (int i = toIndex; i >= fromIndex; i--) {
            str1 += str.charAt(i);
        }
        str1 += str.substring(toIndex + 1);
        return str1;
    }

    /**
     * 题目3：获取一个字符串在另一个字符串中出现的次数。
     * 比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
     */
    @Test
    public void test3() {
        String str = "abkkcadkabkebfkabkskab";
        String subStr = "ab";

        int count = strContainsCount(str, subStr);
        System.out.println(count);
    }

    private int strContainsCount(String str, String subStr) {
        int count = 0;

        if (str.length() >= subStr.length()) {
            int index = str.indexOf(subStr);
            while (index >= 0) {
                count++;
                index = str.indexOf(subStr, index + subStr.length());
            }
        }

        return count;
    }

    /**
     * 题目5：对字符串中字符进行自然顺序排序。
     * 提示：
     * 1）字符串变成字符数组。
     * 2）对数组排序，选择，冒泡，Arrays.sort();
     * 3）将排序后的数组变成字符串。
     */
    @Test
    public void test5() {
        String str = "aba";
        String str1 = mySort(str);
        System.out.println(str1);
    }

    private String mySort(String str) {
        /**
         * 冒泡
         */
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            boolean isFlag = true;
            for (int j = 0; j < charArray.length-1-i; j++) {
                if (charArray[i]>charArray[i+1]){
                    char temp = charArray[i];
                    charArray[i] = charArray[i+1];
                    charArray[i+1] = temp;

                    isFlag = false;
                }

                if (isFlag){
                    break;
                }
            }
        }
        return new String(charArray);
    }
}
