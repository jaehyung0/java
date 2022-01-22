package com.test.java.obj;

public class Ex46_Constructor {

	public static void main(String[] args) {
		
		Developer hong = new Developer();
		//System.out.println(hong.name());
//		hong.setName("홍길동");
//	    hong.setLanguage("Java");
		
		Developer hong2 = new Developer("홍길동","Java");
		//System.out.println();
		
		Developer hong3 = new Developer("홍길동"); // language는 미정
		
		
	}//main
}

class Developer{
	private String name;
	private String language;
	
	//자바는 사용자가 어떤 형태의 생성자를 1개 이상 선언하면 더 이상 기본 생성자를 자동으로 생성하지 않는다.
	public Developer() {
		//this.name = "익명";
		//this.language = "미정";
		
		//Developer("익명","미정");  안됨 
		this("익명","미정"); //또 다른 생성자 호출하는 방법
		
	}
	
	
	
	public Developer(String name,String language) {
		//if(유효성 검사)
		this.name=name;
		this.language=language;
	}
	
	public Developer(String name) {
		//if(유효성 검사)
//		this.name=name;
//		this.language="미정";
		this(name,"미정");
	}
	
//	public Developer(String language) {        위랑 아래랑 밖에서 보면 String 넣는것으로 같기 때문에 구별을 못함
//		this.name = "익명";
//		this.language = "Java";
//	}
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getLanguage() {
//		return language;
//	}
//	public void setLanguage(String language) {
//		this.language = language;
//	}
	
	
}

