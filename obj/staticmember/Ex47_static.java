//package com.test.java.obj.staticmember;
//
//public class Ex47_static {
//
//	public static void main(String[] args) {
//		
//		//static 키워드
//		//-클래스 멤버에 붙이는 키워드
//		//1. 멤버 변수
//		//2. 멤버 메소드
//		
//		//현재 방식의 문제점
//		//- 조건: Student의 모든 객체는 "역삼중학교"이다.
//		
//		Student s1 = new Student();
//		s1.setName("홍길동");
//		s1.setAge(15);
//		s1.setSchool("역삼중학교");
//		System.out.println(s1.info());
//		
//		Student s2 = new Student();
//		s2.setName("하하하");
//		s2.setAge(14);
//		s2.setSchool("역삼중학교");
//		System.out.println(s2.info());
//		
//		Student s3 = new Student();
//		s3.setName("호호호");
//		s3.setAge(16);
//		s3.setSchool("역삼중학교");
//		System.out.println(s3.info());
//		
//	}//main
//}
//
////학생 클래스
////-"역삼 중학교" : 전원
//
//
//public class Student {
//	
//	private int a;
//	private int b;
//	public void c() {}
//	public void d() {}
//	
//	private String name;
//	private int age;
//	private String school; 
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getSchool() {
//		return school;
//	}
//
//	public void setSchool(String school) {
//		this.school = school;
//	}
//
//	public String info() {
//		
////		String temp ="";
////		temp+="이름";
////		return temp;
////		
////		printf("%s~~");
////		String.format()
//		
//		//printf() = String.format()
////		String.format(name.null);
////		
////		String result = String.format("%s님",this.name);
////		return result;
//		
//		return String.format("이름: %s, 나이: %s, 학교: %s",this.name,this.age,this.school);
//		
//		
//	}
//	
//}
