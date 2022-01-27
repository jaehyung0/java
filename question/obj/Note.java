package com.test.question.obj;

public class Note {

	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	public int realprice;
	public String width;
	
	public void setSize(String size) {  //쓰기전용
		if(isVaildSize(size)) {
			this.size = size;
		}else {
			System.out.println("A3,A4,A5,B3,B4,B5 입력");
			return;
		}
			
		
	}
	
	private boolean isVaildSize(String size) {
		if(size.equals("A3")||size.equals("A4")||size.equals("A5")||size.equals("B3")||size.equals("B4")||size.equals("B5"))
			return true;
		else {
			return false;
		}
	}
	
	public void setColor(String color) {  //쓰기전용
		if(isVaildColor(color)) {
			this.color=color;
		}else {
			System.out.println("흰색, 노란색, 검정색, 파란색 입력");
		}
		
	}
	private boolean isVaildColor(String color) {
		if(color.equals("검정색")||color.equals("흰색")||color.equals("노란색")||color.equals("파란색")) {
			return true;
		}else {
			return false;
		}
		
	}

	public void setPage(int page) {  //쓰기전용
		if(page>=10&&page<=200)
			this.page = page;
		
	}
	
		
		
	

	public void setOwner(String owner) { //쓰기전용
		
			this.owner = isValidName(owner);
		
			
			
	}

	private String isValidName(String owner) {
		for(int i=0; i<owner.length();i++) {
			char c = owner.charAt(i);
			if(c>'가'&&c<'힣') {
				return owner;
			}
		}
		return "";
		
		}
	
	public String info() {
		String temp="";
		if(this.owner!= null) {
			temp+="■■■■■■ 노트 정보 ■■■■■■"+"\n";
			temp+="소유자: " +this.owner+"\n";
			temp+="특성: " +this.color+" "+ispageMark()+" " +this.size+"노트"+"\n";
			temp+="가격: " +isPrice()+"원"+"\n";
			temp+="■■■■■■■■■■■■■■■■■■■■■■";
			
		}else {
			temp+="■■■■■■ 노트 정보 ■■■■■■"+"\n";
			temp+="주인 없는 노트"+"\n";
			temp+="■■■■■■■■■■■■■■■■■■■■■■";
		}
		
		
		return temp;
	}
	
	//얇은 보통 두꺼운 출력 메소드
	private String ispageMark() {
		if(this.page>=10&&this.page<=50) {
			width = "얇은";
		}else if(this.page>50&&this.page<=100) {
			width = "보통";
		}else if(this.page>100&&this.page<=200) {
			width = "두꺼운";
		}
		
		return width;
		
		
	}
	
	//가격 출력 메소드
	private int isPrice() {
//		(+) 기본 노트 : A5(200원) + 흰색(200원) + 10페이지(100원) = 가격(500원)
//		(+) 크기 변경 : A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
//		(+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
//		(+) 페이지수 변경 : 페이지 당 x 10원 추가
		if(this.size.equals("A5"))
			realprice+=200;
		if(this.size.equals("A3"))
			realprice+=600;
		if(this.size.equals("A4"))
			realprice+=400;
		if(this.size.equals("B3"))
			realprice+=700;
		if(this.size.equals("B4"))
			realprice+=500;
		if(this.size.equals("B5"))
			realprice+=300;
		if(this.color.equals("흰색"))
			realprice+=200;
		if(this.color.equals("검정색"))
			realprice+=300;
		if(this.color.equals("노란색"))
			realprice+=400;
		if(this.color.equals("파란색"))
			realprice+=400;
		realprice=realprice+this.page*10;
		
		
		return realprice;
	}
}
