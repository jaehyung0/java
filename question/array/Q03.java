package com.test.question.array;

public class Q03 {

	public static void main(String[] args) {
		int[] list = new int[4];
		
		list[0]=10;
		list[1]=20;
		list[2]=30;
		list[3]=40;
		
		
		String result = dump(list);
		System.out.printf("nums=%s\n",result);
	}//main

	private static String dump(int[] list) {
		
		String str = "[10,20,30,40]";
		str += list[0] +list[1] +list[2] +list[3];
		
		return str;
	}

	
		
	
}
