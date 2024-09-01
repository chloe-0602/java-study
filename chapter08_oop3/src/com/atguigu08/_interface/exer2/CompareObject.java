package com.atguigu08._interface.exer2;

/**
 * ClassName: CompareObject
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 23:47
 * @Version 1.0
 */
interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}