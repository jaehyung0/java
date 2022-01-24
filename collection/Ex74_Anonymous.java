package com.test.java.collection;

public class Ex74_Anonymous {

	public static void main(String[] args) {
		
		/*
		   익명 객체 Anonymous Object
		    -익명 클래스, Anonymous Class
		    -이름이 없는 객체(클래스)
		    -반드시 인터페이스가 필요하다.(문법의 한계때문에)
		   
		   
		   실명 클래스
			-메소드 역할 -> 모든 객체가 동일한 행동을 하기 위해서
			-객체를 여러개 생성하는 것이 목적
		
		   익명 클래스
		   	-메소드 역할 -> 모든 객체가 서로 다른 행동을 한다.
		   	-객체를 딱 1개 생성하는 것이 목적
		   	-1회용 객체가 필요할 때 사용
		
		   
		 */
		
		
		//*** 인터페이스를 구현(상속)한 클래스 > 객체를 생성
		//1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.test();
		b1.call();
		
		//2. 부모 타입으로 참조 변수 만들기 > 인터페이스 > 업캐스팅
		AAA b2 = new BBB();
		b2.test();
		//b2.call();
		//부모 탑입의 변수로는 자식 객체가 스스로 만든 멤버에는 접근 불가능
		
		//다운캐스팅
		BBB b3 = (BBB)b2;
		b3.call();
		
		//(BBB)b2.call();
		((BBB)b2).call();
		
		//인터페이스는 스스로 객체를 생성할 수 없다.
		// -> 추상 메소드를 소유하는 자료형(인터페이스, 추상클래스)은 개체를 생성할 수 없다. -> 추상 메소드를 호출하면 구현부가 없기 때문에
		//AAA b4 = new AAA();
		//b4.test(); //공갈 메소드
		
		AAA b5 = new AAA() {

			@Override
			public void test() {
				System.out.println("익명객체메소드");
				
			}
			
		};
		
		b5.test();
		
		AAA b6 = new AAA() {

			@Override
			public void test() {
				System.out.println("자신만의 구현 내용");
				
			}
			
		};
		b6.test();
		 
	}
}


interface AAA{
	void test();
}

class BBB implements AAA {

	@Override
	public void test() {
		System.out.println("테스트");
		
	}
	
	public void call() {
		System.out.println("자신의 메소드");
	}
	
}





