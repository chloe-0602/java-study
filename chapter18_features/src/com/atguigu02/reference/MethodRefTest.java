package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		Consumer<String> con1 = System.out::println;
		con1.accept("this is accept");
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee emp = new Employee(1, "Tom");
		Supplier<String> sup1 = new Supplier<String>() {
			@Override
			public String get() {
				return emp.getName();
			}
		};

		System.out.println(sup1.get());

		System.out.println("---------------------");
		Supplier<String> sup2 = emp::getName;
		System.out.println(sup2.get());
	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com1 = Integer::compare;
		System.out.println(com1.compare(21, 22));
	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		Function<Double, Long> fun1 = Math::round;
		Long res = fun1.apply(12.3333);
		System.out.println(res);
	}

	// 情况三：类 :: 实例方法 
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1 = String::compareTo;
		System.out.println(com1.compare("ha", "ha"));

	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String, String> bip1 = String::equals;
		System.out.println(bip1.test("21x1", "1"));

	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Function<Employee, String> func1 = Employee::getName;

		Employee employee = new Employee(1, "Jerry");
		String res = func1.apply(employee);
		System.out.println(res);
	}

}
