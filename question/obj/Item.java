package com.test.question.obj;

import java.util.Calendar;

public class Item {

	private String name;
	private Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		if(this.expiration != null) {
			int year = this.expiration.get(Calendar.YEAR);
			int month = this.expiration.get(Calendar.MONTH);
			int date = this.expiration.get(Calendar.DATE);
			
			return year + "-" + month + "-" + date;
		}
		else return "";
		
	}
	public void setExpiration(String expiration) {
		this.expiration = Calendar.getInstance();
		if(expiration != null) {
			int year = Integer.parseInt(expiration.substring(0,4));
			int month = Integer.parseInt(expiration.substring(5,7));
			int date = Integer.parseInt(expiration.substring(8));
			this.expiration.set(year, month, date);
		}
	}

	
}
