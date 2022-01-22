package com.test.java.obj.inheritance.override;

import java.util.Random;

public class Ex54_Override {

	public static void main(String[] args) {
		
		//메소드 오버라이드, Method override
		//-메소드 재정의(수정) > 메소드 교체
		//-상속 시 발생
		//-왜? 상속하는 이유 > 세대가 교체 될수록 클래스 기능 발전 or 상황에 맞게 변화
		//-개발자 편의성
		//-사용법(메소드 시그너처)는 그대로 유지하면서, 내용만 새로운 메소드로 교체
		
		//면접 질문 > 대본
		//-오버라이드에 대해 설명하시오
		//-메소드 오버로딩과 메소드 오버라이드에 대해 설명하시오.
		
		Hong hong = new Hong();
		hong.name ="홍길동";
		
		Son son = new Son();
		son.name="홍재석";
		
		Daughter daughter = new Daughter();
		daughter.name="홍나래";
		
		//마을사람을 만났을 때 인사
		//객체가 달라도 한 집안의 객체면 행동이 동일하다.
//		hong.hello();
//		son.hello();
//		daughter.hello();
		
		//hello()방식이 싫어요
		//solution 1.
		//-문제점
		hong.hello();
		son.hi();
		daughter.hello();
		
		
		
		
	}
}
//다중 상속
//-하나의 클래스가 2개 이상의 클래스로부터 상속받는것
//-자바는 다중 상속을 지원하지 않는다. 불가능
//-자바는 부모 클래스를 딱 1개만 가질 수 있다. > 단일 상속만 가능

class Hong {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\n",this.name);
	}
}

class Son extends Hong {
	//부모가 물려주는 멤버 중 일부를 상속 거부할 수 없다.
	
	//solution 1.
	//-부모 메소드는 내버려두고 자신만의 메소드를 만들었다.
	public void hi() {
		System.out.printf("하이~ 난 %s야\n",this.name);
	}
}

class Daughter extends Hong {
	
	//solution 2.
	//메소드 오버라이드
	//-부모로부터 상속받은 메소드를 감추고 자신이 선언한 메소드를 노출시키는 기술
	
	public void hello() {
		System.out.printf("방가~ 난 %s\n",this.name);
	}
	
}

//nextInt() -> -21억~21억
class MyRandom extends Random {
	
	//부모 클래스의 메소드와 자식 클래스 메소드가 충돌 발생 > 무조건 자식이 이긴다.
	
	//1~10사이 난수
	public int nextInt() {
		return (int)this.nextInt(10)+1;
	}
}


