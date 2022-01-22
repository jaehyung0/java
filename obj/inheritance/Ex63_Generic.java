package com.test.java.obj.inheritance;

public class Ex63_Generic {

	public static void main(String[] args) {
		
		//제네릭 클래스 객체 생성 방법
		Item<String> item = new Item<String>();
		item.a = 10;
		item.b ="문자열";
		item.c="문자";
		
		Item<Integer> item2 = new Item<Integer>();
		item2.c=30;
		
		//제네리겡 전달할 자료형(실인자)은 반드시 참조형만 가능하다.
		Mouse<Boolean> m1 = new Mouse<Boolean>();
		
		Monitor<String,Integer> m2 = new Monitor<String,Integer>("모니터",200000);
		System.out.println(m2.getA());
		System.out.println(m2.getB());
		
		Monitor<Boolean,Double> m3 = new Monitor<Boolean,Double>(false,3.14);
		System.out.println(m3.getA());
		System.out.println(m3.getB());
		
	}
	
//	public static void test(미정 a) {
//		//자료형이 결정되지 않아서 무슨 코드를 짜야되는지 확신하지 못한다. 
//	}
	
}

//int a = 10; > 데이터를 담느 ㄴ공감
//T = int; > 자료형을 담는 공간
//T = Scanner;
//T = Boolean;


//제네릭 클래스
//-T:변수(타입 변수) < 아무거나 적어도됨, 보통 T를 씀
//-<>:매개변수
class Item<T> {
	
	public int a;
	public String b;
	public T c; //c의 자료형을 알지못함
}

class Mouse<T>{
	public T a;
	public T b;
	public T c;
}

class Keyboard<T>{
	public T a;
	public void test(T a) { //메소드의 매개변수
		T b; //지역에서는 사용금지 > 통제가 힘들어서...
	}
	
	public T get() { //메소드의 반환값
		return a;
	}
}

class Monitor<T,U>{
	public T a;
	public U b;
	
	
	public Monitor(T a, U b) {
		
		this.a = a;
		this.b = b;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public U getB() {
		return b;
	}
	public void setB(U b) {
		this.b = b;
	}
	
	
}

