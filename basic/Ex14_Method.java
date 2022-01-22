package com.test.java;

public class Ex14_Method {

	//모든 파일 > main 메소드 존재
	//메소드 선언 > 메소드 호출
	
	//main 메소드
	//- 특별한 메소드
	//- 이름이 예약된 메소드(main)
	//- 자바가 호출하는 메소드(개발자 호출 x)
	//- 프로그램이 시작하는 자동으로 호출되는 메소드
	//- 프로그램의 시작점(Entry Point) ~ 프로그램의 종착점(End Point)
	
	public static void main(String[] args) {
		
		/*메소드, Method
		 *- 메소드(Method), 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine)
		 *- 코드의 집합
		 *- 같은 목적을 가진 코드의 집합 > 1가지 행동 위해서 집합
		 *- 코드 재사용의 단위
		 *
		 *메소드 사용법
		 *1. 메소드 선언하기(정의하기)
		 *	- 단 1회
		 *2. 메소드 호출하기(사용하기)
		 * 	- N회
		 *  
		 */
		//요구사항) "안녕하세요" x5 번 출력
		//1. 생산 비용 고가 > 하드코딩 > 저수준 방식
		//2. 유지보수 비용 고가 > 수정하는 비용
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		hello();
		hello();
		hello();
		hello();
		hello();
		hello();
		hello(); //코드 재사용
		System.out.println();
		//코드 재사용의 장점
		//1. 유지 보수가 쉽다. 한번만 고치면 호출 할 때 마다 수정된 사항이 적용되니까
		//2. 생산성이 높다. 처음 만들 때 비용이 절감
		//요구사항) "하나" ~ "열" 까지 출력. 라인 단위
		//수정사항) 10번 반복
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
		printNumber();
		
		
		//main의 할일 > 다른 누군가에게 분산(위임)
		//            -메소드
		//            -클래스
		//         > 전체적인 흐름(제어) 통제하는 역할
		
		//메소드사용
			
	}//main
	//1.메소드 선언하기
	// - 메소드는 클래스의 자식으로 선언한다.
	/*
	 * public static void hello(){
	 * 접근지정자 정적키워드 반환자료형 메소드명 (인자리스트) {
	 * 				실행할 코드 작성
	 * }
	 */
	public static void hello() {
		
			System.out.println("반갑습니다");
	}
	public static void printNumber() { //메소드명,변수명 >> 캐멀 표기법
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
	
	
	
}
