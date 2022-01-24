package com.test.java.lambda;

import java.util.Calendar;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.test.data.Data;

public class Ex85_Lambda {

	public static void main(String[] args) {
		
		/*
		 * 함수형 인터페이스, Functional Interface
		 * -람다식을 저장하기 위해 선언된 인터페이스
		 * -평범한 인터페이스 > 역할(람다식 저장용)
		 * -추상메소드를 딱 1개만 갖는다.
		 * 1.사용자 정의 함수형 인터페이스 > 개발자 선언
		 * 2.표준 API 함수형 인터페이스 > JDK 선언
		 * 
		 * 표준 API 함수형 인터페이스 종류
		 * -JDK가 개발자들에게 람다식을 저장할 인터페이스를 미리 만들어서 제공
		 * 1.Consumer 매개변수O, 반환값X.
		 * 		-Consumer<T>
		 * 		-BiConsumer<T,U>
		 * 
		 * 2.Supplier 매개변수X, 반환값O.
		 * 		-Supplier<R>
		 * 		
		 * 3.Function 매개변수O, 반환값O. 매개변수를 처리 후 반환값을 반환
		 * 		-Function<T,R>
		 * 		-BiFunction<T,U,R>
		 * 
		 * 4.Operator 매개변수O, 반환값O. 매개변수를 연산 후 반환. Function 하위 셋
		 * 		-BinaryOperator<T>
		 * 		
		 * 5.Predicate 매개변수O, 반환값O. 매개변수를 논리 연산 후 반환. Function 하위 셋
		 * 		-Predicate<T>
		 * 		-BiPredicate<T,U>
		 * 
		 */
		
		//람다식 목적 > 코드의 간결화
//		Test t1 = n-> System.out.print(n+10);
//		t1.aaa(100);
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
	}

	private static void m7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성인:");
		
		System.out.println("청소년:");
	
		System.out.print("어린이:");
		int adult = scan.nextInt();
		int chung = scan.nextInt();
		int child = scan.nextInt();
		
	}

	private static void m6() {
		//표준 API 함수형 인터페이스의 확장기능
		
		//1.andThen()
		//-Consumer, Function, Operator
		//2.compose()
		//-Consumer, Function, Operator
		
		com.test.data.User hong = Data.getUserArray()[0];
		
	}

	private static void m5() {
		//Predicate
		//-매개변수를 전달하면 반환값을 돌려주는 역할
		//-testXXX() 추상 메소드를 제공
		//-Function 하위 집합
		//-매개변수를 사용해서 조건을 검사한 뒤 논리값을 반환하는 Function이 Predicate이다.
		
		Function<Integer,Boolean> f1 = age -> age>=19;
		Predicate<Integer> f2 = age -> age>=19;
		System.out.println(f1.apply(20));
		System.out.println(f2.test(20));
		
		BiPredicate<Integer, Integer> f3 = (a,b) -> a>b;
		System.out.println(f3.test(10,20));
		System.out.println(f3.test(20, 10));
	}

	private static void m4() {
		//Operator
		//-매개변수를 전달하면 반환값을 돌려주는 역할
		//-applyXXX() 추상 메소드를 제공
		//-Function 하위 집합
		//-매개변수와 반환값의 타입이 동일한 Function이 Operator이다.
		
		BiFunction<Integer, Integer,Integer> f1 = (a,b) -> a+b;
		BinaryOperator<Integer> f2 = (a,b) -> a+b;
		System.out.println(f1.apply(10, 20));
		System.out.println(f2.apply(10, 20));
		
		BinaryOperator<String> f3 = (s1,s2) -> s1+s2;
		System.out.println(f3.apply("홍", "길동"));
		
		
		
	}

	private static void m3() {
		
		//Function
		//-매개변수를 전달하면 반환값을 돌려주는 역할
		//-applyXXX() 추상메소드를 제공
		
		//T:매개변수
		//R:반환값
		Function<Integer, Boolean> f1 = age -> age>=19 ? true : false;
		System.out.println(f1.apply(20));
		
		Function<String, Integer> f2 = txt ->txt.length();
		System.out.println(f2.apply("하하하하"));
		
	}

	private static void m2() {
		//Supplier
		//-매개변수 없이 반환값만 돌려주는(공급하는) 역할
		//-getXXX() 추상 메소드를 제공
		
		Supplier<String> s1 = () -> {return "홍길동";};
		Supplier<String> s2 = () -> "홍길동";
		System.out.println(s1.get());
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = () -> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s3.get());
		
		Supplier<Double> s4  = () -> Math.random();
		System.out.println(s4.get());
		
		DoubleSupplier s5 = () -> Math.random();
		System.out.println(s5.getAsDouble());
		
		
		
		
	}

	private static void m1() {
		//Consumer
		//-매개변수를 받아서 소비하는 업무를 구현하는 역할
		//-acceptXXX() 추상 메소드를 제공
		MyConsumer c1 = num -> System.out.println(num);
		c1.accept(100);
		
		Consumer<Integer> c2 = num -> System.out.println(num);
		c2.accept(200);
		
		Consumer<String> c3 = txt -> System.out.println(txt.length());
		c3.accept("홍길동");
		c3.accept("홍길동입니다.");
		
		Consumer<Integer> c4 = count -> {
			for(int i=0;i<count;i++) {
				System.out.println(i);
			}
		};
		c4.accept(6);
		
		Consumer<User> c5 = user -> {
			System.out.println("이름:"+ user.getName());
			System.out.println("나이:"+ user.getAge());
		};
		c5.accept(new User("홍길동",20));
		
		BiConsumer<String, Integer> bc1 = (name,age) -> {
			System.out.printf("이름: %s, 나이: %d\r\n",name,age);
		};
		bc1.accept("홍길동", 31);
		
		IntConsumer ic1 = n -> System.out.println(n*2);
		Consumer<Integer> ic2 = n -> System.out.println(n*2);
	}
}

@FunctionalInterface
interface MyConsumer {
	void accept(int num);
}




//람다식을 저장할 인터페이스는 반드시 추상메소드 1개를 갖어야한다.
@FunctionalInterface
interface Test {
	//추상 메소드 > 람다식으로 만들 예정인 실제 메소드의 부모 역할
	void aaa(int n);
	//void bbb(int m);
}