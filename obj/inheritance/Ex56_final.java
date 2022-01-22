package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex56_final {

	public static void main(String[] args) {
		
		
		//final키워드
		//-지역변수, 멤버변수, 메소드, 클래스에게 사용한다.
		
		//1.변수에 사용했을 때
		//	-값을 수정할 수 없다.
		//2.메소드에 사용했을 때
		//	-상속할 때 사용
		//	-메소드 오버라이드 방지
		//3.클래스에 사용했을 때
		//	-상속할 때 사용
		//	-상속 방지
		
		//지역 변수
		int a =10;
		final int b = 20;
		
		//a는 수정가능 b는 불가능
		
		a=30;
		//b=40; <<불가능
		
		//상수(final 변수)
		//- 이름을 모두 대문자로 > 읽기 전용    > 소문자면 읽기,쓰기 가능
		
		final double PI = 3.14;
		
		User u1 = new User();
		System.out.println(u1.age);
		//u1.age =30; //The final field User.age cannot be assigned
		
		System.out.println(u1.GENDER);
		
		System.out.println(Calendar.YEAR);
		
		System.out.println(User.HOMETOWN);
	}
}



class User {
	final public int age =20;
	final public String GENDER = "Female";
	public static String school = "역삼중학고";
	
	final public static String HOMETOWN ="서울"; //final public static 순서 상관 없음
	
}

class FinalParent {
	
	//final 메소드
	//- 자식 클래스가 재정의 하지 못하도록
	//왜? 재정의 됐을 때의 일어난 여러가지 상황을 미리 예측해서 안정화를 못할거같아서
	final public void test() {
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent {
//	@Override
//	public void test() {
//		System.out.println("메소드 재정의");
//		
//	}
}

//상속 불가능해짐
final class FinalUser {
	
}

//class FinalAdministrator extends FinalUser{
//	
//}