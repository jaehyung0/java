package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		parkingTime();
	}

	private static void parkingTime() throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[들어온 시간]");
		System.out.print("시:");
		int aHour = Integer.parseInt(reader.readLine());
		System.out.print("분:");
		int aMinute = Integer.parseInt(reader.readLine());
		int aAll = aHour*60+aMinute;
		
		
		System.out.println("[나간 시간]");
		System.out.print("시:");
		int dHour = Integer.parseInt(reader.readLine());
		System.out.print("분:");
		int dMinute = Integer.parseInt(reader.readLine());
		int dAll = dHour*60+dMinute;
		
		int time = dAll-aAll;
		
		if((time)<=30 && (time)>=0) {
			System.out.println("무료입니다.");
		}else if(time>30){
			System.out.printf("주차요금은 %d원입니다.",2000*((time-30)/10));
		}
		
			
}
}