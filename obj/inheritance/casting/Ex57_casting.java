package com.test.java.obj.inheritance.casting;

public class Ex57_casting {

	public static void main(String[] args) {
		
		/*
		 * 형변환, Type Cast
		 * 
		 * 1.값형 형변환
		 * 	- 값형끼리만 가능(boolean 제외)
		 * 
		 * 2.참조형 형변환
		 * 	- 참조형끼리만 가능
		 * 	- 상속관계의 클래스끼리만 가능
		 * 	- 직계끼리만 가능
		 * 
		 * 참조형 형변환, Reference Type Cast
		 * -자식 클래스 -> (형변환) -> 부모클래스
		 * 		-업캐스팅(up casting)
		 * 		-암시적인 형변환
		 * -부모 클래스 -> (형변환) -> 자식 클래스
		 * 		-다운캐스팅(down casting)
		 * -손자 클래스 -> (형변환) -> 할아버지 클래스 : 세대수 무관
		 * 		-업캐스팅
		 * 
		 * 
		 */
		
		Parent p1 = new Parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		Parent p2;
		Child c2 = new Child();
		//형변환 발생
		//Parent = Child
		//암시적인 형변환
		//부모=자식
		//업캐스팅
		//100% 안전하다.
		//p2=(Parent)c2; //원래모습
		p2=c2;		     //생략가능
		
		//형변환이 올바르게 수행되었는지 확인? > 검증 방식이 다르다 > 복사된 객체를 올바르게 사용이 가능한지를 확인
		System.out.println(p2.a);
		System.out.println(p2.b);
		
		Parent p3 = new Parent();
		Child c3;
		
		//형변환 발생
		//자식=부모
		//다운캐스팅
		//명시적인 형변환 > 위험할 수도 있다.
		//100% 불가능
		
		//c3=(Child)p3; //런타임 오류 : ClassCastException
		//검증
		//System.out.println(c3.a);
		//System.out.println(c3.b);
		//System.out.println(c3.c);
		//System.out.println(c3.d);
		
		Parent p4;
		Child c4 = new Child();
		//업캐스팅
		p4=c4;
		
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		
		//위에게 안보일 때까지 다른거 실행
		
		Child c5;
		//다운캐스팅
		//-업캐스팅을 한걸 다운캐스팅 해서
		//-
		c5=(Child)p4;
		
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		
	}
}

class Parent {
	public int a =10;
	public int b =10;
	
}

class Child extends Parent {
	public int c=30;
	public int d=30;
}

class Son extends Parent {
	public int e=50;
}

class Daughter extends Parent{
	public int f=60;
}
