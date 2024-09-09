package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  测试Stream的实例化
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest {

    //创建 Stream方式一：通过集合
    @Test
    public void test1(){

//        default Stream<E> stream() : 返回一个顺序流
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
//        default Stream<E> parallelStream() : 返回一个并行流
        Stream<Employee> employeeStream = employees.parallelStream();
    }

    //创建 Stream方式二：通过数组
    @Test
    public void test2(){
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        int[] arr = {1,2,3,4};
        IntStream stream = Arrays.stream(arr);
    }
    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5);
    }
    

}
