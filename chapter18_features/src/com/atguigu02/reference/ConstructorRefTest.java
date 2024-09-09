package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *
 * 二、数组引用
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee> sup1 = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println(sup1.get());

        System.out.println();

        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());

    }

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer, Employee> func = Employee::new;
        Employee employee = func.apply(2);
        System.out.println(employee);
    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer, String, Employee> biFunction = Employee::new;
        Employee employee = biFunction.apply(3, "Jerry");
        System.out.println(employee);
    }

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer, Employee[]>  func = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer num) {
                return new Employee[num];
            }
        };
        Employee[] employees = func.apply(10);
        System.out.println(employees.length);

        System.out.println("==========");

        Function<Integer, Employee[]> func1 = Employee[]::new;
        Employee[] employees1 = func1.apply(2);
        System.out.println(employees1.length);
    }
}
