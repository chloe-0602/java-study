package com.atguigu02.selfdefine.exer1;

import org.junit.Test;

import java.util.List;

/**
 * ClassName: DAOTest
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 19:36
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test(){
        DAO<User> dao = new DAO<>();
        dao.save("1", new User(1001, "Jimmy"));
        dao.save("2", new User(1002, "Tom"));

        dao.update("1", new User(1003, "Hello"));

        dao.delete("1");

        List<User> list = dao.list();
        for(User user:list){
            System.out.println(user);
        }
    }
}
