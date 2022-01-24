package com.test.java;

public class Ex48_StringBuilder {

	public static void main(String[] args) {
		
		//String vs StringBuilder
		//-문자열 클래스
		
		//클래스의 인스턴스 생성방법 > new + 생성자
		
		String s1 = "홍길동"; //문자형 리터럴 사용
		String s3 = new String("홍길동"); //객체 생성 사용
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		//StringBuilder s2 = "홍길동";
		
		//문자열 특징
		//-문자열은 불변이다. > 문자열 수정 작업에는 비용이 많이 발생한다.
		//-문자열은 잦은 수정작업에 취약하다.
		//-덩치 큰 문자열의 수정작업에 취약하다.
		
		String s4="홍길동"; //글자수:100만 이라면 바꿨을때 가비지데이터가 더 커진다
		s4=s4+"."; //데이터 수정(x) -> 주소값 수정
		
		long begin =0;
		long end=0;
		
		System.out.println("[String]");
		
		String txt1="홍길동";
		
//		begin=System.currentTimeMillis();
//		for(int i=0;i<200000;i++) {
//			txt1+=".";
//		}
//		
//		end=System.currentTimeMillis();
//		
//		System.out.println("length():"+txt1.length());
//		
//		System.out.printf("%,dms\n",(end-begin));
//		
		System.out.println("[StringBuilder]");
		StringBuilder txt2 = new StringBuilder("홍길동");
		begin=System.currentTimeMillis();
		for(int i=0;i<200000;i++) {
			//txt2+=".";
			txt2.append(".");
			
		}
		end=System.currentTimeMillis();
		
		System.out.println("length():"+txt2.length());
		System.out.printf("%,dms\n",(end-begin));
		
		User u1 = new User();
		System.out.println(u1.info());
	}
}

class User{
	private String name;
	private int age;
	private String id;
	
	public String info() {
	//	String temp = "";
//		temp+="이름:"+name;
//		temp+="나이:"+age;
//		temp+="아이디:"+id;
//		return temp;
		
		StringBuilder temp = new StringBuilder();
		temp.append("이름:"+name);
		temp.append("나이:"+age);
		temp.append("아이디:"+id);
		return temp.toString();  //StringBuilder -> String
		
	}
}


