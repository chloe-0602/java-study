package com.atguigu02.method_lifecycle.exer;

/**
 * ClassName: HappyNewYear
 * Package: com.atguigu02.method_lifecycle.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/4 10:14
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i>0){
                System.out.println(i);
            }else{
                System.out.println("Happ New Year!");
            }
        }
    }
}
