package com.test.java.obj;

public class Ex44 {

	public static void main(String[] args) {
		
		PencilCase pcase =new PencilCase(); 
		
		pcase.init(); //5자루 만들고
		pcase.list();
		
		Pencil p = new Pencil();
		p.setColor("white");
		p.setThickness(20);
		pcase.add(p);//6자루
		pcase.list();
		System.out.println();
		
		pcase.get(5);
		
		
	}//main
	
}

class PencilCase {
	
	private Pencil[] list = new Pencil[10];
	private int index =5; //0~4까지는 물건이 들어있어서
	
	
	//cook()  , add()  위의 배열에 데이터를 채워 넘기는것
	public void init() {
		//배열 > 5개 펜슬을 추가하기
		for(int i=0;i<5;i++) {
			Pencil p = new Pencil();
			
			p.setColor("black");
			p.setThickness(10);
			
			this.list[i]=p;//필통안에 팬을 넣는거
			
		}
	}
	
	public void add(Pencil p) {
		
		if(this.index >= this.list.length) {
			System.out.println("필통이 꽉찼습니다.");
			return;//강제종료
		}
		this.list[index] = p;
		this.index++;
		
	}
	
	//필통안의 Pencil을 확인하기(가져오기)
	//전체 or 1개
	
	public void list() { //전체
		for(int i=0;i<this.index;i++) {
			System.out.printf("%s(%d)\r\n",this.list[i].getColor(),this.list[i].getThickness());
			
		}
	}
	
	public void get(int index) { //1개
		System.out.printf("%s(%d)\r\n",this.list[index].getColor(),this.list[index].getThickness());
	}
	
}

class Pencil {
	
	private String color;
	private int thickness;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	
}
