package com.test.java.obj.inheritance.override;

import java.util.Date;

public class Ex55_ToString {

	public static void main(String[] args) {
		
		//자바 콘솔 출력 명령어(print, println, printf)는 객체를 출력하면 자동으로 객체의
		// toString()메소드를 호출한다.
		
		//toString() > 모든 클래스가 소유하고 있다.
		
		//1. 오버라이드에 대해 설명하세요.
		//- 메소드 오버라이드는 상속시 자식 클래스에서 부모 클래스의 메소드와 동일한 메소드를 만들어서 외부에 부모 클래스 메도스 대신 자식클래스 메소드를
		//노출하는 기술
		//-왜? 상속시 세대가 발전함에 따라 기능이 멈춰있지 않고, 상황에 맞게끔 변화 발생 > 변화에 의해 객체 사용법도 변화 발생 > 유저 사용자 경험 붕괴 발생 방지
		//>  본인의 경험(***) > toString
		
		Date d1 = new Date();
		System.out.println(d1); //Tue Oct 12 15:06:16 KST 2021
		System.out.println(d1.toString()); //Date.toString() -> override
		//부모인 Object가 물려준 toString()가 맘에 안들어서 자기가 똑같은 메소드를 직접 만들어서 사용
	
		
		Time t1 = new Time(2,30);

		//com.test.java.obj.inheritance.override.Time@7e0ea639
		//패키지.클래스@해시코드 > 쓸모 없는 문자열
		System.out.println(t1);
		System.out.println(t1.toString()); // Object.toString()
		
	}
}



class Time {
	private int hour;
	private int min;
	public Time(int hour, int min) {
		
		this.hour = hour;
		this.min = min;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		this.min = min;
	}

//	@Override
//	public String toString() {
//		return String.format("Time [hour=%s, min=%s]", hour, min);
//	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Time [hour=");
//		builder.append(hour);
//		builder.append(", min=");
//		builder.append(min);
//		builder.append("]");
//		return builder.toString();
//	}

	
	
	//메소드 오버라이드(재정의) > 덤프용  >항상 마지막에 쓰던 info() 같은 용
//	public String toString() {
//		return String.format("%d:%d", this.hour,this.min);
//	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	//Annotation 
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
	
	
}

class Parent{
	public void test() {
		
	}
}

class Child extends Parent{
	@Override //관리 차원의 주석
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	
}

