package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10_Friday {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		moveDay(); //금요일에만 쓸 수 있음
	}//main

	private static void moveDay() throws NumberFormatException, IOException{
		
		Calendar c1 = Calendar.getInstance();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년:");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월:");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일:");
		int date = Integer.parseInt(reader.readLine());
		
		c1.set(year, month-1, date);
		long selTime = c1.getTimeInMillis();
		long nowTime = System.currentTimeMillis();
		long subTime = (nowTime-selTime)/1000/3600/24;
		
		if(subTime%7==5 || subTime%7==6) {               //오늘이 금요일이라서 나머지 기준이 이렇게 날짜가 바뀐날에 쓰려면 나머지값 다 바꿔줘야됨
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다."); //토요일,일요일
		}else if(subTime%7==0) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			c1.add(Calendar.DATE, 1);//금요일						//더하는값도 다 바꿔줘야됨
			System.out.printf("이동한 날짜는 '%tF입니다.",c1);
		}else if(subTime%7==1) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			c1.add(Calendar.DATE, 2);//목요일
			System.out.printf("이동한 날짜는 '%tF입니다.",c1);
		}else if(subTime%7==2) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			c1.add(Calendar.DATE, 3);//수요일
			System.out.printf("이동한 날짜는 '%tF입니다.",c1);
		}else if(subTime%7==3) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			c1.add(Calendar.DATE, 4);//화요일
			System.out.printf("이동한 날짜는 '%tF입니다.",c1);
		}else if(subTime%7==4) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			c1.add(Calendar.DATE, 5); //월
			System.out.printf("이동한 날짜는 '%tF입니다.",c1);
		}
		
		
	}
}
