package com.atguigu3.common_algorithm.exer3;

/**
 * ClassName: YanghuiTest
 * Package: com.atguigu3.common_algorithm.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/28 0:16
 * @Version 1.0
 */
public class YanghuiTest {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];

        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = yanghui[i][i]= 1;

            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
            }
            System.out.println();
        }

        //遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
