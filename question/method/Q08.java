package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은날 :");
		String s = reader.readLine();
		
		System.out.print("흐린날 :");
		String r = reader.readLine();
		
		int sunnyday = Integer.parseInt(s);
		int rainyday = Integer.parseInt(r);
		
		int apple = getApple(sunnyday,rainyday);
		System.out.printf("사과가 총 %d개 열렸습니다.",(apple-100)/10);
	}//main
	
	public static int getApple(int sunny, int rainy) {
		return sunny*5+rainy*2;
	}
	
	
	
}
