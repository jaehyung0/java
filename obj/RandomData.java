package com.test.java.obj;

public class RandomData {

	public static void main(String[] args) {
		
		//난수 만들기
		//1. 정수 난수
		for (int i=0;i<10;i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		String[] list = {"빨강", "파랑","노랑"};
		
		for(int i=0;i<10;i++) {
			System.out.println(list[(int)(Math.random()*list.length)]);
		}
		
	}
}
