package com.test.java;

import java.util.Calendar;

public class Ex27_for {
	
	public static void main(String[] args) {
		
		//Ex27_for.java
		
		//달력 만들기
		
		//Calendar now = Calendar.getInstance();
		
		//int year = now.get(Calendar.YEAR);
		//int month = now.get(Calendar.MONTH) + 1;
		
		//output(year, month); //달력 출력
		//output(2021, 10);
		
		//for (int i=1; i<=12; i++) {
		//	output(year, i);
		//}
		
		output(2021, 1);
		
	}

	private static void output(int year, int month) {
		
		int lastDay = 0; 		//해당월의 마지막 일
		int day_of_week = 0; 	//해당월 1일의 요일
		
		lastDay = getLastDay(year, month);
		day_of_week = getDayOfWeek(year, month);
		
		//달력 형식으로 출력하기
		System.out.println();
		System.out.println("====================================================");
		System.out.printf("                     %d년 %d월\n", year, month);
		System.out.println("====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		
		//1일이 무슨 요일 > 탭의 갯수
		for (int i=0; i<day_of_week; i++) {
			System.out.print("\t");
		}
		
		
		//날짜 출력
		for (int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			
			//토요일 > 개행
			//if (i % 7 == 4) {
			if ((i + day_of_week) % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
	}
	
	private static int getDayOfWeek(int year, int month) {
		
		int date = 1;
		
		int totalDays = 0;
		
		for (int i=1; i<year; i++) {
			if (isLeafYear(i)) {
				totalDays += 366;			
			} else {
				totalDays += 365;
			}
		}
		
		for (int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
		}
		
		totalDays += date; //totalDays++;
		
		return totalDays % 7;
	}

	private static int getLastDay(int year, int month) {
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31; //+break 포함
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
		}
		
		return 0;
	}
	
	
	private static boolean isLeafYear(int year) {
		
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		
	}

}




















