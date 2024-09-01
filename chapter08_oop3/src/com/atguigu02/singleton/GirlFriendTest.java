package com.atguigu02.singleton;

/**
 * ClassName: GirlFriendTest
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 13:58
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}

class GirlFriend{
    // 1. 私有化构造器
    private GirlFriend(){

    }

    //2. 创建instance
    //4.加static作为静态属性
    private static GirlFriend instance = null;

    // 3.创建方法, 加static
    public static GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }

        return instance;
    }
}
