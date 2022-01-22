package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19_Overloading {
	
	public static void main(String[] args) throws IOException {
		

		//https://www.jetbrains.com
		//IntelliJ
		// - 대학교 이메일 계정(XXX@XXX.ac.kr) > 정식판 무료
		
		//Eclipse vs IntelliJ
		//Word Wrap: Alt + Shift + Y
		
		
		//Ex19_Overloading.java
		
		/*
		  
		면접
		- 인적성 면접
		- 실무 면접 > 구두, 실습(코딩 - PC, A4(손코딩), 온라인(전용사이트, 이메일))
		- 임원 면접
		  
		
		메소드 오버로딩, Method Overloading
		- 메소드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
		- 같은 이름의 메소드를 여러개 만들 수 있는 기술
		
		메소드 시그너처
		
		
		메소드 오버로딩 구현 조건 가능
		1. 매개변수의 개수
		2. 매개변수의 자료형
		
		메소드 오버로딩 구현 조건 불가능
		1. 매개변수의 이름
		2. 반환값의 자료형
		
		
		메소드를 선언하는 중..
		1. public static void test() {}				//O
		2. public static void test() {}				//X. 1번
		3. public static void test(int n) {}		//O
		4. public static void test(int m) {}		//X. 3번
		5. public static void test(String s) {}		//O
		6. public static void test(int n, int m) {} //O
		7. public static int test(int n) {}			//X. 3번
		
		
		메소드를 호출하기(관점!!!)
		test(); //강아지 or 고양이
		test(); //1.
		test(10); //3
		
		test(20); //3
		test("홍길동"); //5 
		
		test(10, 20); //6
		
		test(10); //3번
		int result = test(10); //7번
		
		*/
		
		
		//메소드 오버로딩을 하는 이유???
		// - 성능 향상(X)
		// - 개발자 도움(O) > 머리 나쁜 개발자를 위한 기술
		
		System.out.println("홍길동");
		System.out.println(20);
		drawLine(); //기본 라인 -> drawLine
		 
		System.out.println("자바 언어");
		drawLine(); //기본 라인 -> drawLine
		
		System.out.println("하하하");
		drawLine("*"); //특별 라인 -> drawLine
		
		
		
		
		//메소드 오버로딩의 혜택
		//System(클래스)
		//out(필드)
		//println(메소드)
		System.out.println(100);
		System.out.println("홍길동");
		System.out.println(true);
		System.out.print(100);
		System.out.print("홍길동");
		System.out.println();
		
		//10개의 메소드 -> 오버로딩 -> println()
		
		
		//메소드 선언
		//- 매개변수로 전달받은 숫자들 중 양수의 개수가 몇개인지 반환하는 메소드
		//- 오버로딩
		
		//int count = positive(num1);
		//positive(10) -> 1
		//positive(-5) -> 0
		//int count = positive(num1, num2);
		//positive(10, 5) -> 2
		//positive(10, -10) -> 1
		//positive(-5, -10) -> 0
		
		//도움말
		
		drawLine("#");
		
		int num1 = inputNumber();
		
		int count = positive(num1);
		System.out.println("양수의 개수: " + count);
		
		int num2 = inputNumber();
		count = positive(num1, num2);
		System.out.println("양수의 개수: " + count);
		
		int num3 = inputNumber();
		count = positive(num1, num2, num3);
		System.out.println("양수의 개수: " + count);
		
		
						
	}//main
	
	private static int positive(int num1, int num2, int num3) {
		
		int count = 0;
		
		count += num1 > 0 ? 1 : 0;
		count += num2 > 0 ? 1 : 0;
		count += num3 > 0 ? 1 : 0;
		
		return count;
	}
	
	
	
	private static int positive(int num1, int num2) {
		
		int count = 0;
		
		count += num1 > 0 ? 1 : 0;
		count += num2 > 0 ? 1 : 0;
		
		return count;
	}

	private static int positive(int num1) {
		
		//넘어온 매개변수 중 양수가 몇개있는지?
		int count = 0; //누적 변수
		
		count = num1 > 0 ? 1 : 0;
		
		return count;
	}

	public static int inputNumber() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		return num;		
	}
	
	public static void println(int n) {
		
	}
	
	public static void println(String n) {
		
	}
	
	public static void println(boolean n) {
		
	}
	
	//선을 긋는 메소드 x 모양 여러개
	// -> 10개 만들었음 -> 메소드명 x 10개
	public static void drawLine() {
		System.out.println("==============================");
	}
	
	public static void drawLine(String s) {
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println();
	}
	
//	public static void drawLinePlus() {
//		System.out.println("++++++++++++++++++++++++++++++");
//	}
	
	
	public static void test() {
		System.out.println("강아지");
	}
	
//	public static void test() {
//		System.out.println("고양이");
//	}
	
	public static void test(int n) {
		System.out.println("병아리" + n);
	}
	
//	public static void test(int mlkasdjflasdjasdfa) {
//		System.out.println("병아리" + n);
//	}
		
	

}












