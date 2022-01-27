package com.test.question.obj;

public class Americano {

	private int bean;
	private int water;
	private int ice;
	
	public Americano(int bean, int water, int ice) {
		super();
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg,물 %dml, 얼음 %d개로 만들어진 에스프레소를 마십니다.\n",this.bean,this.water,this.ice);
	}
}
