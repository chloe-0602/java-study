package com.atguigu05.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public void print(int ...nums){
        System.out.println("1111");

        for (int i = 0; i < nums.length; i++) { // 其实就是数组
            System.out.print(nums[i] + "\t");
        }
    }

    public void print(int i){
        System.out.println("222");
    }
    public void print(int i, int ...nums){ // 可变个数的形参必须声明在形参列表的最后
        // 编译器可以分出来，但是会乱，所以print(1,2,3,4)报错
        System.out.println("3333");
    }

//    public void print(int[] nums){
// 特例：可变个数形参的方法与同一个类中方法名相同，
// 且与可变个数形参的类型相同的数组参数不构成重载。
//        System.out.println("3333");
//    }
//
}
