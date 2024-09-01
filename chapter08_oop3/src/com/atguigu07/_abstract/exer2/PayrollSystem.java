package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 22:57
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("Herry", 1001, new MyDate(1997,5,29), 30000);
        employees[1] = new HourlyEmployee("Cherry", 1002, new MyDate(1996,6,2), 30000, 40);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本月月份：");
        int currMonth = scanner.nextInt();

        for (int i = 0; i < employees.length; i++) {

            if(currMonth==employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐，工资增加100！");
            }
            System.out.println(employees[i].toString());
        }
        scanner.close();
    }

}
