package com.test.java.obj;

public class Ex34_Class {

	public static void main(String[] args) {
		
		//클래스의 멤버
		//1. 멤버 변수
		//2. 멤버 메소드
		
		//u1 이라는 사람이 하는 행동 info()와
		//u2 라는 사람이 하는 행동 info()가 구분이 되지 않는다.
		// -> 서로 다른 객체의 행동이 구분이 되지 않으면 u1과 u2라는 객체가
		//    동시에 존재할 필요성이 없어진다.
		
		User u1 = new User();
		u1.info(); //행동
		
		User u2 = new User();
		u2.info(); //행동 
		
		//public String name;
		
		//public void hello() {
		//	System.out.printf("안녕하세요. 저는 %s입니다.\n",name);
		//}
		
		u1.name = "홍길동";
		u1.hello();
		
		u2.name = "아무개";
		u2.hello();
		
		
	}//main
	
}//Ex34_Class
class User {
	
	//나쁜 메소드 -> 잘못 만든 메소드
	public void info() {
		System.out.println("유저입니다.");
	}
	//좋은 메소드 -> 객체가 자신만이 할 수 있는 일을 한다.
	// -> "자신이 가진 데이터를 활용해서 행동을한다.

	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\n",name);
	}
	
}



