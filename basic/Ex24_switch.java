package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex24_switch {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 조건문
		 * 1.if
		 * 2.switch
		 * 
		 * switch문, switch case문
		 * -조건문
		 * -조건으로 사용 가능한 자료형 >> 정수,문자열,열거형(enum)
		 * -C언어의 switch -> 조건(정수형)
		 * -if문에 비해 활용도가 낮지만 가독성이 높다.
		 * 
		 * switch문, switch case문
		 * 
		 * switch (조건){
		 * 		case 값:
		 * 			실행문;
		 * 			break;
		 * 		[case 값:
		 * 			실행문;
		 * 			break;]xN
		 * 		[default;
		 * 			실행문;
		 * 			break;] 생략해도 되지만 쓸거면 1번만 쓸 수 있음	
		 * }
		 * 
		 */
		
		//m1();
		//m2();
		m3();
		
		
	}//main

	private static void m3() throws Exception {
		
		//요구사항) 사용자가 월을 입력하면 해당월의 마지막 일?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("월을 입력하세요");
		int month =Integer.parseInt(reader.readLine());
		int lastDay = 0;
		
		switch (month) {
		case 12:
		case 10:
		case 8:
		case 7:
		case 5:
		case 3:
		case 1:
			lastDay = 31;
		break;
		case 2:
			lastDay= 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay=30;
			break;
		}
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일 입니다.\n",month,lastDay);
		
		
	}

	private static void m2() throws Exception {

		//요구사항) 자판기
		// - 메뉴 출력 > 음료선택 >가격출력
		//수정사항)앞으로 사이다 가격은 콜라 가격이랑 똑같이 하겠다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====================");
		System.out.println("        자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("====================");
		System.out.print("선택(번호입력):");
		
		int num = Integer.parseInt(reader.readLine());
		
		//if (num==1) {
		//	System.out.println("700원입니다.");
		//}else if(num==2){
		//	System.out.println("600원입니다.");
		//}else if(num==3)
		//	System.out.println("500원입니다.");
		//System.out.println();
		
		if (num==1 ||num==2) {
			System.out.println("700원입니다.");
		}else if(num==3)
			System.out.println("500원입니다.");
		System.out.println();
		
		
		
		
		switch (num) {
		case 1:
			//System.out.println("700원입니다.");
			//break;
		case 2:
			System.out.println("700원입니다.");
			System.out.println("500원입니다.");
			break;
		case 3:
			System.out.println("500원입니다.");
			break;
		}
		
		
		System.out.println("자판기 종료");
	}

	private static void m1() {

		//요구사항) 숫자 1개를 입력받아 한글로 출력하시오.
		int num = 3;
		String name = "김재형";
		
		if(num==1) {
			System.out.println("하나");
			} else if (num==2) {
				System.out.println("둘");
			} else if (num==3) {
				System.out.println("셋");
			} else {
				System.out.println("나머지 숫자");
			}
		
		switch (num) {
			case 1: //라벨(1:)
				System.out.println("하나");
				break; //제어문을 탈출해라!!
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지숫자");
				break;
		}
		
		
		
	}
}
