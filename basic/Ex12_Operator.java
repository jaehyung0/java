package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_Operator {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 연산자, Operator
		 *  - 피연산자를 대상으로 미리 정해진 연산을 한 후에 연산의 결과를 돌려주는 요소
		 *  - +,-,/,x 주로 기호를 많이 사용 + 단어도 많이 사용
		 * 
		 * 1.문장 (Statement)
		 * 2.표현식(Expression)
		 * 3.연산자
		 * 4.피연산자
		 * 5.연산자 우선순위
		 * 6.연산자 연산방향
		 * 
		 * 연산자의 종류
		 * 1.산술 연산자
		 * 2.비교 연산자
		 * 3.논리 연산자
		 * 4.대입 연산자
		 * 5.증감 연산자
		 * 6.조건 연산자
		 * 7.비트 연산자(x) 우린 안배움
		 * 
		 */
		//문장(statement)
		//int sum = 10 + 20;
		
		//표현식
		//int sum
		//10+20
		//sum=30
		
		//연산자 
		//+,=
		//피연산자
		//= > sum, 30
		//+ > 10,20
		
		//1.산술연산자
		// +,-,*,/,%
		// 이상연산자
		// 피연산자를 숫자형을 가진다. (정수, 실수)
		
		double a=738048;
		double b=7;
		
		
		System.out.printf("%.0f + %.0f = %.0f\n",a,b,a+b);
		System.out.printf("%.0f - %.0f = %.0f\n",a,b,a-b);
		System.out.printf("%.0f * %.0f = %.0f\n",a,b,a*b);
		System.out.printf("%.0f / %.0f = %.4f\n",a,b,a/b);
		System.out.printf("%.0f %% %.0f = %.0f\n",a,b,a%b);
		
		//나누기 연산자 -> 하나만 실수여도 계산결과는 실수로 나온다.
		System.out.println(10/3); //3
		System.out.println(10.0/3.0); //3.3333333333
		System.out.println(10.0/3); //3.3333333333
		System.out.println(10/3.0); //3.3333333333
		
		//근본 원인
		// -모든 산술 연산자의 결과 자료형은 두 피연산자 중에서 크기가 더 큰 자료형으로 반환이된다.
		
		//+,-,* 둘 다 신경쓸것
		// / : 소수 이하를 남길지 말지 결정
		int c=1000000000;
		int d=1000000000;
		int e=2000000000;
		int f=Integer.MIN_VALUE;
		
		System.out.println(c+d);//int
		System.out.println(c+e);//int+int=int
		System.out.println(c+(long)e);//int+long=long
		System.out.println((long)c+(long)e);
		System.out.println(1000000000+2000000000L);
		System.out.println(f-1);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//2.비교연산자
		//- >,<,>=,<=,==(equals),!=(같지않다. !:not -> not equals)
		//- 2항 연산자
		//- 피연산자들의 우위 비교하는 역할
		//- 피연산자를 숫자형을 가진다.
		//- 연산의 결과가 boolean이다.
		
		int p=10;
		int q=3;
		
		System.out.printf("%d>%d=%b\n",p,q,p>q);
		System.out.printf("%d>=%d=%b\n",p,q,p>=q);
		System.out.printf("%d<=%d=%b\n",p,q,p<=q);
		System.out.printf("%d<%d=%b\n",p,q,p<q);
		System.out.printf("%d==%d=%b\n",p,q,p==q);
		System.out.printf("%d!=%d=%b\n",p,q,p!=q);
		
		
		//요구사항) 나이를 입력>원하는나이? 유효성 검사. 19세 이상
		int age =25;
		System.out.println(age >=19); //사용함
		System.out.println(19<=age); //사용안함
		//A>B
		//주체>비교
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//요구사항) 사용자 키보드 입력 > 문자 1개 > 영어 소문자인지 판단?
		//유효성 검사, Validation Check
		//->프로그램에서 쓸모가 있는 데이터인지 판별하는 작업
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("영소문자 입력:");
		String input = reader.readLine();
		char c1=input.charAt(0); //input("A") ->c1('A')
		System.out.println((int)c1>=97);
		System.out.println((int)c1<=122);
		
		System.out.println((int)c1>=(int)'a');
		System.out.println((int)c1<=(int)'z');
		
		//char ->숫자형 -> 직접 비교 가능
		System.out.println(c1>='a');
		System.out.println(c1<='z');
		
		//System.out.println("A">"B");  String > String 불가능
		
		//사용자가 입력하는 모든 데이터 > 반드시 유효성 검사 필요
		
		
		
		
	}
}
