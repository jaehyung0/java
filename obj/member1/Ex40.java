package com.test.java.obj.member1;

public class Ex40 {

	public static void main(String[] args) {
		
		Family family = new Family();
		
		family.setFatherName("홍길동");
		family.setFatherAge(40);
		family.setFatherHometown("서울");
		
		family.setMotherName("호호호");
		family.setMotherAge(40);
		family.setMotherHometown("경기도");
		
		
		family.setSonName("홍재석");
		family.setSonAge(20);
		family.setSonHometown("서울");
		
		family.setDaughterName("홍나래");
		family.setDaughterAge(18);
		family.setDaughterHometown("서울");
		
		
		
		
		
	}//main
	
}

//아빠, 엄마 , 아들, 딸
//-이름, 나이, 출생
//- 멤버 변수의 성격 > 집합 발견 > 좋은 코드가 아니라서 재구성
class Family {
	
	private String fatherName;
	private int fatherAge;
	private String fatherHometown;
	
	private String motherName;
	private int motherAge;
	private String motherHometown;
	
	private String sonName;
	private int sonAge;
	private String sonHometown;
	
	private String daughterName;
	public int getFatherAge() {
		return fatherAge;
	}
	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}
	public String getFatherHometown() {
		return fatherHometown;
	}
	public void setFatherHometown(String fatherHometown) {
		this.fatherHometown = fatherHometown;
	}
	public int getMotherAge() {
		return motherAge;
	}
	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}
	public String getMotherHometown() {
		return motherHometown;
	}
	public void setMotherHometown(String motherHometown) {
		this.motherHometown = motherHometown;
	}
	public int getSonAge() {
		return sonAge;
	}
	public void setSonAge(int sonAge) {
		this.sonAge = sonAge;
	}
	public String getSonHometown() {
		return sonHometown;
	}
	public void setSonHometown(String sonHometown) {
		this.sonHometown = sonHometown;
	}
	public int getDaughterAge() {
		return daughterAge;
	}
	public void setDaughterAge(int daughterAge) {
		this.daughterAge = daughterAge;
	}
	public String getDaughterHometown() {
		return daughterHometown;
	}
	public void setDaughterHometown(String daughterHometown) {
		this.daughterHometown = daughterHometown;
	}
	private int daughterAge;
	private String daughterHometown;
	

	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSonName() {
		return sonName;
	}
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
	public String getDaughterName() {
		return daughterName;
	}
	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}
	
	
	
}





