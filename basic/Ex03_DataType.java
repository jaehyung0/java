package com.test.java;

public class Ex03_DataType {
	public static void main(String[] args) {
		
		//자료형 -> (적용) -> 변수
		
		//변수, variable
		// - 메모리 상의 사용자가 할당받은 공간
		// - 데이터를 저장하는 상자(공간)
		// 성적처리
		// 1. 국어점수 조작(예측)
		// 2. 국어 점수 저장할 공간 확보(예측)
		// 3. 국어 점수 성질 -> 형태 + 길이 -> 정의 -> 정수(형태) +0~100(길이)
		// 4. 예측 결과와 가장 적합한 자바의 자료형을 선택
		// 5. byte형 선택
		// 6. 명령어 > 메모리 > byte 자료형의 공간을 얻어오기 > 변수 생성하기
		
		//변수 생성, 선언
		// - 자료형 변수명;
		// ; = 문장의 끝을 표현, 마침표, 문장 종결자
		// - 변수 -> 데이터를 저장하는 공간
		// - 변수 -> 메모리의 특정 주소값을 대신하는 표현 -> 공간접근 -> 공간
		byte kor;
		
		//데이터 대입하기
		//변수 = 데이터; => =(대입연산자) 우측의 데이터를 좌측의 공간에 넣어라
		kor = 100;
		
		//변수 사용하기, 데이터 읽기
		System.out.println(kor);
		
		//3.14 실수 
		double pi;
		
		pi = 3.14;
		
		System.out.println(pi);
		
		//요구사항: 영어점수 80점을 화면에 출력하시오.
		byte eng;
		
		eng = 80;
		
		System.out.println(eng); //무엇을 출력하는가? eng 출력
		
		byte a;
		a = 123;
		System.out.println(a);
		
		//변수는 1개당 데이터를 1개밖에 저장할 수 없다. 덮어쓰기, 변수치환
		a = 10;
		System.out.println(a);
		
		//상수의 의미
		//1. 데이터를 표현 > 리터럴(Literal)
		//2. 이름이 있는 상수 > final byte = 100
		
		System.out.println(123); //상수 <- 의미를 모름
		
		final byte score = 100;
		//const byte score = 100; (자바에서는 쓰지 않음)
		//score = 90; <- final byte는 중간에 상수를 바꾸지 못하게 막음
		//final 변수 (= 이름이 있는 의미있는 상수) : 한번 값을 초기화하면 더이상 변경 x
		System.out.println(score);
		
		//변수 선언과 초기화
		byte a1; //선언문
		a1= 10; //초기화
		
		byte b2 = 20; //선언 + 초기화
		
		byte b3;
		byte b4;
		byte b5;
		
		byte b6, b7, b8;
		
		byte b9=10, b10=20, b11= 30;
		
		//국,영,수 점수
	
		byte kor1, eng1, math1;
		kor1 = 100;
		eng1 = 90;
		math1= 80;
		
		
		
		
		int n1 = 10;
		int n2 = 20;
		
		//자료형과는 상관없이 동일한 변수명을 사용할 수 없다. 
			
		
	
	}

}
