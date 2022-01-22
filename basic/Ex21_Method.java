package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {
		
		//TODO 나중에 다시와서 수업할 것!!
		//재귀 메소드, Recursive Method ==>> 번분수 느낌!!
		
		//m1();
		//m2();
		
		int n =4;
		int result = factorial(n);
		System.out.printf("%d!=%d",n,result);
	}//main

	private static int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}

	private static int a=0;
	//재귀 메소드
	private static void m2() {
		
		System.out.println("a: "+a); 
		a++;
		
		if(a<10) {
			m2();
		}
			
		
		
	}

	private static void m1() {
		System.out.println(System.currentTimeMillis());
		
		//메소드 호출
		m1();
		
		//StackOverflowError -> 메모리가 꽉차서 중단
		
		
	}
}
