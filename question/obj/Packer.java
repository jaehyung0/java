package com.test.question.obj;

public class Packer {

	public static int pencilCount;
	public static int eraserCount;
	public static int ballPointCount;
	public static int rulerCount;
	
	
	
	public void packing(Pencil pencil) {
		
		if(pencil.getHardness()!=null) {
			System.out.printf("포장 전 검수: %s 진하기 연필입니다.\n",pencil.getHardness());
			System.out.println("포장을 완료했습니다.");
			pencilCount++;
		}else {
			System.out.println("제대로 입력해주세요.");
		}
		
	}
	
	public void packing(Eraser eraser) {
		if(eraser.getSize()!=null) {
			System.out.printf("포장 전 검수: %s 사이즈 지우개입니다.\n",eraser.getSize());
			System.out.println("포장을 완료했습니다.");
			eraserCount++;
		}else {
			System.out.println("제대로 입력해주세요.");
		}
		
	}
	
	public void packing(BallPointPen ballPointPen) {
		if(!ballPointPen.getColor().equals(null)||ballPointPen.getThickness()!=0) {
			System.out.printf("포장 전 검수: %s 색상 %smm 볼펜입니다.\n",ballPointPen.getColor(),ballPointPen.getThickness());
			System.out.println("포장을 완료했습니다.");
			ballPointCount++;
		}else {
			System.out.println("제대로 입력해주세요.");
		}
		
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수: %dcm %s입니다.\n",ruler.getLength(),ruler.getShape());
		System.out.println("포장을 완료했습니다.");
		rulerCount++;
	}
	
	public void countPacking(int type) {
		System.out.println("========================");
		System.out.println("포장결과");
		System.out.println("========================");
		switch(type) {
		case 0:
			Pencil.info();
			Eraser.info();
			System.out.print(BallPointPen.info());
			Ruler.info();
			break;
		case 1:	
			Pencil.info();
			break;
		case 2:
			Eraser.info();
			break;
		case 3:
			System.out.print(BallPointPen.info());
			break;
		case 4:
			Ruler.info();
			break;
		}
		System.out.println();
		
	}
	
}
