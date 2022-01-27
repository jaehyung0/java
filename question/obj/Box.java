package com.test.question.obj;



public class Box {

	   private Macaron[] list = new Macaron[10];
	    //마카롱을 만든다
	   public void cook() {
		   //마가롱 객체 10개를 만들어서 멤버 변수에 담는다.
		   
		   
		   
		   for(int i=0;i<list.length;i++) {
			   
			   Macaron m = new Macaron();
			  
			   int s = (int)(Math.random()*10)+5;
			   
			   m.setSize(s);
			  
			   String[] listColor = {"red", "blue","yellow","white","pink","purple","green","black"};
			  
			   String c = listColor[(int)(Math.random()*8)];
			   m.setColor(c);
			  
			   int t = (int)(Math.random()*20)+1;
			   m.setThickness(t);
			   //m.크기  마카롱 세팅한다  > 랜덤(Math.random)
			   //m.색상
			   //m.두께
			   list[i]=m; // 마카롱을 상자에 담는다
			   //System.out.println(s);
			   //System.out.println(t);
			   //System.out.println(c);
			   //System.out.println(list[i].getColor());
		   }
		   System.out.println("마카롱을 10개 만들었습니다.");
		   System.out.println();
		   
		   //System.out.println(list[1].getColor());
	   }
	  
	   public void check() {
		   //10개의 마카롱 -> QC
		   //System.out.println();
		   int c = 0;
		  
		  // System.out.println(list[0].getSize());
		  // System.out.println(list[0].getColor());
		   for(int i=0;i<list.length;i++) {
			  if((list[i].getSize()>=8&&list[i].getSize()<=14)&&(list[i].getColor()!="black")&&(list[i].getThickness()>=3&&list[i].getThickness()<=18)) {
				  c++;
				  
			  }				  
			 
		   }
		   System.out.println("[박스 체크 결과]");
		   System.out.printf("QC 합격 개수: %d\n",c);
		   System.out.printf("QC 불합격 개수: %d\n",10-c);
		   System.out.println();
	   }
	   
	   public void list() {
		  String check ="";
		  System.out.println("[마카롱 목록]"); 
		  for(int i=0;i<list.length;i++) {
			   if((list[i].getSize()>=8&&list[i].getSize()<=14)&&list[i].getColor()!="black"&&(list[i].getThickness()>=3&&list[i].getThickness()<=18)) {
			   
				  check = "합격";
				  
			   }else {
				   check= "불합격";
				   
			   }
			   
			   
			   System.out.printf("%d번 마카롱 : %dcm(%s,%dmm):%s\n",i+1,list[i].getSize(),list[i].getColor(),list[i].getThickness(),check);
		   }
		   
	   }
}
