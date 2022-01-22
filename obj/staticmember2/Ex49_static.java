package com.test.java.obj.staticmember2;

public class Ex49_static {

	public static void main(String[] args) {

//		Pen p1 = new Pen();
//		p1.setModel("153");
//		p1.setColor("검정");
//		
//		Pen p2 = new Pen("젤리펜","빨강");

		// 목적) 펜을 몇 개 만들었는지 개수 세기
		// case1.
		// -쉽게 구현가능
		// -많이 사용
		// -count++ 누락하면 발견하기 힘들다
		// -count가 Pen의 생성개수라는 사실을 증명하기 힘들다
//		int count=0;
//		
//		Pen p1 = new Pen("153","검정");
//		count++;
//		
//		Pen p2 = new Pen("153","검정");
//		count++;
//		
//		Pen p3 = new Pen("153","검정");
//		count++;
//		
//		System.out.println("펜의 개수:"+count);

		// case2.
		// -count 변수를 객체 변수로 생성한다. > 큰 문제점
		// -객체 변수는 개인(개별) 데이터를 의미한다.

		/*
		 * Pen p1 = new Pen("153","검정"); p1.count++;
		 * p1.count++; 개인 카운트
		 * 
		 * Pen p2 = new Pen("153","검정"); 
		 * p2.count++; 
		 * p1.count++; 
		 * 
		 * Pen p3 = new Pen("153","검정"); 
		 * 
		 * p3.count++; 
		 * p1.count++;
		 * System.out.println("펜의 개수:"+p1.count);
		 */

		// case3.
/*
		Pen p1 = new Pen("153", "검정");
		Pen.count++;// 공용카운트

		Pen p2 = new Pen("153", "검정");
		Pen.count++;

		Pen p3 = new Pen("153", "검정");
		Pen.count++;

		System.out.println("펜의 개수:" + Pen.count);
*/
		
		//case4.
		//가장 이상적 형태
		Pen p1 = new Pen("153", "검정");
		Pen p2 = new Pen("153", "검정");
		Pen p3 = new Pen("153", "검정");
		System.out.println("펜의 개수:" + Pen.count);
		
	}
}

class Pen {

	// 보편적인 선언순서(의식의 흐름)
	// 1.멤범변수
	// 2.생성자
	// 3.메소드

	private String model;
	private String color;

	// public int count; //객체변수(개인)
	public static int count;//정적변수(공용)
	
	//생성자
	//1. 객제 생성자
	//- static이 없는 변수만 초기화 역할
	
	//2. 정적 생성자
	//- static이 있는 변수만 초기화 역할
	
	//정적 생성자
	//-이름 x
	//-접근지정자 x
	//-오버로딩x
	//-개발자가 명시적으로 호출할 수 없다.
	//-정적 멤버가 생성된 직후에 자동으로 호출된다.
	//-프로그램을 통틀어 딱 1번만 실행된다. (main메소드 호출 직전)
	
	static {
		Pen.count=0;           // 기본적으로 0으로 초기화 되어있고 굳이 안 만들어도 된다.
	}
	
	
	//객체 생성자
	public Pen() {
		//this.color = "";
		//this.model = "";
		this("","");
	}
	
	//객체 생성자
	public Pen(String model, String color) {
		// super(); 지금 당장 설명 불가
		this.model = model;
		this.color = color;
		Pen.count++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String info() {
		return String.format("(%s,%s)", this.model, this.color);
	}

}
