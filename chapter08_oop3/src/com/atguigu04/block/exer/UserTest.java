package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 16:23
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("chloe", "88888");

        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());

    }
}
