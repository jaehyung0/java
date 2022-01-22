package com.test.java.obj.inheritance;

import java.util.Random;

public class MyRandom {

	//2.
	public int nextTinyInt() {
		Random rnd = new Random();
		
		return rnd.nextInt(10)+1;
	}
	//3.
	public String nextColor() {
		Random rnd = new Random();
		String[] colors = {"red","yellow","blue","orange","green"};
		return colors[rnd.nextInt(colors.length)];
	
	}
	
	public int nextInt() {
		Random rnd = new Random();
		return rnd.nextInt();
	}
	//4. 추가 업무 > Random 객체는 기본으로 제공하는 업무인데 MyRandom으로 통합하기 위해 어쩔수 없이 똑같이 생긴 메소드를 추가로 하나 더만듬
	public boolean nextBoolean() {
		Random rnd = new Random();
		return rnd.nextBoolean();
	}
	
}
