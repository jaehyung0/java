package com.test.question.obj;

import java.util.Calendar;

public class Bugles {

	private int price;//과자 가격
    private int size;//과자 용량
    private Calendar creationTime; //제조일자
    private int expiration;//유효기간
    
    
   // public String time;
    
    //getter, setter 구현

    public int getPrice() {
		if(size==300) {
			this.price+=850;
		}else if(size==500) {
			this.price+=1200;
		}else if(size==850) {
			this.price+=1950;
		}
    	
    	
    	return this.price;
	}

	public void setCreationTime(String time) {
		
		
		
		int year = Integer.parseInt(time.substring(0,4));
		//System.out.println(time.substring(0,4));
		int month = Integer.parseInt(time.substring(5,7));
		//System.out.println(time.substring(6,7));
		int date = Integer.parseInt(time.substring(8,10));
		//System.out.println(time.substring(8));
		
		creationTime = Calendar.getInstance();
		creationTime.set(year,month-1,date);		
		//System.out.printf("%tF",creationTime);
		
		this.creationTime = creationTime;
		
		
	}

	public void setSize(int size) {
		if(size==300||size==500||size==850)
			this.size = size;
	}

	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		int nowDay = now.get(Calendar.DAY_OF_YEAR);
		//creationTime = Calendar.getInstance();
		//creationTime.set(year, month-1, date);
		int creationTimeDay = this.creationTime.get(Calendar.DAY_OF_YEAR); 
		if(size==300) {
			this.expiration = 7-(nowDay-creationTimeDay);
			
		}else if(size==500) {
			this.expiration = 10-(nowDay-creationTimeDay);
		}else if(size==850) {
			expiration = 15-(nowDay-creationTimeDay);
		}
			
		//this.expiration = expiration;
		
		return this.expiration;
	}

	

	

	public void eat() {
		if(this.expiration<0) {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}else {
			System.out.println("과자를 맛있게 먹습니다.");
		}
		
    }

	
	
}
