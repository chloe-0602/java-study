package com.atguigu05.api._01optional;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Package: com.atguigu05.api._01optional
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/9 23:41
 * @Version 1.0
 */
public class OptionalTest {
    @Test
    public void test1(){
        String star = "迪丽热巴";
        star = null;

        Optional<String> optional = Optional.ofNullable(star);
        String other = optional.orElse("yangmi");

        System.out.println(optional);
        System.out.println(other);
    }
}
