package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;



public class Ex78_Set {

	public static void main(String[] args) {
		
		/*
		 * Set
		 * -중복값을 가지지 않는 데이터 집합
		 * -순서가 없는 배열
		 * -HashSet, TreeSet
		 * 
		 * -HashMap: Hash 알고리즘을 사용해서 Map인터페이스를 구현
		 * -HashSet: Hash 알고리즘을 사용해서 Set인터페이스를 구현
		 * -TreeSet: Tree 알고리즘(자료구조)를 사용해서 Set 인터페이스를 구현
		 * -ArrayList: Array 자료구조를 사용해서 List 인터페이스를 구현
		 * -LinkedList: Linked 자료구조를 사용해서 List 인터페이스를 구현
		 * 
		 * 
		 * 
		 * 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		
	}

	private static void m4() {
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("아무개",23);
		Person p3 = new Person("홍길동",20);
		
		//Set은 두 객체가 동일한 객체인지 비교한다
		// -> Hashcode값을 비교
		
		//객체를 같은 취급하려면
		// -> hashcode() + equals() 재정의
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("홍길동20".hashCode()); //p1
		System.out.println(("홍길동"+"20").hashCode());
		System.out.println("홍길동25".hashCode());
		System.out.println("아무개30".hashCode());
		
		System.out.println(p1.equals(p2)); //홍길동 == 아무개
		System.out.println(p1.equals(p3)); //홍길동 == 홍길동
		
	}

	private static void m3() {
		
		List<Person> alist = new ArrayList<Person>();
		Set<Person> slist = new HashSet<Person>();
		
		alist.add(new Person("홍길동",20));
		alist.add(new Person("아무개",25));
		alist.add(new Person("하하하",27));
		alist.add(new Person("홍길동",20)); //1번째 사람과 동일인? O? X?
		
		//Set에 참조객체를 넣을 때 발생하는 상황
		slist.add(new Person("홍길동",20));
		slist.add(new Person("아무개",25));
		slist.add(new Person("하하하",27));
		slist.add(new Person("홍길동",20)); //Set의 결론 > 처음 홍길동과 다른 사람
		
		System.out.println(alist);
		
		System.out.println(slist);
		
		
	}

	private static void m2() {
		//난수 발생 > 중복 숫자 금지
		Random rnd = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		int n=rnd.nextInt(45)+1;
//		boolean flag = false;
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<i;j++) {
//				if(n==lotto.get(j)) {
//					flag=true;
//					break;
//				}
//			}
//			if(flag) {
//				//중복
//				i--;
//			}else {
//				//중복x
//				lotto.add(n);
//			}
//			
//		}
//		System.out.println(lotto);
		
		
		//Set
		Set<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size()<6) {
			int num = rnd.nextInt(45)+1;
			lotto2.add(num);
		}
		System.out.println(lotto2);
		
		
		
		//행사 > 경품 > 티켓 추첨 + 사은품
		List<String> box = new ArrayList<String>();
		
		box.add("홍길동");
		box.add("아무개");
		box.add("하하하");
		box.add("호호호");
		box.add("후후후");
		
		
		//1.중복 당첨 가능
		List<String> result = new ArrayList<String>(); //결과
		
		for(int i=0;i<3;i++) {
			result.add(box.get(rnd.nextInt(box.size())));
		}
		System.out.println(result);
		
		//2.중복 당첨 불가능
		Set<String> result2 = new HashSet<String>();
		while(result2.size()<3) {
			result2.add(box.get(rnd.nextInt(box.size())));
		}
		System.out.println(result2);
	}

	private static void m1() {
		//ArrayList<String> list = new ArrayList<String>();
		//HashSet<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		//요소 추가하기
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		list.add("딸기");
		
		set.add("사과");
		set.add("바나나");
		set.add("딸기");
		set.add("딸기"); //안들어감
		
		//요소 개수
		System.out.println(list.size());
		System.out.println(set.size());
		
		//덤프
		System.out.println(list);
		System.out.println(set);
		
		//List -> for, while, iterator
		//Set -> iterator(유일한 탐색 수단)
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}


class Person {
	
	private String name;
	private int age;
	
	//기본 생성자, 매개변수 생성자
		//Getter, Setter
		//toString()재정의
	
	public Person() {
		this("", 0);
	}


	public Person(String name, int age) {
		
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
	
	
	@Override
	public int hashCode() {
		
		return (this.name+this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// 객체의 비교 > 주소값 비고 > 해시코드값 비교
		return this.hashCode()== obj.hashCode();
	}
	
}