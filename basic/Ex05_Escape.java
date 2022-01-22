package com.test.java;

public class Ex05_Escape {
	
	public static void main(String[] args) {
		
		//Ex05_Escape.java
		
		//특수 문자 > Escape Sequence
		// -컴파일러가 번역을 할 때, 미리 약속된 표현을 만나면 그 표현을 약속에 따라 처리 후 번역하는 구성요소
		// - 자료형: char
		
		//1. \n  <- new line, line feed, 개행문자
		// - 실행중에 \n을 만나면 엔터를 쳐라
		String str = "안녕하세요. 홍길동입니다.";
				System.out.println(str);
		String str2 = "안녕하세요.\n홍길동입니다.";
		System.out.println(str2);
		
		//2. \r <- carrage return
		// - 캐럿(커서)의 위치를 현재 라인의 맨앞(첫번째 열)로 이동
		// - 이클립스 콘솔에서 확인 불가능
		// str= "안녕하세요.\r홍길동";  -> 홍길동세요
		//3. \t
		// - 탭문자, tab
		// - 탭용도 > 서식 작업(열 맞추기)
		// - 탭이란? > 들여쓰기
		// - 탭문자 편집기, 출력환경에 따라 다름(2~8칸)
		str = "하나\t둘\t셋\t넷";
		System.out.println(str);
		//4. \b
		// - backspace
		//str = "홍길동\b입니다."; -> 홍길입니다
		//5. \" String, \' char, \\ 역슬래시 들어간것
		// -escape 문자
		// 요구사항) 화면> "홍길동" : 안녕하세요.
		str = "\"홍길동\" : 안녕하세요.";
		System.out.println(str);
		
		//요구사항) 현재 수업중인 폴더의 경로를 출력하세요
		//D:\class\java
		
		String address = "D:\\class\\java";
		System.out.println("수업폴더:" +address);
		
		
		
		
	}

}
