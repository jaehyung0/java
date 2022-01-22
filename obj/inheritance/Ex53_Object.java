package com.test.java.obj.inheritance;

public class Ex53_Object {

	public static void main(String[] args) {
		
		//Object 클래스
		//-java.lang 패키기에 소속
		//-모든 자바 클래스를 통틀어 가장 중요한 클래스
		//-모든 클래스의 근원
		
		//-C;ass Object is the root of the class hierarchy
		//-Every class has Obhect as a superclass.
		//-All objects, including arrays, implement the methods of this class.
		
		TestCCC c = new TestCCC();
		c.a=10;
		c.b=20;
		c.c=30;
	
		
		TestBBB b = new TestBBB();
		b.a=10;
		b.b=20;
		
		
		TestAAA a = new TestAAA();
		a.a=10;
			
		MyRandom rnd = new MyRandom();
		//Object 객체는 만들어서 사용할 일이없다.
	
	
	}
}
//Object 클래스는 상속을 명시하지 않은 모든 클래스의 부모 클래스가 된다.
//class TestAAA extends Object
class TestAAA{
	public int a;
}

class TestBBB extends TestAAA{
	public int b;
}

class TestCCC extends TestBBB{
	public int c;
}


