package com.test.question.obj;

public class Student {

	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this("미정",0,0,0,0);
	}
	
	public Student(String name,int age,int grade,int classNumber,int number) {
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i); //0~length -1
			if(c<'가'||c>'힣') {
				System.out.println("아래 이름 한글로만 다시 입력");
				return;
			}else
				this.name=name;
		}
		
		this.age=age;
		this.grade=grade;
		this.classNumber=classNumber;
		this.number=number;
	}
	
	public Student(String name,int age) {
		this(name,age,0,0,0);

	}
	
	public Student(int grade,int classNumber,int number) {
		this("미정",0,grade,classNumber,number);

	}
	
	public String info() {
		String temp="";
		temp+=this.name;
		temp+="(나이"+":"+(this.age==0 ? "미정,":this.age+"세,");
		temp+="학년:"+(this.grade==0 ? "미정":this.grade)+",";
		temp+="반:"+(this.classNumber==0 ? "미정":this.classNumber)+",";
		temp+="번호:"+(this.number==0 ? "미정":this.number)+")";
		return temp;
	}
	
	
}
