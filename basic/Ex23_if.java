package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_if {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 교재 chapter 4
		 * 
		 * 프로그램 > 자료구조 + 알고리즘
		 * 
		 * 
		 * 제어문
		 * - 수많은 명령어들을 제어(통제) 역할하는 문장
		 * - 조건 제어, 반복 제어, 분기 제어
		 * 
		 *1. 조건문
		 *	- 개발자가 조건을 제시해서 프로글매의 흐름을 제어할 수 있다.
		 *		a. if
		 *		b. switch
		 *		
		 *
		 *2.반복문
		 *	- 특정 코드를 개발자가 원하는 횟수만큼 반복 실행을 제어할 수 있다.
		 *		a. for
		 *		b. while
		 *		c. do while
		 *		d. for(향상된 for문, Enhanced For Statement) > foreach
		 *
		 *3.분기문 
		 *	- 개발자가 코드의 흐름을 원하는 곳으로 순간 이동을 할 수 있다.
		 *		a. break
		 *		b. continue
		 *		c. goto(JDK 1.5폐기)
		 *
		 *
		 */
		//m1();
		//m2();
		m3();
		
		/*
		 * 일반적은 프로그래밍 언어
		 * 
		 * 조건문의 조건식
		 * - boolean 사용, boolean이 아니어도 사용이 가능하다.
		 * - 자바는 무조건 boolean을 사용한다.
		 * - C언어는 boolean이 없다. > 
		 * - 정수:0(false), 1(true), 그 이외의 숫자(true)
		 * - 실수: 0.0(false), 그 이외의 숫자 true
		 * - 문자: \0(null 문자, 문자코드값(0))(false), 그이외의 문자(true)
		 * - 문자열 ""(빈문자열, Empty String)(false), "홍길동"(true)
		 * 
		 * 
		 * int n= 10;
		 * 
		 * inf (n) {
		 *		//참
		 * }else{
		 * 		//거짓
		 * }
		 * 
		 */
		
		
		
		
		
		
	}//main

	private static void m3() {
		//중첩된 제어문
		
		//중첩된 if문 > Nested if Statment
		/*
		 * if(조건식){
		 * 		실행코드;
		 * 		if (조건식){
		 * 
		 * }
		 * }else {
		 * 		if (조건식){
		 * 		}	
		 * }
		 *  
		 */
		
		//국어점수입력 > 합격 vs 불합격
		// > 60점이상 합격
		// > 0~100만 유효하게
		
		int kor = 105;
		
		//조건 3가지
		//1. 합격조건
		//2. 불합격 조건
		//3. 벗어난 조건
		if (kor>=60 && kor <= 100) {
			System.out.println("합격");
			
			}
		else if(kor>=0 && kor <60){
			System.out.println("불합격");
		}
		else {
			System.out.println("올바르지 않은 점수입니다. 0~100점 사이를 입력하세요.");
		}
		
		if(kor <= 100 && kor >=0) {
			if (kor >=60) {
			System.out.println("합격");}
			else  {
				System.out.println("불합격");
			}
		}else {
				System.out.println("오류");
			}
		
		
		
		
		
		
		
	}

	private static void m2() {
		// -if문
		// -3항 연산자
		int n=10;
		if (n>0) {
			System.out.println("양수");
		}
		else {
			System.out.println("음수");
		}
		
		String result = (n>0)? "양수":"음수";
		System.out.println(result);
		
		
		
	}

	private static void m1() throws NumberFormatException, IOException {

		/*
		 * if문
		 * - 개발자 > 조건을 제시한 후 결과에 따라 실행할 코드를 선택할 수 있게 하는 제어
		 * - 조건 > 반드시 boolean을 가지는 변수, 표현식
		 * 
		 * if(조건식){실행문;}
		 *  
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자입력:");
		int num = Integer.parseInt(reader.readLine());
		
		
		if(num > 0) {
			System.out.printf("입력한 숫자 %d는 양수입니다.\n",num);
		}
		else {
			System.out.printf("입력한 숫자 %d는 양수가 아닙니다.\n",num);
		}
		
		//다중 조건문, 다중 if문
		if (num >0) {
			System.out.printf("입력한 숫자 %d는 양수입니다.\n",num);
		}
		else if (num <0) {
			System.out.printf("입력한 숫자는 %d는 음수입니다.\n",num);
		}
		else if (num==0) {
			System.out.println("입력한 숫자 0입니다.");
		}
		
		System.out.println();
		
		System.out.println("프로그램을 종료합니다.");
		
		System.out.println("아침에 눈을 떳다");
		
		System.out.print("지금 몇시지?");
		int hour = Integer.parseInt(reader.readLine());
		
		if (hour <8) {
			System.out.println("아침밥을 먹는다.");
		}
		else if(hour <=9){
			System.out.println("편의점에 김밥을 산다.");
		}
		else{
			System.out.println("회사에 미리 전화를 한다.");
		}
		System.out.println("지하철을 타고 출근한다.");
		
		
		
		/*
		[]: 사용해도 되고 생략해도 된다.
		if(조건식 ) {
			실행문;
		}
		[else if (조건식) {
			실행문;
		}] x N
		[else {
			실행문;
		}]
		
		*/
		
	}//m1
		
			
		
		
}
