package com.test.java;

public class Ex29_while {

	public static void main(String[] args) {
		
		//조건문
		//1. if
		//2. switch
		
		//반복문
		//3.for
		//4.while
		//5.do while
		//6.for
		
		//분기문
		//7.break
		//8.continue
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
		
		//do while
		
		//while문 :선조건 후실행
		/*
		while() 
		{
			
		}
		
		//do while문 :선실행 후조건
		{
			
		}
		while() 
		*/
		
		int n=20;
		
		do {
			System.out.println(n);
			n--;
		} while(n>=10);
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		//누적값 > 1000
		
		int sum = 0;
		int n = 1;
		
		while(sum<1000) {
			sum+=n;
			n++;
			
		}System.out.println(sum);	
		
		sum =0;
		n=1;
		
		while(true) {
			sum+=n;
			n++;
			
			if (sum>=1000) {
				System.out.println(n);
				break;
			}
		}
		System.out.println(sum);
		
		
		sum =0;
		n=1;
		
		while(true) {
			sum+=n;
			n++;
			
			if (sum>=1000) {
				System.out.println(n);
				break;
			}
		}
		System.out.println(sum);
		
		
		sum=0;
		
		for(int i=1;sum<1000;i++) {
			sum+=i;
					
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

	private static void m2() {
		
		//구구단출력
		int n =1;
		int dan = 5;
		
		while(n<=9) {
			System.out.printf("%d x %d = %d\n",dan,n,dan*n);
			n++;
		}
		
	}

	private static void m1() {
		
		//while
		//-for문과 유사
		//-조건에 따라 반복 제어를 하는 제어문
		
		//if: 조건에 따라 1회 실행
		//while: 조건에 따라 N회 실행
		
		
		//while (조건식) {
		//실행문;
		//}
		
		//요구사항) 숫자 1~10까지 출력
		for(int i=1;i<=10;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		//while문
		int n = 1;
		
		while (n<=10) {
			System.out.printf("%3d",n);
			n++;
		}
		System.out.println();
		
		
		
		
	}
}
