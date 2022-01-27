package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q06 {

	public static void main(String[] args) throws IOException {
		
		deliveryTime();
	}

	private static void deliveryTime() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시:");
		String s1 = reader.readLine();
		int time = Integer.parseInt(s1);
		
		System.out.print("분:");
		String s2 = reader.readLine();
		int minute = Integer.parseInt(s2);
		
		Calendar arrival = Calendar.getInstance();
		
		
		arrival.set(Calendar.HOUR_OF_DAY,time);
		arrival.set(Calendar.MINUTE, minute);
		
		arrival.add(Calendar.MINUTE,-10);
		System.out.printf("짜장면: %d시 %d분\n",arrival.get(Calendar.HOUR_OF_DAY),arrival.get(Calendar.MINUTE));
		
		arrival.add(Calendar.MINUTE, -8);
		System.out.printf("치킨: %d시 %d분\n",arrival.get(Calendar.HOUR_OF_DAY),arrival.get(Calendar.MINUTE));
		
		arrival.add(Calendar.MINUTE, -7);
		System.out.printf("피자: %d시 %d분\n",arrival.get(Calendar.HOUR_OF_DAY),arrival.get(Calendar.MINUTE));
		
		
		
		
	}
}
