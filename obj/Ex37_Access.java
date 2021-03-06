package com.test.java.obj;

import java.util.Calendar;

public class Ex37_Access {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		//name: 읽기,쓰기 가능
		m1.setName("김재형");
		System.out.println(m1.getName());
		
		//age: 쓰기 > 쓰기 전용 멤버
		m1.setAge("20");
		
		//address: 읽기 > 읽기 전용 멤버
		System.out.println(m1.getAddress());
		
		
		System.out.println(m1.getBirthyear());
	}
	
}

class Member {
	
	private String name;
	private String age;
	private String address="서울시";
	
	//쓰기
	public void setName(String name) {
		this.name=name;
	}
	//읽기
	public String getName() {
		return this.name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	//getAge() -> 만들지 않음
	
	//setAddress 안만듦
	
	public String getAddress() {
		return this.address;
	}
	
	//계산된 속성, Computed Property(Attribute)
	public int getBirthyear() {
		Calendar now = Calendar.getInstance();
		int age = Integer.parseInt(this.age);
		
		return now.get(Calendar.YEAR)-age;
	}
	
//	public String info() {
//		return "이름: " + this.name
//	}
	
}







