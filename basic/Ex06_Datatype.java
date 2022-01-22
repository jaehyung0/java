package com.test.java;

public class Ex06_Datatype {

	public static void main(String[] args) {
		
		//요구사항) 변수2개, 숫자대입 , 더하기연선, 연산과정과 결과를 출력
		//10+20=30
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		//변수나 식별자가 ""안에 들어가면 평범한 문자열이 된다.
		//1+2+3+4+5 -> 왼쪽에서 오른쪽으로 계산
		System.out.println(a+"+"+b+"="+a+b);
		System.out.println(a+"+"+b+"="+(a+b));
		
		//주민등록번호 9408171010101
		int jumin = 940817;
		System.out.println("주민번호:"+jumin);
		
		//주민등록번호 0108173010101
		jumin = 010717; //앞에 0이있으면 8진수가 됨 ,0x는 16진수
		System.out.println("주민번호:"+jumin);
		jumin =0xFFCC; //16진수
		System.out.println(jumin);
		
		//숫자형태를 가지는 데이터를 취급할 때 주의점
		//1. 나이 > 숫자형 > 가능
		//2. 주민등록번호 > 숫자형으로 취급 불가능 > 문자열
		//해당 데이터를 산술 연산 할것인가? O(숫자형), X(문자열)
		String jumin1="010817";
		System.out.println(jumin1);
		
		//변수사용시
		//변수는 값이 초기화 되지 않으면(값을 갖고 있지 않으면) 사용이 불가
		int num; //생성 직 후 상태 -> null
		//System.out.println(num);
		
				
	}

}
