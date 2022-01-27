package com.test.question.obj;

public class Latte {

	private int bean;
	private int milk;
	
	public Latte(int bean, int milk) {
		
		this.bean = bean;
		this.milk = milk;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유%dml로 만들어진 에스프레소를 마십니다.\n",this.bean,this.milk);
	}
	
}
