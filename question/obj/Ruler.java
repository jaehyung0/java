package com.test.question.obj;

public class Ruler {

	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length==30||length==50||length==100) {
			this.length = length;
		}else {
			System.out.println("다시 입력하세요.");
			return;
		}
			
		
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		if(shape.equals("줄자")||shape.equals("운형자")||shape.equals("삼각자")) {
			this.shape = shape;
		}else {
			System.out.println("다시 입력하세요.");
			return;
		}
		
	}
	
	public static void info() {
		System.out.printf("자 %d회\n",Packer.rulerCount);
	}
}
