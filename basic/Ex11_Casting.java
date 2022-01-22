package com.test.java;

public class Ex11_Casting {

	public static void main(String[] args) {
		
		/*
		 * (자료)형변환, (Data)Type Casting
		 * - int -> double
		 * - float -> short
		 * 
		 * 1. 암시적 형변환, 자동 타입 변환
		 *  - 큰형 = 작은형;
		 *  - 100% 안전하다
		 *  - short = byte; 2칸=1칸;
		 *  - int  = byte; 4칸=1칸;
		 *  - long = byte; 8칸=1칸;
		 *  - long = short; 8칸=2칸;
		 *
		 * 2. 명시적 형변환, 강제 타입 변환
		 *  - 작은형 = 큰형
		 *  - 경우에 따라 다르다.(작은형이 소화할 수 있는 범위의 원본값이면 가능. 벗어나면 불가능)
		 *		> 개발자가 직접처리 (컴파일러나 실행기는 이 문제는 인식하지 못한다.) > 논리 에러
		 *	 
		 * 
		 */
		//'=' 연산자
		//-피연산자 2개 > 2항 연산자
		//-대입연산자, 할당연산자
		//-변수=값(상수(literal),변수)
		//-int n = 10;
		//-int m=n; <변수끼리 복사
		//-LValue = RValue
		//-LValue : 변수
		//-RValue : 리터럴, 변수 ,메소드 반환값(reader.readLine())
		//-Lvalue의 자료형과 RValue의 자료형은 반드시 동일해야 한다.
		// >> 이 규칙을 만족하지 못하면 연산자는 오류를 발생시킨다. (복사x)
		
		byte b1=10; //1칸. 원본
		short s1;   //2칸. 복사본
		s1=b1;
		System.out.println("s1:" +s1); //복사본만 확인하면 된다.
		//short = byte > 에러발생!? > 미발생??
		//컴파일 > s1 = (short)b1;
		//(자료형):형변환 연산자 > 우측값의 자료형을 괄호안의 자료형으로 변환시키는 연산자
		//s1=(short)b1; -> s1=(short)10; byte10 -> s1=10; short10
		//그래서 암시적인 형변환이라고 한다.  (Implicit Type Casting)
		// - 개발자 모르게 형변환이 발생했기 때문에
		
		
		//명시적 형변환때 발생하는 넘치는 현상 >>오버플로우(overflow)
		//아래로 넘치는 형상 >> 언더플로우(underflow)  >>보통 둘다 overflow라고 부른다.
		short s2=-129; //2칸 원본
		byte b2;     //1칸 복사본
		b2 = (byte)s2;
		System.out.println("b2:" +b2);
		
		//은행계좌 프로그램
		//은행(서울점)
		int money = 2100000000;
		
		// 은행(강남점)
		short copy;
		//이체
		copy = (short)money;
		//강남점에서 보는 금액 ㄷㄷ
		System.out.println("잠실 계좌 잔액:" + copy);
		
		//-Lvalue의 자료형과 RValue의 자료형은 반드시 동일해야 한다.
		// >> 이 규칙을 만족하지 못하면 연산자는 오류를 발생시킨다. (복사x)
		
		//예외 상황 : byte와 short변수에 상수를 할당할때는 예외로 암시적 형변환을 지원한다.
		//byte = int  명시적 형변환
		byte m1 =10; //byte m1 = (byte)10;
		
		//short = int  명시적 형변환
		short m2 =10; //short m2 = (short)10;
		
		//int=int
		int m3=10;
		
		//long = int
		//큰형 = 작은형  <<암시적 형변환
		long m4=10;
		
		//실수형 리터럴 > double형
		
		//float = double
		//작은형 = 큰형   <<명시적 형변환
		float f1 = (float)3.14;
		float f2 = 3.14F;
		//double = double
		double d1 = 3.14;
		
		// 실수형과 정수형끼리의 형변환
		//int <<float
		int n1 = 1000; //원본(4바이트)
		float k1; 	   //복사본(4바이트)
		//float=int
		k1=n1;
		System.out.println("k1:" + k1);
		
		//n1=k1; 은 에러
		//int=float <<명시적 형변환
		n1=(int)k1;
		System.out.println("n1:" + n1);
		
		//정리 byte < short < int < long < float < double
		//모든정수는 모든 실수보다 크기가 작다.
		
		//char, boolean - 형변환 > boolean불가능
		
		//char > 겉보기엔 문자, 내부는 숫자 > 형변환의 대상이 된다.
		// -> 반드시 int, long을 사용해야한다. (long 는 과유불급 ,int 권장)
		
		char c1 ;  //2byte
		short r1=65; //2byte
		//short = char
		c1=(char)r1;
		System.out.println("c1:" + c1);
		
		char c2;
		short r2=97;
		c2=(char)r2;
		System.out.println("c2:" +c2);
		
		//결론
		//값형끼리의 형변환! -> 숫자형끼리의 형변환!
		//연습
		//1.int <-> long  정수끼리
		
		//2.int <->double 	정수 실수
		//3.long <->double  정수 실수
		
		//4.int <->char    정수 문자
		
	}
}
