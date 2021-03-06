package com.test.java.obj;

public class Ex45_Constructor {

	public static void main(String[] args) {
		
		//생성자, Constructor
		//-메소드
		//-객체의 멤버를 초기화하는 목적을 가진다.
		//-클래스의 이름과 동일한 이름을 가지는 메소드
		//-메소드의 이름 동일 + 매개변수 다르게 => 메소드 오버로딩 -> 생성자 오버로딩
		
		//클래스 > 객체 생성
		//- 클래스명 객체명 = new 클래스명();
		//- 클래스명 객체명 = 객체생성연산자 생성자();
		//- new: 객체를 생성한다
		//- 생성자: new가 만든 객체의 내부를 초기화한다.
		
		Bottle b1 = new Bottle();
		b1.setColor("white");
		b1.setCapacity(500);
		
		System.out.println(b1.getColor());
		System.out.println(b1.getCapacity());
		
		Bottle b2 = new Bottle();
				
		System.out.println(b2.getColor());
		System.out.println(b2.getCapacity());
		
		//노란색 + 350ml 
		Bottle b3 = new Bottle();
		
		//내가 원하는 값으로 설정 -> setter 사용
		b3.setColor("노란색");
		b3.setCapacity(350);
		
		Bottle b4 = new Bottle();
		//setter필요없음 > 이미 원하는 모습으로 완성되어있어서
		//생성자의 역할 > 객체를 내가 원하는 상태로 초기화
		
		//파란색 + 550ml
		Bottle b5 = new Bottle(); // 노란색 + 350ml
		b5.setColor("파란색");
		b5.setCapacity(550);
		
		//객체를 생성함에 있어서 개발자가 원하는 형태를 손쉽게 선택할 수 있도록
		//1.기본 생성자(인자가 없는 생성자)는 "노랑+350"을 생성
		//2.오버로딩 생성자(인자가 있는 생성자)는 원하는 생깔과 용량을 생성
		Bottle b6 = new Bottle("파란색",550);
		System.out.println(b6.getColor());
		System.out.println(b6.getCapacity());
		
		
	}
}

class Bottle{
	private String color;
	private int capacity;
	
	//Bottle() -> 기본 생성자 > 개발자가 클래스를 선언할 때 생성자를 명시적으로 만들지 않으면 자바가 자동으로 만들어 준다.
	//1. 메소드명이 클래스명하고 동일
	//2. 반환값 기재 안함 > 생성자는 반환값을 가질 수 없다. >표현 안함
	//3. return문을 가질 수 없다.
	//4. 구현의 내용은 해당 클래스의 멤버 변수를 초기화 하는 역할
	public Bottle() {
		//this.color=null;
		//this.capacity=0;
		//this.color="black";
		//this.capacity=200;
		this.color="노란색";
		this.capacity=350;
		
	}
	
	public Bottle(String color, int capacity) {
		//setter 역할 = setColor +setCapacity
		this.color=color;
		this.capacity=capacity;
			
	}
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}

