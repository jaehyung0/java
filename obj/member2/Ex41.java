package com.test.java.obj.member2;

public class Ex41 {

	public static void main(String[] args) {
		Family family = new Family();
		
		Father father = new Father();
		
		father.setName("홍길동");
		father.setAge(50);
		father.setHometown("서울");
		family.setFather(father);
		
	}
	
		
	
}


//아빠, 엄마 , 아들, 딸
//-이름, 나이, 출생
class Family {
	
	private Father father;
	private Mother mother;
	private Son son;
	private Daughter daughter;
	
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public Daughter getDaughter() {
		return daughter;
	}
	public void setDaughter(Daughter daughter) {
		this.daughter = daughter;
	}
	
	
	

}

class Father {
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

class Mother {
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

class Son {
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

class Daughter {
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