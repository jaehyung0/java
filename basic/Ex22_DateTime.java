package com.test.java;

import java.util.Calendar;
import java.util.Date;



public class Ex22_DateTime {

	public static void main(String[] args) {
		
		/*
		 * 자바 자료형
		 * - 숫자형, 논리형, 문자형
		 * - 문자열, 날짜시간
		 * 
		 * DateTime, 날짜시간 자료형
		 * 1. Date 클래스(legacy)
		 * 2. Calendar 클래스(현역)
		 * 3. 추가 클래스(현역.. 호불호)
		 * 
		 * 1. 시간
		 * 2. 시각
		 * 시각+시각=x )
		 * 시각-시각=시간o tick -tick 2022년5월3일 - 2021년 9월 16일 = 며칠 나오나
		 * 시간+시간=시간o 산술연산 8시간 + 2시간
		 * 시간-시간=시간o 산술연산
		 * 시각+시간=시각o add 2021년 9월 16일+100일= 100일후 날짜
		 * 시각-시간=시각o add 2021년 9월 16일-100일= 100일전 날짜
		 */
		
		//m1(); //1번예제
		//m2(); //2번예제
		m3(); //3번예제
		//m4();
		//m5();
		//m6();
		//m7();
		
		
	}//main

	private static void m7() {
		
		//현재시간의 tick??
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//현재 시각의 tick값을 반환하는 전용 메소드 -> 위에거 실행하고 아래거 실행하기 때문에 약간의 실행차가 생긴다
		System.out.println(System.currentTimeMillis());
		
	}

	private static void m6() {
		//2시간30분 +10분 = 2시간 40분
		int hour =2;
		int min =30;
		min+=10;
		System.out.printf("%d시간 %d분\n",hour,min);
		
		//2시간 30분 + 40분 =3시간 10분
		hour =2;
		min=30;
		min =min +40; //2시간 70분
		hour = hour + min/60; //3시간
		min = min %60; //10분
		System.out.printf("%d시간 %d분\n",hour,min);
		
		
	}

	private static void m5() {
		//연산
		//시각-시각=시간
		
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1994,7, 17,12,12,12);
		
		//now - birthday = 내가 살아온 시간
		//tick 값
		birthday.getTimeInMillis();
		System.out.println(birthday.getTimeInMillis()); //777093132084
		System.out.println(now.getTimeInMillis()); //1631763002431
		
		long birthdayTick =birthday.getTimeInMillis();
		long nowTick = now.getTimeInMillis();
		System.out.println(nowTick-birthdayTick);
		
		//올홰 크리스마스가 며칠 남았는지?
		//크리스마스-현재
		Calendar christmas = Calendar.getInstance();
		christmas.set(2021, 11, 25);
		long christmasTick = christmas.getTimeInMillis();
		System.out.println((christmasTick-nowTick)/1000/60/60/24);
		
		Calendar endDate = Calendar.getInstance();
		endDate.set(2022, 1, 24);
		long endDateTick = endDate.getTimeInMillis();
		System.out.println((endDateTick - nowTick)/1000/60/60/24);
		
	}

	private static void m4() {
		
		//연산
		//시각+시간
		//시각-시간
		//void add(int,int)
		
		//오늘 만난 커플 > 100일
		Calendar now = Calendar.getInstance();
		
		System.out.printf("%tF\n",now);
		
		now.add(Calendar.DATE,100); //now에다가 날짜 100을 더해라
		
		System.out.printf("%tF\n",now);//이제 now가 12월25일로 바뀜
		
		//다시 오늘로 초기화
		now.set(2021,8,16);
		System.out.printf("오늘: %tF\n",now);
		
		//오늘 태어난 아기 -> 첫돌
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n",now);
		
		//다시 오늘로 초기화
		now.set(2021,8,16);
		System.out.printf("오늘: %tF\n",now);
		
		//5시간 25분뒤 비타민 복용
		now.add(Calendar.HOUR,5);
		now.add(Calendar.MINUTE, 55);
		System.out.printf("비타민 먹을시간 : %tT\n",now);
		
		//다시 오늘로 초기화
		now.set(2021,8,16);
		
		//100개월전
		now.add(Calendar.MONTH, -100);
		System.out.printf("백달전 : %tF\n",now);
		
		//개강일로 초기화
		now.set(2021,8,8);
		now.add(Calendar.DATE, 166);
		System.out.printf("%tF\n",now);
	
		
		
		
		
		
	}

	private static void m3() {
		
		//특정 시각 얻어오기 ex) 생일
		//1. 현재 시각 만들기 -> 2, 그 시각을 원하는 시각으로 수정하기
		Calendar birthday = Calendar.getInstance();
		
		//000.get() : 얻어오기, 읽기 > 메소드
		//000.set() : 집어넣기, 쓰기 > 메소드
		//수정하기
		//- void set(int 상수,int 값);
		//- void set(int,int,int)
		//- void set(int,int,int,int,int,int)
		
		birthday.set(1994, 8, 17, 12, 17, 17);
		
		//birthday.set(1994, 8, 17);
		System.out.println(birthday);
		//birthday.set(Calendar.YEAR,1994);
		//birthday.set(Calendar.MONTH,8);
		//birthday.set(Calendar.DATE,17);
		//birthday.set(Calendar.HOUR,12);
		//birthday.set(Calendar.MINUTE,17);
		//birthday.set(Calendar.SECOND,17);
		System.out.printf("%tF %tT\n",birthday,birthday);
		
		
		
		
		
	}

	private static void m2() {
		//Calendar 클래스
		//현재시각 얻어오기
		Calendar c1 = Calendar.getInstance();
		//System.out.println(c1);
		
		//Calendar 안에 들어있는 여러 데이터 중 원하는 항목만 가져오기
		//- int get(int)
		int year = 1;
		System.out.println(c1.get(year)+"."); //년도, 가독성 좋음
		System.out.print(c1.get(1)+"."); //년도 , 가독성 낮음
		System.out.print(c1.get(2)+1+"."); //년도
		System.out.println(c1.get(5)); //일
		//자바가 제공하는 Calendar 상수
		System.out.println(Calendar.YEAR);  //1
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println("=======================");
		//c1
		System.out.println(c1.get(Calendar.YEAR)); 
		System.out.println(c1.get(Calendar.MONTH));
		
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.HOUR));
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.SECOND));
		System.out.println(c1.get(Calendar.MILLISECOND)); //밀리초 1/1000
		System.out.println(c1.get(Calendar.AM_PM)); //오전0 , 오후1
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println("========================");
		
		//)요구사항) 오늘은 '2021년 9월 16일 오전 11시 18분 30초' 입니다
		System.out.printf("오늘은 '%d년 %d월 %d일 %s %d시 %d분 %d초' 입니다.\n",c1.get(Calendar.YEAR),c1.get(Calendar.MONTH)+1,c1.get(Calendar.DATE),c1.get(Calendar.AM_PM)==0?"오전":"오후",c1.get(Calendar.HOUR),c1.get(Calendar.MINUTE),c1.get(Calendar.SECOND));
		
		//printf() - 형식문자 > 날짜 시간용
		System.out.println();
		System.out.printf("%tF\n",c1); //년-월-일
		System.out.printf("%tT\n",c1); //시:분:초
		System.out.printf("%tA\n",c1); //()요일
		
		//현재시각 얻어오기 + 원하는 항목 추출하기 + 형식문자(%tF, %tT, %tA)
		
	}

	private static void m1() {
		 //Date 클래스 맛보기
	 	 //java.util
		Date date = new Date();
		System.out.println(date); //Thu Sep 16 10:36:14 KST 2021
		
	}
}
