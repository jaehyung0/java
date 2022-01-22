package com.test.java.obj;



public class Ex36_Access {

	public static void main(String[] args) {
		
		//접근 지정자(제어자), Access Modifier
		//-public, private, prtected, default
		//-클래스 멤버에 붙여서 사용한다.
		//-크ㅜㄹ래스(객체)의 영영ㄱ을 기준으로 외부에 해당 멤버의 노출의 수위를 조절하는 역할
		
		//1.public
		//- 외부에 100% 공개
		//2.private
		//- 외부에 100% 비공개
		
		//Book book = new Book();
		
		//book.title = "자바의 정석";
		//book.author = "남궁성";
		
		//
		//book.info();
		//book.publish();
		
		//키보드
		/*
		 * Keyboard k1 = new Keyboard();
		 * 
		 * k1.model = "해피해킹"; k1.price = 450000;
		 * 
		 * System.out.printf("모델명: %s, 가격: %,d원\n",k1.model,k1.price);
		 * 
		 * Keyboard k2 = new Keyboard();
		 * 
		 * k2.model="한성키보드"; k2.price=2100000000;
		 * System.out.printf("모델명: %s, 가격: %,d원\n",k2.model,k2.price);
		 */
		
		//Keyboard k3 = new Keyboard();
		//k3.model
//		k3.aaa("삼성키보드");
//		System.out.println(k3.bbb());
//		
//		k3.ccc(30000333);
//		System.out.println(k3.ddd());
		//k3.setModel("한성키보드");
		
		Keyboard k4 = new Keyboard();
		k4.setModel("A004");
		k4.setPrice(50000);
		System.out.println(k4.getModel());
		System.out.println(k4.getPrice());
		
		
		//클래스
		//1. 클래스 생성 목적 : 같은 형식을 가지는 데이터의 집합(행동의 집합)을 만들기 위한 틀
		//2. 클래스 멤버 변수 : 객체가 가지는 자신만의 데이터 저장소
		//3. 클래스 멤버 메소드 : 객체가 할 수 있는 행동 > 자신의 데이터를 활용
		//4. public : 외부에서 내부 멤버 변수(메소드)에 접근할 수 있는 상태
		//4. private : 외부에서 내부 멤버 변수(메소드)에 접근할 수 없는 상태
		//    ->a. 멤버 변수는 무조건 private로 만든다.
		//	  ->b. 감춰진 멤버 변수 setter/getter 메소드를 만들어서 접근(제어)한다.
		//	  ->c. 멤버 메소드는 상황에 따라 public/private로 한다.
		//    -> 모르겠으면 일단 private로 하고 나중에 public로 한다.
		
		
		
		
		
		
	}//main
	
}//Ex_Access

/*
 * class Book {
 * 
 * public String title; private String author;
 * 
 * public void info() {
 * 
 * }
 * 
 * private void publish() {
 * 
 * } }
 */

class Keyboard {
	
	//public String model;
	//public int price;
	
	
	
	/*
	 * public void aaa(String str) { //System.out.println(model); model = str; }
	 * 
	 * public String bbb() { return model; }
	 * 
	 * 
	 * public void ccc(int n) { if(n>=0&&n<=500000) price =n; else
	 * System.out.println("잘못된 가격"); }
	 * 
	 * public int ddd() { return price; }
	 */
		
	//setter
	//-setXXX
	//-외부 -> 내부
	
	private String model;
	private int price;
	
	//model
	public void setModel(String model) {
		//멤버 변수와 지역 변수가 충돌 발생 > 지역변수가 이김
		//유효성 검사
		//if(조건) {}
		this.model = model;
	}
	
	//getter
	//-getXXX
	//-내부 -> 외부
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(int price) {
		//유효성 검사
		//if(조건) {}
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
}