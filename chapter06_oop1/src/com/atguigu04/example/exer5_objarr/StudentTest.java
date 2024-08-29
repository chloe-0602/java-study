package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 * *      创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * *      问题一：打印出3年级(state值为3）的学生信息。
 * *      问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 0:07
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = i;
            stus[i].state = (int) (Math.random() * 6) + 1;
            stus[i].score = (int) (Math.random() * 101);
        }

        for (int i = 0; i < stus.length; i++) {
            if (3 == stus[i].state) {
                System.out.println(stus[i].show());
            }
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].show());
        }
    }
}
