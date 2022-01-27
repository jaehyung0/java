package com.test.question.obj;

public class Pencil {

	private String hardness;
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		if(hardness.equals("4B")||hardness.equals("3B")||
				hardness.equals("2B")||hardness.equals("B")||hardness.equals("HB")
				||hardness.equals("H")||hardness.equals("2H")||hardness.equals("3H")||
				hardness.equals("4H")) {
			this.hardness = hardness;
		}//else {
			//System.out.println("다시 입력해주세요.");
			//return;
		//}
		
		
	}
	
	public static void info() {
		System.out.printf("연필 %d회\n",Packer.pencilCount);
	}
	
	
}
