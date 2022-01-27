package com.test.question.datetime;

import java.util.Calendar;

/*김재형*/
public class Q01 {

	public static void main(String[] args) {
	
	nowTime();
	nowTime_AMPM();
	}//main

	private static void nowTime_AMPM() {
		
		Calendar nowTime_AMPM = Calendar.getInstance();
		
		System.out.printf("현재시간: %s %d시 %d분 %d초\n",nowTime_AMPM.get(Calendar.AM_PM)==0?"오전":"오후", nowTime_AMPM.get(Calendar.HOUR_OF_DAY),nowTime_AMPM.get(Calendar.MINUTE),nowTime_AMPM.get(Calendar.SECOND),nowTime_AMPM);
		
	}

	private static void nowTime() {
		
		Calendar nowTime = Calendar.getInstance();
		
		System.out.printf("현재시간: %d시 %d분 %d초\n", nowTime.get(Calendar.HOUR),nowTime.get(Calendar.MINUTE),nowTime.get(Calendar.SECOND));
		
	}
	
	
	
}
