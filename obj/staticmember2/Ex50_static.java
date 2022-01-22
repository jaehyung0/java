package com.test.java.obj.staticmember2;

public class Ex50_static {

	public static void main(String[] args) {
		
		//사용법 정리 -> 그림에 기반한 설명
		Keyboard k1 = new Keyboard("K800",80000);
		System.out.println(k1.info());
	
		//객체 메소드
		k1.m1();
		
		//정적 메소드
		Keyboard.m2();
		
	}

	
}
//클래스 선언!! > 가이드 라인
//1. private + 변수 선언
//	-1) 객체 변수 선정(개인데이터) >> 99.99%
//	-2) 정적 변수 선정(공용데이터) >>  0.01%
//      >> 사물함 -> 개인 사물함 + 공용 사물함 -> 뭐가 더 관리하기 쉬울까?
//2. 생성자
//  -1) 기본생성자 필수 (관습)
//  -2) 오버로딩 생성자(필요에 따라)
//  -3) 정적변수 존재 > 정적 생성자
//3. 메소드
//  -1) getter/setter (필요에따라)
//  -2) 업무용 메소드(*****메인) >> 업무 + 행동



class Keyboard {
	//개인 데이터
	private String model;
	private int price;
	
	//공용데이터 로지텍 키보드
	private static String brand;
	
	//객체 생성자
	public Keyboard() {
		this.model="";
		this.price=0;
	}
	
	public Keyboard(String model, int price) {
		this.model=model;
		this.price=price;
	}
	
	//정적 생성자
	static {
		Keyboard.brand = "로지텍";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Keyboard.brand = brand;
	}
	
	
	public String info() {
		return String.format("%s(%s)",this.model,this.price);
	}
	
	//객체 메소드 > 객체변수 접근가능, 정적변수 접근가능
	//정적 메소드 > 객체멤버 접근불가능, 정적멤버 접근가능
	
	
	
	//메소드 > 객체 메소드
	public void m1() {
		//객체 변수
		System.out.println("객체변수:"+this.model);
		
		//정적변수
		System.out.println("정적변수:"+Keyboard.brand);
		
		
	}
	
	//정적 메소드
	public static void m2() {
		//객체 변수
		//System.out.println("객체변수:"+this.model);
				
		//정적변수
		System.out.println("정적변수:"+Keyboard.brand);
	}
	
	
	
	
}



class User{
	private int a;
	private int b;
	
//	public static void test() { //정적메소드에서 객체변수 못씀
//		System.out.println(this.a);
//		System.out.println(this.b);
//	}
	
	public void test2() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
}








