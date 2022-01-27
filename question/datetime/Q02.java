package com.test.question.datetime;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
		
		birth();
	}

	private static void birth() {
		Calendar todaybirth = Calendar.getInstance();
		
		todaybirth.add(Calendar.DATE, 100);
		System.out.printf("백일 :%tF\n",todaybirth);
		
		todaybirth.add(Calendar.DATE, 265);
		System.out.printf("첫돌 :%tF\n",todaybirth);
	}
}
