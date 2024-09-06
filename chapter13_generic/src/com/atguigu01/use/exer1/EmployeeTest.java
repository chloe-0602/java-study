package com.atguigu01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu01.use.exer1
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 15:15
 * @Version 1.0
 */
public class EmployeeTest {
    @Test
    public void test1(){
        TreeSet<Employee> set = new TreeSet<>();

        Employee e1 = new Employee("HanMeimei",18,new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20,new MyDate(1996,11,21));
        Employee e3 = new Employee("LiLei",21,new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19,new MyDate(1997,5,31));
        Employee e5 = new Employee("ZhangYi",23,new MyDate(2001,11,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                int yearDistinct = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                if (yearDistinct != 0){
//                    return yearDistinct;
//                }
//
//                int monthDistinct = o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
//                if (monthDistinct !=0){
//                    return monthDistinct;
//                }
//
//                int dayDistinct = o1.getBirthday().getDay()-o2.getBirthday().getDay();
//                if(dayDistinct!= 0){
//                    return dayDistinct;
//                }
//                return 0;
                //=================
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };



        TreeSet<Employee> set = new TreeSet<>(comparator);

        Employee e1 = new Employee("HanMeimei",18,new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20,new MyDate(1996,11,21));
        Employee e3 = new Employee("LiHua",21,new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19,new MyDate(1996,5,31));
        Employee e5 = new Employee("ZhangYi",23,new MyDate(2000,9,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        //遍历
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }


}
