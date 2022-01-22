package com.test.java.obj.inheritance;


import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Ex62_Generic {

	public static void main(String[] args) {
		
		//제네릭,Generic
		//1.제네릭 클래스 >***
		//2.제네릭 메소드
		
		//요구사항) int -> Integer
		//1.int값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		//2.String값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		//3.Boolean값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		
		WrapperInt n1 = new WrapperInt(10); 
		System.out.println(n1);
		System.out.println(n1.getData()*2);
		
		WrapObject n2 = new WrapObject(20);
		System.out.println((int)n2.getData()*2);
		
		System.out.println();
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		
		WrapObject n3 = new WrapObject("아무개");
		System.out.println(n3);
		System.out.println(((String)n3.getData()).length());
		
		System.out.println();
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData()? "참": "거짓");
		
		WrapObject b2 = new WrapObject(false);
		System.out.println(b2);
		System.out.println((boolean) b2.getData()? "참": "거짓");
		//m1();
		
		
		//1. 클래스 1개로 모두 사용 가능(object 클래스의 장점)
		//2.원래 자료형으로 되돌릴 필요 없음(전용 클래스의 장점)
		Wrapper<Integer> w1 = new Wrapper<Integer>(30); //범용 클래스
		System.out.println(w1);
		System.out.println(w1.getData()*2);
		
		Wrapper<String>	s3 = new Wrapper("대한민국");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3);
		System.out.println(b3.getData()? "참":"거짓");
		
		//자바 배우는 수업내용
		//- 중후반(클래스 수업) > 이려운 기술(상속, 제네릭 등)
		//- 우리가 직접 구현할 횟수보다 만들어진걸 수정할 일이 더 많다.
	}

	private static void m1() {
		
		Parent p = new Parent();
		Parent p2 = new Child(); //업캐스팅
		
		//Object 참조 변수는 세상의 모든 자료형을 담을 수 있는 변수이다.
		
		Object o1 = new Object();
		Object o2 = new Parent(); //업캐스팅
		Object o3 = new Child();  //업캐스팅
		Object o4 = new Random();
		Object o5 = new Scanner(System.in);
		Object o6 = Calendar.getInstance();
		Object o7 ="문자열";
		Object o8 = new int[5];
		
		Object[] list = new Object[5];
		list[0]=new Parent();
		list[1]=new Random();
		list[2]=new Scanner(System.in);
		
		//참조값 변수
		int n = 10;
		Object o9 = 10; //박싱(boxing) 발생 > new Integer(10);
		
		System.out.println(n*8);
		System.out.println((int)o9*9); //언박싱(UnBoxing)
		
		
		
		Object o10 = "홍길동";
		Object o11 = true;
		
		System.out.println(o11);
		
		//정수 생성
		int a =10;
		Integer b = new Integer(20);
		Integer c = 30;
		
	}
}


class WrapperInt {
	
	private int data; //클래스의 중심이 되는 데이터
	
	public WrapperInt(int data) {
		this.data=data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		//String.valueOf(100) -> "100"
		//Integer.toString(100) -> "100"
		//100+""-> "100"
		return this.data+"";
	}
	
	
}


class WrapperString {
	
	private String data; //클래스의 중심이 되는 데이터
	
	public WrapperString(String data) {
		this.data=data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		//String.valueOf(100) -> "100"
		//Integer.toString(100) -> "100"
		//100+""-> "100"
		return this.data+"";
	}
	
	
}

class WrapperBoolean {
	
	private boolean data; //클래스의 중심이 되는 데이터
	
	public WrapperBoolean(boolean data) {
		this.data=data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		//String.valueOf(100) -> "100"
		//Integer.toString(100) -> "100"
		//100+""-> "100"
		return this.data+"";
	}
	
	
}

//일당백 클래스
//-WrapperInt, WrapperString, WrapperBoolean -> WrapObject 혼자서 해결
class WrapObject {
	private Object data;
	
	public WrapObject(Object data) {
		this.data=data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+"";
	}
}

class Wrapper<T>{
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+"";
	}
}
