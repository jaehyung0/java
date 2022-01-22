package com.test.java.obj.inheritance.interface2;

public class Ex58_interface {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스
		 * -클래스의 일종(=자료형)
		 * -추상 메소드를 가진다.
		 * -구현 멤버는 가질 수 없다.
		 * 
		 * 
		 * 클래스
		 * 1. 객체를 생성한다.
		 * 2. 참조변수를 생성한다.
		 * 
		 * 인터페이스
		 * 1. 객체를 생성한다. X
		 * 2. 참조변수 생성 가능
		 * public만 가능
		 * 
		 */
		
		int a;
		Member m;
		
		
		
	}
}


interface Member{
	
	//멤버선언
	//***인터페이스는 구현된 멤버를 가질 수 없다.
	//-변수
	//-할일을 선언한 메소드 > 구현부를 가진 메소드 x
//	public int a;
//	public int b;
//	
//	public void test() {
//		//구현부
//	}
	
	//추상 메소드
	//-구현부가 없는 메소드
	public abstract void test();
	public abstract void aaa();
	void bbb();
	int ccc();
	int dd(String str);
	
}

//인터페이스를 상속받는 클래스에서는 반드시 인터페이스의 추상 메소드를 구현해야한다.
// -> test() 메소드의 구현부(몸통)을 만들어줘야한다.

class Hong implements Member{
	
	
	
	//약속!!>완성
	//약속의 범위
	//- 메소드의 구현부를 선언하는까지만..
	//- 메소드 구현부의 내용까지는 강요 불가능! > 클래스가 맘대로 구현한다.
	
	
	@Override
	public void test() {
		System.out.println("ggg");
		
	}
	
	@Override
	public void aaa() {
		int n = 1+1;
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ccc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dd(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

