package com.test.java.lambda2;

import java.util.function.Consumer;
import java.util.function.Function;

import com.test.data.Data;
import com.test.data.User;

public class Ex86_Lambda {

	public static void main(String[] args) {
		
		//표준 API 함수형 인터페이스의 확장기능
		
		//1.andThen()
		//-Consumer, Function, Operator
		//-C호출 -> A실행 -> B실행
		//2.compose()
		//-Consumer, Function, Operator
		//-C호출 -> B실행 -> A실행
		
		
		User hong = Data.getUserArray()[0];
		System.out.println(hong);
		
		//업무 1.
		Consumer<User> c1 = user -> System.out.println(user.getName());
		c1.accept(hong);
		
		//업무 2.
		Consumer<User> c2 = user -> System.out.println(user.getAge());
		c2.accept(hong);
		
		//요구사항) 업무1과 업무2를 동시에 실행
		c1.accept(hong);
		c2.accept(hong);
		
		//Consumer+Consumer = Consumer
		Consumer<User> c3 = c1.andThen(c2);
		c3.accept(hong);  // c1.accept() 호출 -> c2.accept 호출
		
		
		Function<Integer, Boolean> f1 = num -> num>0;
		System.out.println(f1.apply(10));
		
		Function<Boolean, String> f2 = flag -> flag ? "양수" : "음수";
		System.out.println(f2.apply(true));
		
		Function<Integer,String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
		
		Function<String, String> f4 = str -> str.substring(0,1);
		Function<Integer,String> f5 = f3.andThen(f4);
		System.out.println(f5.apply(10));
		
		
		Function<Integer,String> f6 = num -> num>3 ? "3보다큼":"3보다작음";
		Function<String,Integer> f7 = str -> str.length();
		
		Function<Integer,Integer> f8 = f6.andThen(f7);
		System.out.println(f8.apply(20));
		
		Function<String,String> f9 = f6.compose(f7);
		System.out.println(f9.apply("뭔데"));
		
	}
}
