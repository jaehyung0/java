package com.test.question.obj;

public class Q02 {

	public static void main(String[] args) {
		
		Note note = new Note();
		note.setSize("A4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		System.out.println(note.info());
		
		System.out.println();
		
		Note note1 = new Note();
		note1.setSize("B4");
		note1.setColor("파란색");
		note1.setPage(125);
		note1.setOwner("김재형");
		System.out.println(note1.info());
		
		System.out.println();
		
		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		System.out.println(note2.info());
	}
}
