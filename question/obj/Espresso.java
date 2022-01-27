package com.test.question.obj;

public class Espresso {

	private int bean;
		
	public Espresso(int bean) {
		
		this.bean = bean;
	}

	public void drink() {
		System.out.printf("원두 %dg로 만들어진 에스프레소를 마십니다.\n",this.bean);
		
	}
	
	
	
	
}
