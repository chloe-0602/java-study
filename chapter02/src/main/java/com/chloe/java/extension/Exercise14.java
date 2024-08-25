package com.chloe.java.extension;

/**
 * 历史中，刘关张桃园三结义大家非常熟悉了。现有三个童鞋，年龄如下：
 * 刘小备：23岁
 * 关小羽：22岁
 * 张小飞：21岁
 * 获取三人中最大的年龄
 */
public class Exercise14 {
    public static void main(String[] args) {
        int liuXiaoBei = 23;
        int guanXiaoYu = 22;
        int zhangXiaoFei = 21;

        int tempMax = (liuXiaoBei > guanXiaoYu)? liuXiaoBei: guanXiaoYu;
        int maxAge = (zhangXiaoFei > tempMax)? zhangXiaoFei: tempMax;

        System.out.println("三人中最大的年龄是：" + maxAge);
    }
}
