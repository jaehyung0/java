package com.test.java;

import java.io.IOException;

public class Ex08_Input {
		
	public static void main(String[] args) throws IOException {
		
		/*
		 * 콘솔 출력
		 * -print, println, printf
		 * 
		 * 콘솔 입력
		 * 1. System.in.read
		 * 	- 사용자가 입력한 문자를 읽어오는 기능
		 * 	- 읽어온 문자를 숫자(문자코드값)로 돌려준다.
		 * 	- 영어와 숫자, 특수문자만(ASCII)만 입력가능. 1바이트만 입력가능
		 * 	- 한글 불가능(2바이트)
		 * 2. BufferedReader 클래스
		 * 3. Scanner 클래스
		 * 
		 */
		
		//요구사항) 사용자에게 문자 1개를 키보드로 입력받아 그대로 화면에 출력하시오.
		//입력) A
		//출력) 입력하신 문자는 A입니다.
		
		//System.out.print("입력)");
		
		//사용자로부터 키보드 입력을 받는다.
		//완성형 한글 -> 글자 1개를 문자로 취급 > 가, 강, ~~
		//조합형 한글 -> 초성, 중성, 종성을 조합 -> 조합이 어려움
		//현시점 > OS, 프로그램 > 완성형만 지원
		//int data = System.in.read(); //block걸린다.
		//System.out.println(data); //A~Z > 65~90 a~z > 97~122, 0 > 48
		//System.out.printf("입력하신 문자는 %c입니다\n",data);
		//System.out.println((char)data); //형변환(int -> char 변환)
		
		//System.in.read(); -> 1회당 1글자
		//키보드->버퍼->자바프로그램
		//A엔터(A\r\n)>65/13/10>65
		System.out.printf("입력:");
		int data = System.in.read(); //버퍼안의 1문자를 가져옴 A
		System.out.println(data);//65
		data = System.in.read();//\r
		System.out.println(data);//13
		data = System.in.read();//\n
		System.out.println(data);//10
		data = System.in.read();
		System.out.println(data);
		//data = System.in.read);
		//System.out.println(data);
		//data = System.in.read();
		//System.out.println(data);
		//data = System.in.read();
		//System.out.println(data);
		System.out.println("종료");		
		
	}
	
}
