package com.test.java.obj.inheritance.interface2;

public class Ex60_interface {

	public static void main(String[] args) {
		
		//자식->부모
		//클래스 -> 클래스			:o
		//클래스 -> 인터페이스		:o
		//인터페이스 -> 클래스		:x
		//인터페이스 -> 인터페이스	:o
		
		
		//다중 상속
		// - 자바는 (클래스) 다중상속을 지원하지 않는다.
		// - 자바는 (인터페이스) 다중 상속을 지원한다.  > 자주 사용
	}
}

interface 직원 {
	void 출근한다();
	void 퇴근한다();
}

interface 간부 extends 직원 {
	void 결재한다();
}

interface 사원 extends 직원 {
	void 보고서작성한다();
}

interface 아빠{
	void 일한다();
}

interface 엄마{
	void 살림한다();
}

//집안 가장
class 아무개 implements 아빠,사원 {
	@Override
	public void 일한다() {
		
	}

	@Override
	public void 출근한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 보고서작성한다() {
		// TODO Auto-generated method stub
		
	}
	
	
}




class AAA {
	
}


class BBB extends AAA {
	
}

interface CCC {
	
}

class DDD implements CCC {
	
}

class EEE {
	
}

//interface FFF extends EEE {
//	
//}

interface GGG {
	void aaa();
}

interface HHH extends GGG {
	void bbb();
}

class III implements GGG {
	//일반 클래스는 추상 멤버를 가질 수 없다. > 그래서 구현을 해서 온전한 메소드를 만들었다.
	//void aaa();
	
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
}

interface 사람 {
	void 숨쉬다();
}

interface 어른 extends 사람{
	//void 숨쉬다();
	void 걷는다();
}

interface 아기 extends 사람{
	void 기어다닌다();
	//void 숨쉬다();
}












