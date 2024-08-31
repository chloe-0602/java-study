package com.atguigu03._extends.exer1;

/**
 * ClassName: Kid
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/31 14:30
 * @Version 1.0
 */
public class Kids extends ManKind{
    int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("yearsOld: "+ yearsOld);
    }
}
