package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 测试Stream的中间操作
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1() {
//        filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
        //练习：查询员工表中薪资大于7000的员工信息
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().filter(emp -> emp.getSalary() > 7000)
                        .forEach(System.out::println);

        System.out.println();
//        limit(n)——截断流，使其元素不超过给定数量。
        employees.stream().limit(3)
                        .forEach(System.out::println);

        System.out.println();
//        skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。
//        与 limit(n) 互补
        employees.stream().skip(3)
                        .forEach(System.out::println);


        System.out.println();
//        distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
        employees.add(new Employee(1009, "马斯克", 40, 12500.32));
        employees.add(new Employee(1009, "马斯克", 40, 12500.32));
        employees.add(new Employee(1009, "马斯克", 40, 12500.32));
        employees.add(new Employee(1009, "马斯克", 40, 12500.32));
        employees.stream().distinct()
                .forEach(System.out::println);
    }

    //映射
    @Test
    public void test2() {
        //map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        //练习：转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase)
                .forEach(System.out::println);

        //练习：获取员工姓名长度大于3的员工的姓名。
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream()
                .map(Employee::getName)
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);

    }

    //3-排序
    @Test
    public void test3() {
        //sorted()——自然排序
        Integer[] arr = new Integer[]{345,3,64,3,46,7,3,34,65,68};
        String[] arr1 = new String[]{"GG","DD","MM","SS","JJ"};
        Arrays.stream(arr).sorted()
                .forEach(System.out::println);

        //sorted(Comparator com)——定制排序
        Arrays.stream(arr1)
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .forEach(System.out::println);

    }
}
