package com.test.java.obj;

public class Ex38_this {

	public static void main(String[] args) {
		
		//1.외부에서 접근
		// -> 객체명을 사용
		// -> 객체명.멤버명
		// -> m1.model
		// -> m1.setModel()
		
//		2. 내부에서 접근
//		  -> this 키워드 사용
//		  -> this.멤버명
//		  -> this.model
//		  -> this.setModel()
		
		Mouse m1 = new Mouse();
		m1.setModel("A001");
		m1.setPrice(10000);
		
		Mouse m2 = new Mouse();
		m2.setModel("B002");
		m2.setPrice(20000);
	}
}


class Mouse {
	private String model;
	private int price;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//this
		//-현재 코드가 소속되어 있는 객체를 표현한다.
		//-this를 적어 놓은(사용하고 있는) 메소드를 가지고 있는 객체
		//-this는 자기 자신을 가리키는 상대적 표현 > '나'라는 존재
		
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}