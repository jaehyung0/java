package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10_1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		selTime();
	}

	private static void selTime() throws NumberFormatException, IOException {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년:");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월:");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일:");
		int date = Integer.parseInt(reader.readLine());
		
		c1.set(year, month-1, date);
		
		int day = c1.get(Calendar.DAY_OF_WEEK);
		
		//일~~~토 : 1~7
		
		if (day==1 ) {
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
			}else {
				System.out.println("입력하신 날짜는 '평일'입니다.");
				System.out.println("해당 주의 토요일로 이동합니다.");
				c1.add(Calendar.DATE, 7-day);
				System.out.printf("이동한 날짜는 '%tF'입니다.",c1);
				
			}
		
		
		
		
		
		
	}
}	
