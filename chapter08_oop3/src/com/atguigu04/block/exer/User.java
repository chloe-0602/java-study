package com.atguigu04.block.exer;

/**
 * ClassName: User
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 14:43
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        this.registrationTime = System.currentTimeMillis();
    }
    public User() {
        this.userName = System.currentTimeMillis()+"";
        password="123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo(){
        return "用户名："+userName+
                ", 密码："+password+
                "，注册时间："+ registrationTime;
    }
}
