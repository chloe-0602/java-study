package com.chloe.java.extension;

/**
 * 将整数60手动转换为十六进制（难）
 */
public class Exercise15 {
    public static void main(String[] args) {
        int num = 60;
        int j1 = num & 15;
        String s1 = (j1 > 9) ? (char) (j1 - 10 + 'A') + "": j1 + ""; // 取出了最低的4位对应的字符

        int j2 = (num >>> 4) & 15;
        String s2 = (j2 > 9) ? (char) (j2 - 10 + 'A') + "" : j2 + "";//取出了次最低的4位对应的字符

        System.out.println(s2 + s1);

    }
}
