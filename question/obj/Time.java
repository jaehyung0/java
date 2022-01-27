package com.test.question.obj;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int hour,int minute,int second) {
		if(hour<0||minute<0||second<0) {
			System.out.println("양의정수를 입력하세요.");
			return;
		}
		if(second>=60) {
			minute=minute+second/60;
			second=second%60;
		}
		if(minute>=60) {
			hour=hour+minute/60;
			minute=minute%60;
		}
				
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
	}
	
	public Time(int minute,int second) {

		this(0,minute,second);

	}
	
	public Time(int second) {

		this(0,0,second);

	}
	
	public String info() {
		String temp="";
		temp+=this.hour+":";
		temp+=this.minute+":";
		temp+=this.second;
		return temp;
	}
}
