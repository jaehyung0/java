package com.test.java.lambda;

public class Ex81_Lambda {

	public static void main(String[] args) {
		
		//람다식, Lambda Expression
		//-함수형 프로그래밍 지원 표현식
		//-람다식을 사용하면 코드가 간결해진다.
		//-컬렉션을 조작하기 쉬워진다. > 컬렉션을 조작하는 기능 일부 > 람다식을 사용
		//-자바의 메소드 표현과 유사
		//-람다식은 매개 변수를 가지는 코드 블럭이다.
		//-자바의 람다식은 인터페이스를 사용해서 만들어진다.
		
		//람다식 코드 형식
		//- 인터페이스 변수 = 람다식;
		//ex) MyInterface m1;
		//- (매개변수) -> {실행코드;}
		//a. (매개변수): 메소드의 매개변수 리스트와 동일한 역할
		//b. ->: 화살표(Arrow), 코드블럭을 호출하는 역할
		//c.실행코드: 메소드의 구현부와 동일한 역할
		
		//요구사항) MyInterface를 구현하는 객체 만들기
		//case1.클래스 구현
		MyInterface m1 = new MyClass();
		m1.test();
		
		//case2.익명객체
		MyInterface m2 = new MyInterface() {

			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메소드");
				
			}
			
		};
		m2.test();
		
		//case3.
		MyInterface m3 =()->{
			System.out.println("람다식으로 구현한 메소드");
		};
		m3.test();
		
	}
}

interface MyInterface {
	void test();
}

class MyClass implements MyInterface {
	@Override
	public void test() {
		System.out.println("실명 객체에서 구현한 메소드");
		
	}
}