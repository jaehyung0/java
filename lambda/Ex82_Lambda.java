package com.test.java.lambda;

public class Ex82_Lambda {

	public static void main(String[] args) {
		//자바의 람다식
		//- 람다식 스스로 존재할 수 없다.
		//- 반드시 인터페이스 변수에 저장을 한 후에 사용이 가능하다.
		//- 익명 객체를 만드는 방법을 최소화한다.
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
				
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		ParameterNoReturn pr3 = (int num) -> {
			System.out.println(num);
		};
		pr3.call(100);
		pr3.call(2100);
		
		//매개변수가 유일할때
		ParameterNoReturn pr4 = num -> {
			System.out.println(num*2);
		};
		pr4.call(400);
		
		
		//실행블럭이 1줄일때
		ParameterNoReturn pr5 = num -> System.out.println(num*3);
		pr5.call(500);
		
		MultiParameterNoReturn pr6 = (String name,int age) -> {
			System.out.println(name+":"+age+"살");
		};
		pr6.call("김재형", 28);
		
		//매개변수는 2개 이상일때
		MultiParameterNoReturn pr7 = (name,age) -> System.out.println(name+":"+age+"살");
		pr7.call("ddd", 22);
		
		NoParameterReturn pr8 = () -> {
			return 10;
		};
		System.out.println(pr8.call());
		
		NoParameterReturn pr9 = () -> {
			return 15;
		};
		System.out.println(pr9.call());
		
		
		NoParameterReturn pr10 = () -> 20;
		System.out.println(pr10.call());
		
		NoParameterReturn pr11 = () ->(int)(Math.random()*100);
		System.out.println(pr11.call());
		
		ParameterReturn pr12 = (a,b) -> a+b;   // (int a, int b)->{return a+b;};
		System.out.println(pr12.call(10, 200));
		
		ParameterReturn pr13 = (a,b) -> a-b;
		ParameterReturn pr14 = (a,b) -> a*b;
		ParameterReturn pr15 = (a,b) -> a/b;
		
		System.out.println(pr13.call(10, 20));
		System.out.println(pr14.call(10, 20));
		System.out.println(pr15.call(100, 20));
		
		ParameterReturn2 pr16 = (int age) -> {
			return age >=19?"어른":"아이";
		};
		System.out.println(pr16.call(20));
		
		ParameterReturn2 pr17 = age -> age >=19?"어른":"아이";
		System.out.println(pr17.call(30));
		
	}//main
}

interface NoParameterNoReturn {
	void call();
}


interface ParameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn {
	int call(int num1,int num2);
}

interface ParameterReturn2 {
	String call(int age);
}
