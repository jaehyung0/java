package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex83_Lambda {

	public static void main(String[] args) {
		
		//익명 객체의 활용 예 > 배열, 컬렉션 정렬 > 람다식으로 전환 가능
		
		List<Integer> nums = new ArrayList<Integer>();
		List<String> names = new ArrayList<String>();
		List<User> users = new ArrayList<User>();
		
		nums.add(200);
		nums.add(400);
		nums.add(300);
		nums.add(500);
		nums.add(100);
		
		names.add("홍길동");
		names.add("아무개");
		names.add("유재석");
		names.add("강호동");
		names.add("테스트");
		
		users.add(new User("홍길동푸푸",20));
		users.add(new User("아무개",25));
		users.add(new User("유재",23));
		users.add(new User("강호동하하하하",22));
		users.add(new User("테",28));
		
		//개발자 개입 O,X
		//개입O
		//nums.sort(null);
		
		//개입X -> 단일 타입(숫자,문자,날짜) + 오름차순
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.sort(names);
		System.out.println(names);
		
		//Collections.sort(users); //객체 배열은 개발자의 개입이 필
		//System.out.println(users);
		
		//개입O -> 단일 타입 + 복합 타입(객체) + 오름차순 + 내림차순 -> 모든 정렬
		
//		nums.sort(new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				//return o1-o2; //오름차순
//				return o2-o1;
//			}
//		});
		
		//nums.sort((Integer o1, Integer o2)->{return o2-o1;});
		nums.sort((o1,o2) -> o1-o2);
		
		System.out.println(nums);
		
		names.sort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				//return o1.compareTo(o2);//가나다순
				return o2.compareTo(o1);//역순
			}
		});
		System.out.println(names);
		
		users.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				
				//return o1.getAge()-o2.getAge();
				//return o1.getName().compareTo(o2.getName());
				return o1.getName().length()-o2.getName().length();
			}
		});
		users.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println(users);
		
	}
}

class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return String.format("[name=%s, age=%s]", name, age);
	}
	
	
	
}
