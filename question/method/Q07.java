package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws IOException {
		
		
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int station,change;
		
		System.out.print("역의 개수:");
		String a = reader.readLine();
		station = Integer.parseInt(a);
		
		System.out.print("환승 횟수:");
		String b = reader.readLine();
		change = Integer.parseInt(b);
		
		int result;
		result = getTime(station,change);
		System.out.printf("총 소요시간은 %d분입니다.\n",result);
		
		result = getOfficeTime(station,change);
		System.out.printf("출근시간에 총 소요시간은 %d분입니다.\n",result);
		
		result = getHomeTime(station,change);
		System.out.printf("퇴근시간에 총 소요시간은 %d분입니다.",result);
				
	}//main
	public static int getTime(int s, int c) {
		return s*2+c*3;
	}//평상시
	
	public static int getOfficeTime(int s, int c) {
		return s*2+c*4;
	}//출근
	
	public static int getHomeTime(int s, int c) {
		return s*2+c*5;
	}//퇴근
	
}
