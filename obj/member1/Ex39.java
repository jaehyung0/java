package com.test.java.obj.member1;

public class Ex39 {

	public static void main(String[] args) {
		
		//- 클래스 멤버 변수의 자료형
		
		User hong = new User();
		hong.setName("홍길동");
		hong.setAge(20);
		
		String[] nick = new String[3];
		nick[0] = "키다리";
		nick[1] = "천재";
		nick[2] = "박사";
		
		hong.setNick(nick);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getNick()[0]);
		
		
		User test = new User();
		
		test.setName("테스트");
		test.setAge(20);
		test.setFriend(hong);
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getFriend().getName());
		System.out.printf("%s의 친구는 %s입니다.",test.getName(),test.getFriend().getName());
		
		
		
		
	}
}//main

class User{
	
	//클래스 멤버 변수
	//- 자료형?
	//- 모든 자료형의 멤버를 만들 수 있다.
	private String name;
	private int age;
	
	private String[] nick = new String[3];
	private User friend;
	
	

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

	public String[] getNick() {
		return nick;
	}

	public void setNick(String[] nick) {
		this.nick = nick;
	}

	public User getFriend() {
		return friend;
	}

	public void setFriend(User friend) {
		this.friend = friend;
	}
	
	
}

