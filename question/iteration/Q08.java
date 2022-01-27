package com.test.question.iteration;

public class Q08 {

	public static void main(String[] args) {
		
		int allYear=0;
		for(int year=1;year<=2020;year++) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				allYear+=366;
			}else {
				allYear+=365;
			}
			
		}
		
				
		int all31Month=0;
		for(int month31=1;month31<=5;month31++) { //1,3,5,7,8월
			all31Month+=31;
		}
		
		int all30Month=0;
		for(int month30=1;month30<=2;month30++) { //4,6월
			all30Month+=30;
		}
		System.out.printf("2021년 9월24일은 %,d일째 되는 날입니다.",allYear+all31Month+all30Month+24+28); //24는 오늘 28은 2월
	
	
	}
		
		
}
