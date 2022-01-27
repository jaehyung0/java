package com.test.question.obj;

public class Eraser {

	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		if(size.equals("Large")||size.equals("Midium")||size.equals("Small")) {
			this.size = size;
		}else {
			System.out.println("다시입력해주세요.");
			return;
		}
			
	}
	
	public static void info() {
		System.out.printf("지우개 %d회\n",Packer.eraserCount);
	}
	
}
