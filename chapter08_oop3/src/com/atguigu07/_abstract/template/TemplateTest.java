package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateTest
 * Package: com.atguigu07._abstract.template
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 22:27
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber printPrimeNumber = new PrintPrimeNumber();
        printPrimeNumber.spendTime();
    }
}

abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end - start) +"ms");
    }

    public abstract void code();
}

class PrintPrimeNumber extends Template{

    @Override
    public void code() {
        for (int i = 2; i < 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println("质数："+ i);
            }
        }
    }
}
