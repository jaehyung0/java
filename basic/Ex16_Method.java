package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		
	/*
	 * publci static void m1(){
	 * 
	 * }
	 * 
	 * 1. m1
	 * -메소드명
	 *  
	 * 2. ()
	 * -인자 리스트
	 * -파라미터(parameters) , 인자(Arguments), 매개변수, 가인자(Pseude Arguments)
	 * -소극적인 다형성 구현
	 * 
	 */
		
		//요구사항) '홍길동'에게 인사하는 메소드를 만드시오.	
		//수정사항) 추가로 '아무개'에게 인사를 하는 메소드를 만드시오.
		hi("홍길동");
		hi("김재형");
		
		}
	
	//String name
	//-인자, 파라미터 ,매개변수
	//변수는 초기화 하지 않은 상태(null)로 사용이 불가능하다.
	
	//매개변수
	// - 메소드 선언시에는 값이 정해져 있지 않지만 호출 할때 값을 전달함으로써 해당 메소드가 그 값을 가지고 행동을 할 수 있도록 한다.
	
	public static void hi(String name) {
		System.out.println("자바 수업에 오신걸 환영합니다.");
		System.out.println(name +  "님 안녕하세요.");
		System.out.println("열심히 공부하세요");
	}
	
	
	
}
