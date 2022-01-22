package com.test.java.obj.inheritance;

public class Ex51_Inheritance {

	public static void main(String[] args) {
		
		/*
		 * 상속, Inheritance
		 * -부모가 가지는 재산을 자식에게 물려주는 행동
		 * -부모 클래스가 가지는 멤버를(변수,메소드) 자식 클래스에게 물려주는 행동
		 * 
		 * 상속을 왜하는지?
		 * -자식 클래스가 직접 구현해야 할 멤버(별수,메소드)들을 직접 구현하지 않고 부모 클래스로부터 물려받아서
		 * 	자기가 직접 구현한것처럼 사용하기 위해서
		 * -비용 절감, 코드 재사용
		 * 
		 * 상속 관계에 있는 클래스 호칭
		 * - 부모 클래스 <- 자식 클래스
		 * - 슈퍼 클래스 <- 서브 클래스
		 * - 기본 클래스 <- 확장(파생) 클래스
		 * 
		 * 
		 * 이클립스 플러그인 설치 방법
		 * 1. 설치 URL > 직접설치
		 * 2. 마켓 설치
		 * 
		 */
		
		Child c = new Child();
		c.a = 10;
		c.b = 20;
		c.ccc();
		
		Son son = new Son();
		
		son.d=10;
		son.e=20;
		son.fff();
		
		son.a=30;
		son.b=40;
		son.ccc();
		
		Daughter daugher = new Daughter();
		//상속
		daugher.a=10;
		daugher.b=10;
		daugher.ccc();
		
		//직접
		daugher.g=30;
		daugher.h=40;
		daugher.iii();

		//DDD
		DDD d = new DDD();
		System.out.println(d.a); //AAA(증조할아버지)
		System.out.println(d.b); //BBB(할아버지)
		System.out.println(d.c); //CCC(아버지)
		System.out.println(d.d); //DDD(자신)
		
		
	}
}



//부모 클래스와 자식 클래스를 서로 연결해 주는 순간(extends) 상속이 바로 발생한다.

class Parent {
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}


class Child extends Parent {
	//자신의 멤버를 하나도 구현하지 않는 자식 클래스는 구현할 필요가 없다.
	// > 존재 이유 0 > Parent 클래스를 직접 사용하면 되기 때문에
			
}

//어떤 하나의 클래스를 기본으로 유지하면서 거기에 추가로 기능을 확장하는 결과 발생
class Son extends Parent {
	//Son클래스 자신의 멤버 변수와 메소드
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}

}

class Daughter extends Parent {
	public int g;
	public int h;
	public void iii() {
		System.out.println("iii");
	}
}

class AAA {
	public int a=10;
}

class BBB extends AAA{
	//int a
	public int b=20;
}

class CCC extends BBB{
	//int a, int b
	public int c=30;
}

class DDD extends CCC{
	//int a,int b,int c
	public int d =40;
}









