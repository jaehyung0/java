package com.test.java.obj;

import java.util.Calendar;

//import com.test.java.obj.staticmember.Student;

public class Ex35_Class {

	public static void main(String[] args) {
		
		//(되도록) 자바에선 물리적인 파일 1개에 클래스 1개를 선언한다.
		//이유: 관리차원에서
		//파일의 이름은 반드시 클래스의 이름과 동일해야 한다. > 안지키면 컴파일 오류나옴
		//파일 2개 이상의 클래스를 선언한다면 반드시 딱 1개의 클래스에만 public 키워드를 붙인다.
		//> 대표클래스 된다. > 대표 클래스의 이름이 파일명이 된다.
		
		//질문? Size 클래스 잘못됐다 > 찾아서 수정
		//질문? Ex33_Class 클래스 잘못됐다 > 찾아서 수정
		//-> 한파일 안에 2개 이상의 클래스를 선언 > 대표 클래스 외에는 외부에 노출이 안되서 찾기가 힘들다.
		
		//수업 때는 속도 때문에 여러개 만듦
		
		//Student(s1)의 역할: 학생 1명의 정보를 담는 컨테이너
//		Student s1 = new Student();
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 90;
//		s1.math = 80;
//		
//		s1.tel = new String[] {"010-9280-5059","010-9280-5053","010-9280-5052"};
//		s1.birthday = Calendar.getInstance();
//		s1.birthday.set(1994,8,17);
//		
//		int total = s1.kor + s1.eng + s1.math;
//		double avg = total/3.0;
//				
//		System.out.printf("%s의 성적:%d %d %d\n",s1.name,s1.kor,s1.eng,s1.math);
//		System.out.printf("%s의 총점: %d점. 평균: %.1f점.\n",s1.name,total,avg);
//		
//		Student s2 = new Student();
//		
//		s2.name="아무개";
//		s2.kor =99;
//		s2.eng =88;
//		s2.math =98;
//		
//		s2.printScore();
//		
//		//본인이 가지고 있는 자신의 성적을 이용해서 계산된 값을 돌려주는 행동 > 잘 만들어진 메소드
//		System.out.println(s1.getTotal());
//		System.out.println(s2.getAvg());
		
		
		
	}//main
	
}//Ex35_Class
