package com.test.java.obj.member4;


public class Ex43 {

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
		
		Person[] parent = new Person[2];
		parent[0] = father;
		parent[1] = mother;
		family.setParent(parent);
		
		Person[] children = new Person[2];
		children[0] = son;
		children[1] = daughter;
		family.setChildren(children);
		
		//배열 노출x > 구성원 노출o
		family.setFather(father);
		family.setMother(mother);
		
		System.out.println(family.getParentName());
		
		User user = new User();
		user.addFriend(son); //User아느이 firend배열의 첫번째 방에 son 추가하기
		
	}//main
	
}

class User {
	private Person[] friend;
	
	public void addFriend(Person p) {
		this.friend[0]=p;
		
	}
}



class Family {
	//부모님
	//private Person father;
	//private Person mother;
	//자식
	//private Person son;
	//private Person daughter;
	
	private Person[] parent;
	private Person[] children;
	
	public Person[] getParent() {
		return parent;
	}
	public void setParent(Person[] parent) {
		this.parent = parent;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	
	//모든 경우 해당하는 얘기가 아님!!
	//- 배열을 외부에 노출시키면 > 외부에서 객체를 사용하기가 불편하다.
	//- 배열을 감추고 > 사용법을 개량
	
	public void setFather(Person father) {
		this.parent[0] = father;
	}
	
	public Person getFather() {
		return this.parent[0];
	}
	
	public void setMother(Person mother) {
		this.parent[1] = mother;
	}
	
	public Person getMother() {
		return this.parent[1];
	}

	public String getParentName() {
		String temp = "";
		
		for (int i=0; i<this.parent.length;i++) {
			temp += this.parent[i].getName() +",";
		}
		return temp;
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



