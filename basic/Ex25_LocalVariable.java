package com.test.java;

public class Ex25_LocalVariable {
	
	//변수 선언문이 어디에 위치하고 있는지?? >> 클래스 안 > 멤버 변수
	int b = 20;

	public static void main(String[] args) {
		
		//자바 변수의 종류
		//1. 멤버 변수
		//2. 지역 변수
		
		//변수 선언문이 어디에 위치하고 있는지?? >> main 메소드 안 > 지역변수
		int a = 10;
		
		//Local Variable : 지역 변수
		// - 메소드나 제어문 안에서 선언한 변수
		// - 자신이 선언된 메소드나 제어문을 자신의 영역이라고 생각한다. > 영역(Scope) > 해당 변수는 자신의 영역밖을 나가지 못한다.
		//    > 외부 영역에서는 해당변수에 접근이 불가능하다.
		
		int c = 100;
		
		System.out.println("c: " + c);
		
		m1();
		
		System.out.println("c: " + c);
		
		if (c>0) {
			int d =1000;
			System.out.println("d: "+d);
		}
		
		//System.out.println("d: "+d); //d 뭔지 모름
		
		//모든 것들의 생명주기
		//- 어떤 요소가 언제 태어나서(메모리에 생성된다.) 언제 죽는지(메모리에서 소멸된다.)?
		
		
		//지역 변수의 생명주기( Life Cycle)
		//-규칙
		//-탄생: 선언문이 실행되는 순간
		//-소멸: 선언문이 포함된 블럭 {}에서 제어가 벗어나는 순간
		
		//m2();
		
	}//main

	private static void m2(int m) { //매개변수? > m2의 지역변수
		//int m = 100;
	}

	private static void m1() {
		int c= 200;
		System.out.println("m1, c: " + c);
		
	}
}
