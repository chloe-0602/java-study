package com.atguigu01.string.exer3;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.atguigu01.string.exer3
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/5 1:10
 * @Version 1.0
 */
public class UserTest {

    @Test
    public void test() {
        User[] users = new User[3];
        users[0] = new User("songhk", "123");
        users[1] = new User("Tom", "8888");
        users[2] = new User("Jerry", "6666");
        Scanner scanner = new Scanner(System.in);

        System.out.println("库中的用户有：");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        boolean isFlag = true;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                if (users[i].getPassword().equals(password)) {
                    System.out.println("登录成功：" + users[i].getName());

                } else {
                    System.out.println("密码错误");
                }

                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("没有该用户");
        }
        scanner.close();
    }

}

class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-" + password;
    }
}
