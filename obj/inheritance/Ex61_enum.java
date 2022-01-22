package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex61_enum {

	public static void main(String[] args) {
		
		//열거형, Enumeration
		//-클래스의 일종
		//-열거값을 가지는 자료형. 열거값중 하나를 선택해서 사용하는 자료형
		
		//상황) 의류 쇼핑몰 > 티셔츠 > 고객 > 색상 선택
		//	   색상 > 빨강, 파랑, 노랑
		
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		//열거형
		Gender g1 = Gender.female;
		Gender g2 = Gender.male;
		
		System.out.println(g1);
		System.out.println(g2);
		
		if (g2==Gender.male) {
			System.out.println("남자");
		}else if(g2==Gender.female){
			System.out.println("여자");
		}
		
		Color c = Color.red;
		int c2 = Color2.blue;
	}

	private static void m2() {
		//색상입력 > 객관식
		System.out.println("1.빨강 2.파랑 3.노랑 중 색상을 선택하세요");
		
		String sel = "1";
		
		System.out.println(sel);
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("빨강, 파랑, 노랑 중 색상을 선택하세요.");
		
		String color = scan.nextLine(); //scan.nextLine();
		
		System.out.println("선택:"+color);
		
	}
}


class 클래스명 {
	//구현된 멤버
}

interface 인터페이스명 {
	//추상 멤버
}

enum 열거형 {
	//열거형 멤버(=데이터)
}

enum Gender {male,female}

enum Color {red,yellow,blue};

class Color2 {
	public static final int red =0;
	public static final int yellow =1;
	public static final int blue =2;
}