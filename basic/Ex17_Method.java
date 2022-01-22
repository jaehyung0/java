package com.test.java;

public class Ex17_Method {

	public static void main(String[] args) {
	m1("김재형"); //실인자
	m1("홍길동");
	m1("");
	m2(10);
	m2(-5);
	System.out.println();
	//매개변수가 2개 > 전달할 값 2개
	m3(10,3);
	System.out.println();
	m3(1234,15);
	System.out.println();
	m4("김재형",28);
	m4("홍길동",15);
	
	//매개변수의 개수와 전달하는 값으 개수는 반드시 일치해야된다.
	//m4("홍길동",20,10); 에러
	//매개변수의 순서도 반드시 일치 해야 된다.
	//m4(20,"홍길동"); 에러
	
	//메소드의 매개변수
	//1. 개수
	//2. 자료형
	//3. 순서
		
	}//main
	
	public static void m1(String name) { //가인자
		System.out.println(name + " 안녕~");
	}
	
	public static void m2(int num) {
		System.out.println(num>0 ? "양수" : "양수 아님");
	}
	//매개변수의 갯수는 0~255개 > 1개~3,4개 정도 쓴다.
	public static void m3(int a, int b) {
		System.out.printf("%,d + %,d = %,d\n",a,b,a+b);
		System.out.printf("%,d - %,d = %,d\n",a,b,a-b);
		System.out.printf("%,d * %,d = %,d\n",a,b,a*b);
		System.out.printf("%,d / %,d = %,.1f\n",a,b,a/(double)b);
		System.out.printf("%,d %% %,d = %,d\n",a,b,a%b);
	}
	
	public static void m4(String name, int age) {
		String result = age >=19 ? "성인" : "미성년자";
		System.out.printf("입력한 %s님은 %s입니다.\n",name,result);
	}
	
	
}
