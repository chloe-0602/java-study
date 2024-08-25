package com.chloe.java.demo;

/**
 * 测试 字符类型： char
 *     和
 *     布尔类型： boolean
 */
public class VariableTest2 {
    public static void main(String[] args) {
//        **形式1：**使用单引号(' ')括起来的`单个字符`。 有且只能有一个
        char c1 = 'a';
        char c2 = '中';
        char c3 =  '9';
        char c4 = '%';

//        char c6 = ''; 错误

        //**形式2：**直接使用 `Unicode值`来表示字符型常量：。其中，XXXX代表一个十六进制整数。
        //
        //例如：\u0023 表示 '#'。
        char c7 = '\u0023';
        System.out.println(c7);

        char c8 = 97;
        System.out.println(c8);

        char c12 = '1';
        char c13 = 1;
        System.out.println(c12 + ", " + c13);

        // 2. 布尔类型：boolean
    }
}
