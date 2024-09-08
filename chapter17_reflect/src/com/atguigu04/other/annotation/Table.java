package com.atguigu04.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Table
 * Package: com.atguigu04.other.annotation
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/9 0:03
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String name() default "aaa";
}
