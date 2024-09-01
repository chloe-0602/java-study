package com.atguigu08._interface.exer1;

/**
 * ClassName: American
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 23:44
 * @Version 1.0
 */
public class American implements Eatable{
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
