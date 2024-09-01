package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Description:
 *
 * @Author Xu,Luqin
 * @Create 9:28
 * @Version 1.0
 */
public class Exer4 {

    public static void main(String[] args) {

        Exer4 exer = new Exer4();
        exer.meeting(new Man(),new Woman(),new Man());

    }

    public void meeting(Person ... ps){

        for (int i = 0; i < ps.length; i++) {

            ps[i].eat();
            ps[i].toilet();

            if(ps[i] instanceof Woman){

                Woman woman = (Woman)ps[i];
                woman.makeup();

            }else if(ps[i] instanceof Man){
                Man man = (Man)ps[i];
                man.smoke();
            }

//            if(ps[i] instanceof Object){
//
//            }
            //编译不通过 -> 基于Person来做的，String和Person没关系
//            if(ps[i] instanceof String){
//
//            }

            System.out.println();
        }

    }
}
