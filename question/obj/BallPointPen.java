package com.test.question.obj;

public class BallPointPen {

	private double thickness;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equals("red")||color.equals("blue")||color.equals("green")||
				color.equals("black")) {
			this.color = color;
		}else {
			System.out.println("다시 입력해주세요.");
			return;
		}
		
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		if(thickness==0.3||thickness==0.5||thickness==0.7||
				thickness==1||thickness==1.5) {
			this.thickness = thickness;
		}else {
			System.out.println("다시 입력해주세요.");
			return;
		}
		
	}
	
	public static String info() {
		//System.out.printf("볼펜 %d회\n",Packer.ballPointCount);
		return String.format("볼펜 %d회\n",Packer.ballPointCount);
	}
	
}
