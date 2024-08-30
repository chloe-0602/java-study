package com.atguigu01._this.exer1;

/**
 * ClassName: Exer1
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 0:28
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        Boy boy = new Boy("Jack", 24);
        Girl girl = new Girl("Marry", 22);
        girl.marry(boy);
        int compare = girl.compare(new Girl("Zoe", 21));
        System.out.println(compare);
        boy.shout();
    }
}
