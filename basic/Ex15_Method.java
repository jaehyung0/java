package com.test.java;

public class Ex15_Method {

	public static void main(String[] args) {
		
		int num = 10;
		num=20;
		System.out.println(num);
		//제어흐름
		// -프로그램 코드의 실행 순서
		// -책 읽듯이 위에부터 아래로 한줄씩 실행
		System.out.println("하나");
		m1(); //19라인으로 이동하시오. > 제어가 이동한다.
		System.out.println("둘");
		m2(); //23라인으로 이동하시오.
		System.out.println("셋");
		
		
		//이클립스 팁
		//outline 보조창 , F3누르면 이동
		
		//식별자 수정하는 방법
		// - 클래스명, 메소드명, 변수명, 파일
		//  > ctrl + 1 > rename in file > 바꾸고 엔터
		m3(); //메소드 만들기(ctrl + 1)
		
		m4(); //context menu > Refactor > Extract Method
		
		System.out.println(num);
		
	}


	private static void m4() {
		System.out.println("금붕어");
	}
	
		
	private static void m3() {
		System.out.println("거북이");
	}


	
	public static void m1() {
		System.out.println("강아지");
	} //m1 실행 종료. 메소드는 실행이 종료되면 반드시 자기를 호출했던 곳으로 제어가 돌아간다.
	
	public static void m2() {
		System.out.println("고양이");
	}
	
	
}
