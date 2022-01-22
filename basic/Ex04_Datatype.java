package com.test.java;

public class Ex04_Datatype {

	public static void main(String[] args) {
		
		
		//자바 자료형
		// -메모리에 공간이 생기는 구조의 차이
		// 1.값형
		//  -숫자(byte, short, int ,long .float, double)
		//  -문자(char)
		//  -논리(boolean)
		// 2.참조형
		
		//자바 변수
		// - 메모리의 할당된 공간
		// - 용도: 데이터 저장 + 입출력
		// - 가독성 높음 -> 데이터의 의미 부여
		
		//자바 상수(Literal)
		// - 데이터 자체(표기)
		
		//자바 상수(final 변수)
		// - 한번 값을 할당하면 수정이 불가능한 변수
		
		
		//총정리
		// - 모든 자료형 + 변수 생성하기 + 데이터 대입 + 화면 출력
		
		// byte
		byte b1;
		b1=100;
		System.out.println("byte:" + b1);
		
		
		//short
		short s1;
		s1 = 32767;
		s1 = Short.MAX_VALUE;
		System.out.println("short:"+s1);
		
		//int
		int n1;
		n1 = 2100000000;
		n1 = Integer.MAX_VALUE; //최대값
		n1 = Integer.MIN_VALUE; //최소값
		System.out.println("int:" + n1);
		
		//long
		long l1;
		//l1= 10000000000;
		l1=100000000000L; //long
		System.out.println("long:" + l1);
		
		//정수형 리터럴
		// - 사용처에 상관없이 이미 자료형이 정해져있다
		// - 무조건 int
		// - 소스 파일에 적혀있는 모든 정수형 리터럴은 int형이다.
		//byte m1 =10;
		//short m2 =10;
		//int m3 =10;
		//long m4=10;

		// ctrl + alt + 방향키 누르면 복사된다.
		// 이상태로 alt 눌러서 움직일 수 있다
		//float
		float f1;
		f1 = 3.14F;
		System.out.println("float:" + f1);
		
		double d1;
		d1 = 3.14;
		System.out.println("double:" + d1);
		
		f1=12345.1231849023750927590270957237520935F;
		d1=12345.1231849023750927590270957237520935;
		System.out.println("float:" + f1);
		System.out.println("double:" + d1);
		//실수형 리터럴
		// - 아라비안 숫자 + x
		// - double(정밀도)
		// - float 변수에 저장할 실수 상수는 접미어 F를 적어야한다
		// - double 변수에 저장할 실수 상수는 접미어 D를 적어야한다
		
		//byte > 사용 거의 안함
		//short > 이전 시스템과 호환성을 위해 제공하는 자료형 > 거의 사용안함
		//int > 기본 자료형****
		//long > 확장 자료형**** < 숫자가 너무 커서 보기 힘듬
		//float > 이전 시스템과 호환성을 위해 제공하는 자료형 > 거의 사용안함
		//double > 기본 자료형****
		
		//문자형 리터럴(상수)
		// -어떻게 표기할까? -> '문자'
		//char
		char c1;
		c1 = '?';  // 문자에 숫자를 넣으면 수가 아니라 문자
		System.out.println("char:"+c1);
		
		//boolean
		//논리형 리터럴
		//-true, false 예약어 상수표현
		boolean flag;
		flag= true;  //or false
		System.out.println(flag);
		
		//추가 자료형
		//문자열, String  
		//-참조형
		//-문자의 열
		//-문자들의 집합자료형 > N개의 문자들의 모음
		char name1='홍';
		char name2='길';
		char name3='동';
		System.out.println(""+name1+name2+name3);
		//char로 하면 하나씩 다해야되지만 String로하면 한번에 할 수 있다.
		String name;
		name = "홍길동";
		System.out.println(name);
		
		//식별자 명명법 패턴
		//1. 헝가리언 표기법
		//2. 파스칼 표기법
		//3. 카멜 표기법
		//4. 스네이크 표기법
		//5. 케밥 표기법
		
		//1. 헝가리언 표기법
		// - 식별자를 만들 때 식별자의 접두어로 해당 자료형을 표시하는 방법
		// - String strNickname , int inum , byte bscore
		//2. 파스칼 표기법
		// - 식별자 단어의 첫문자를 대문자로 표기 + 나머지 문자를 소문자로 표기
		// - 2개 이상의 단어가 모이면 각 단어의 첫문자를 대문자로 표기
		// - 클래스명에 사용
		// - String StudentName, String BigMac
		//3. 카멜 표기법
		// - 식별자 단어의 첫문자를 소문자로 표기 + 나머지 문자를 소문자로 표기
		// - 2개 이상의 단어가 모이면 2번째단어부터 단어의 첫문자를 대문자로 표기
		// - 변수명, 메소드명에 사용
		// - int noteSize
		//4. 스네이크 표기법
		// - 전부 소문자로 표기
		// - 합성어 > _사용
		//5. 케밥 표기법
		// - 전부 소문자로 표기
		// - 합성어 > -로 연결
		// - 자바에서는 불가능
		
		//개인 과제
		//- 각 자료형별로 > 변수 10개 생성
		
		
		
		//Serial number: NA0125478
		String serialNumber = "NA0125478";
		System.out.println(serialNumber);
	}
}
