package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex49_Scanner {

	public static void main(String[] args) {
		
		//콘솔입력
		//1.System.in.read()
		//2.BufferedReader: 주 사용도구
		//3.Scanner: 주 사용도구
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		//국어 영어 수학
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("국어:");
//		int kor = scan.nextInt();
//		System.out.print("영어:");
//		int eng = scan.nextInt();
//		System.out.print("수학:");
//		int math = scan.nextInt();
		
		System.out.print("점수(국어 영어 수학):");  //> 100 90 80
		String input = scan.nextLine();
		String[] temp = input.split(" "); //""안에 있는 글자로 잘라라 
		System.out.println(temp[5]);
		System.out.println(Arrays.toString(temp));
		
		System.out.print("점수(국어 영어 수학):");
		String kor = scan.next();
		String eng = scan.next();
		//String math = scan.next();
		
		System.out.println(kor);
		System.out.println(eng);
	//System.out.println(math);
		
		
	}

	private static void m3() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력:"); //안녕하세요 홍길동님
		
		//String input = scan.nextLine();  //띄어쓰기 가능, 엔터를 만나기까지 가져와라
		String input = scan.next();  // 토큰입력(Token-공백으로 구분되는 하나의 문자)
		System.out.println(input); //안녕하세요
		input = scan.next();  // 토큰입력(Token-공백으로 구분되는 하나의 문자)
		System.out.println(input); //홍길동님
		
	}

	private static void m2() {
		//나이입력 > 태어난 년도 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("나이입력:");
		
		//int age = Integer.parseInt(scan.nextLine());
		int age = scan.nextInt(); //좀 더 편한 방식
		System.out.println(age);
		
		
		
	}

	private static void m1() {
		//이름 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력:");
		String name = scan.nextLine(); //=reader.readLine();
		
		System.out.println(name);
		
	}
}








