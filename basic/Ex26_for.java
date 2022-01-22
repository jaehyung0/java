package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex26_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 반복문
		 * - 조건을 만족하면 실행 블럭의 코드를 실행하는 제어문 x반복
		 * 
		 * for문
		 * 
		 * for(초기식; 조건식; 증감식;) {
		 * 		실행문;
		 * }
		 * 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//10바퀴(1~10)
		//for (int i=1; i<=10; i++) {
			
		//}
		
		//9바퀴
		//for (int i=1; i<10; i++) {
			
		//}
		
		//10바퀴(0~9)
		//int i: for문의 지역변수 > for문 실행되는 동안 계속~
		//int n: for문의 지역변수 > for문 한바퀴 동안만 살아있음.
		
		//for (int i=0; i<10; i++) {
		//	int n = 10;
		//	System.out.println(n);
		//	n++;
		//}
		
		
		
	}//main

	private static void m9() throws NumberFormatException, IOException {

		//무한 루프 > 반복횟수가 무한대
		//for(int i=0; i<10; i--) {
		//	System.out.println(i);
		//}
		
		//for(int i=Integer.MIN_VALUE +100; i<10; i--) {
		//	System.out.println(i);
		//}

		//의도적으로 무한루프 만들기
		// -> 반복 횟수를 알 수 없는 경우
		// -> 반복 횟수를 미리 정할 수 없는 경우
		
		//탈출 유무 판단?
		// -> 탈출 필요 -> if + break
		// -> 탈출 필요 -> if + return
		
		
		//for(;;) { //조건이없음
		//	System.out.println("무한루프");
		//}
		
		//for(;true;) {
		//	System.out.println("무한루프");
		//}
			
		//요구사항) 사용자로부터 숫자를 입력 받아 합을 구하시오. 몇개의 숫자를 입력받는지 미정 > 사용자 마음대로
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (;;) {
			System.out.print("숫자(종료 0입력):");
			int num = Integer.parseInt(reader.readLine());
			
			if (num==0) {
				break;
				//return; // 빈 리턴문, Empty Return Statement
			}
			
			sum+=num;
						
		}
		System.out.println(sum);
		
		
	}

	private static void m8() throws NumberFormatException, IOException {
		
		//분기문
		//-break, continue
		//-분기문은 단독으로 사용하지 않는다. > 조건문이나 반복문과 함께 사용한다.
		//-if문을 자신의 영역이라고 인식하지 않는다.
		
		//1.break
		//-자신이 속한 제어문을 탈출한다.
		
		//2.continue
		//-현재 제어를 멈추고 제어의 헤더로 이동한다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자:");
		int num = Integer.parseInt(reader.readLine());
		
		
		for (int i=1; i<=10; i++) {
			
			//break; 쓰면 아래거에 Unreachable code가 나옴
			
			//if (i==num) {
			//	break; //break는 if문이 아닌 for문을 탈출했다.
			//}
			if(i==num) {
				continue;
			}
			System.out.println(i);
		}	
			//초등 선생님 + 학생 30명 상담
			
			for (int j=1; j<=30; j++) {
				//if (j==15) break; //14번까지만 상담
				if (j==15) continue; //15번만 빼고 상담
				System.out.printf("선생님이 %d번 학생을 상담합니다.\n",j);
			}
			
			
		}
		
		
	

	private static void m7() {

		//난수
		//-임의의 수
		
		//1.Math.random() 메소드 **이거로 연습
		//2.Random 클래스 > 1번 Wrapper Class
		
		//Math 클래스
		//- 수학과 관련 기능 제공 클래스
		//System.out.println(Math.PI);
		
		//랜덤한숫자
		//0이상 1미만
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution from that range
		System.out.println(Math.random());
		System.out.println();
		
		
		for(int i=0;i<10;i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}
		
	}

	private static void m6() throws NumberFormatException, IOException {
		//요구사항) 사용자에게 10개의 숫자를 입력받아 그 수의 합을 구하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		
		for(int i=0; i<10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum+=num;
		}
		System.out.println(sum);
	}

	private static void m5() {
		//루프 + 누적 업무
		int sum = 0; //누적변수 선언
		
		sum=sum+1;
		sum=sum+2;
		sum=sum+3;
		sum+=4;
		sum++;
		System.out.println(sum);
		
		//요구사항) 1~10까지의 합을 구하시오.
		//1.누적 변수를 선언한다. 초기화(누적에 영향을 미치치않는다.)
		sum = 0;
		//2.누적될 데이터> 얻기 위한 루프를 생성한다.(수열) >for문
		//for(int i=1; i<=10; i++) {
		for(int i=1; i<=10; i++) {
			//3.누적한다.
			sum = sum+i;
			
		}
		System.out.println(sum);
		
		
		//누적 작업 > 숫자,문자열
		
		//문자열 누적
		String str = "";
		
		for (int i=0; i<10;i++) {
			str = str +"홍길동";
			//str +=i;
			
		}
		System.out.println(str);
		
	}

	private static void m4() throws NumberFormatException, IOException {
		//구구단 출력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇 단을 출력할까요?");
		int dan = Integer.parseInt(reader.readLine());
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %2d\n",dan,i,dan*i);
		}
		
	}

	private static void m3() {
		//요구사항) 1~10사이의 홀수만 출력하세요.
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//요구사항) 10~1까지 출력
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
	}

	private static void m2() {
		//for문의 목적 > 기본
		//1. 반복 횟수 제어
		//2. 루프변수 제어 > 쉬움~어려움 > 연습!!
		
		//요구사항) 숫자 1~10까지 출력하시오. > 수정사항) 20까지 늘리시오. or 숫자뒤에 . 추가
		//1.고객(client) > 계약
		//2.개발자 자신 > 수정 > 요구분석 제대로 파악x
		//				    >구현실수
		//					>변수 다양
		
		int num=5;
		
		for(int i=0; i<10; i++) {
			System.out.println(num+".");
			num++;
		}
		System.out.println();
		
		//루프변수의 역할
		//1.회전수
		//2.루프변수 값 >어떤용도 사용
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println();
		//통상적인 for문의 루프변수 형태
		//-이어지는 작업을 하는데 가장 편한 형태의 for문이다.
		//1. 루프변수를 0으로 시작
		//2. 조건을 부등호만 사용한다.
		
		//1~10사이의 짝수를 출력하시오.
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i=2; i<11; i+=2) {
			System.out.println(i);
		}
		
		
		
		
	}

	private static void m1() {

		//요구사항) "안녕하세요" x5 출력
		
		//int i = 0; 초기식 : 처음 진입할 때 단 1회만 실행한다.
		//i<5		 조건식 : 반복 유무를 결정한다.
		//i++		 증감식 : 조건의 변화를 유발한다.
		
		//int i -> 반복의 횟수를 제어하는 역할 -> 루프 변수(역할)
		for (int i=0; i<5; i++) { //i는 for문을 빠져나가면 죽는 지역변수
		System.out.println("안녕하세요.");
		}
		
		int j =0;
		
		for (j=0; j<5; j++) {
			System.out.println("반갑습니다.");
		}
		
		
		
	}
}
