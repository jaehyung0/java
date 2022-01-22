package com.test.java.obj.staticmember2;



public class Ex48_static {
	
	//프로그램 실행 순서
	//1.클래스 로딩(설계도를 확인하고 인식하는 과정)
	//2.1번 과정 중에 모든 static(변수,메소드)을 메모리에 할당
	//3.main() 시작
	//4.나머지코드
	//5.main() 종료
	
	public static void main(String[] args) {
		
		//객체 멤버 변수의 역할
		//-static 키워드가 없는 변수
		//-객체의 개인 데이터를 저장하는 변수
		//-남들과 다른 데이터를 가질 수 있는 역할 > 개인(객체)의 특성을 만들어 낸다.
		
		
		//static 멤버 변수의 역할
		//- static 키워드가 있는 변수
		//- 모든 객체가 공통으로 사용하는 데이터
		//- 공용 변수(역할), 정적 변수(물리)
		//- 사는 행성 > static(o)
		//- 사는 국적 > static(x)
		
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		Student.setSchool("역삼중학교");
		System.out.println(s1.info());
		
		Student s2 = new Student();
		s2.setName("하하하");
		s2.setAge(14);
		Student.setSchool("역삼중학교");
		System.out.println(s2.info());
		
		Student s3 = new Student();
		s3.setName("호호호");
		s3.setAge(16);
		Student.setSchool("역삼중학교");
		System.out.println(s3.info());
		
	}//main
	
}

class Student {
	
	//클래스 멤버 > 객체 멤버
	private String name;
	private int age;
	//클래스 멤버 > 정적 멤버
	private static String school; 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static String getSchool() {
		return school;
	}


	public static void setSchool(String school) {
		Student.school = school;
	}


	public String info() {
	
		return String.format("이름: %s, 나이: %s, 학교: %s",this.name,this.age,Student.school);
		
		
	}
	
}
