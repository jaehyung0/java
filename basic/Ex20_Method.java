package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		//메소드 용법
		// -> swap 업무
		
		int a = 10;
		int b = 20;
		swap(a, b);

		String s1 = "홍길동";
		String s2 = "아무개";
		swap(s1, s2);

		boolean b1 = true;
		boolean b2 = false;
		swap(b1, b2);
		
	}
		
	public static void swap(int a, int b) {
		System.out.printf("a:%d, b:%d\n", a, b);

		// swap 작업
		int empty; // 빈컵
		empty = a;
		a = b;
		b = empty;
		System.out.printf("a:%d, b:%d\n", a, b);
	}
	
	public static void swap(String s1, String s2) {

		System.out.printf("s1: %s, s2: %s\n", s1, s2);

		String s3; // 빈컵

		s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.printf("s1: %s, s2: %s%n", s1, s2);
	}
	
	public static void swap(boolean s1, boolean s2) {

		System.out.printf("s1: %b, s2: %b\n", s1, s2);

		boolean s3; // 빈컵

		s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.printf("s1: %b, s2: %b", s1, s2);
	}
	
	
	
	
}
