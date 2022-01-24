package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex47_String {

	public static void main(String[] args) throws IOException {
		
		//1.메모리의 공간은 한번 할당되면 더이상 늘리거나 줄일 수 없다.
		//2.문자열은 불변(Immutabla)이다. > 한번 만들어진 문자열을 수정할 수 없다.
		//3.문자열 상수는 기존에 똑같은 상수가 존재하면 재사용한다.(소스상의 표기된 데이터를 재사용한다.)
		
		
		int n4 =10;
		n4=n4+1;
		String str6="홍길동";
		str6=str6+"님";
		
		//s1,s2 > 상수
		//s3 > 연산 결과 상수
		//s4 > 콘솔 입력
		
		String s1="홍길동";
		String s2="홍길동";
		String s3="홍";
		s3+="길동"; //연산의 결과로 만들어진 문자열 상수는 기존 상수를 재사용하지않고 새로 생성한다.(내부 문맥이 달라서)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력:");
		String s4 = reader.readLine(); //홍길동
		
		
		System.out.println("s1>"+s1);
		System.out.println("s2>"+s2);
		System.out.println("s3>"+s3);
		System.out.println("s4>"+s4);
		
		//모든 참조형 변수의 비교는 데이터가 비교가 아니라 참조 주소값을 비교한다.
		System.out.println("s1==s2>"+(s1==s2)); //true
		System.out.println("s1==s3>"+(s1==s3)); //false
		System.out.println("s1==s4>"+(s1==s4)); //false
		System.out.println("s3==s4>"+(s3==s4)); //false
		
		System.out.println("s1.equals(s2)>"+(s1.equals(s2)));
		System.out.println("s1.equals(s3)>"+(s1.equals(s3)));
		System.out.println("s1.equals(s4)>"+(s1.equals(s4)));
		System.out.println("s3.equals(s4)>"+(s1.equals(s4)));
		
		//aaa();
		//bbb();
		System.out.println("equals(s1,s2)>"+equals(s1,s2));
		System.out.println("equals(s1,s3)>"+equals(s1,s3));
		System.out.println("equals(s1,s4)>"+equals(s1,s4));
		System.out.println("equals(s3,s4)>"+equals(s3,s4));
		
		
		
	}//main
	
	public static boolean equals(String str1,String str2) {
		
		//1.str1==str2
		//-주소값 비교
		//-
		
		//str1과 str2를 데이터 비교후 결과 반환
		//return str1==str2;
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			if(c1!=c2) {
				return false;
			}
			
		}
		return true;
	}
	
	public void aaa() {
		
	}
	
	public static void bbb() {
		
	}
	
	
	
}
