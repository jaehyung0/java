package com.test.java.obj.member3;

public class Ex42 {
	
	public static void main(String[] args) {
		
		Family family = new Family();
		Person father = new Person();
		father.setName("홍길동");
		father.setAge(40);
		father.setHometown("서울");
		
		Person mother = new Person();
		mother.setName("호호호");
		mother.setAge(40);
		mother.setHometown("서울");
		
		Person son = new Person();
		son.setName("홍재석");
		son.setAge(19);
		son.setHometown("서울");
		
		Person daughter = new Person();
		daughter.setName("홍나래");
		daughter.setAge(15);
		daughter.setHometown("서울");
		
		family.setFather(father);
		family.setFather(mother);
		family.setFather(son);
		family.setFather(daughter);
		
		System.out.println(family.getFather());
	}

	
}//main

class Family {
	
	private Person father;
	private Person mother;
	private Person son;
	private Person daughter;
	
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getSon() {
		return son;
	}
	public void setSon(Person son) {
		this.son = son;
	}
	public Person getDaughter() {
		return daughter;
	}
	public void setDaughter(Person daughter) {
		this.daughter = daughter;
	}
	
	
}

//아빠, 엄마, 아들 , 딸 -> 모든 역할
class Person {
	private String name;
	private int age;
	private String hometown;
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
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	
}