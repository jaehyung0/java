package com.test.question.obj2;

public class Q01 {

	public static void main(String[] args) {
		
		//검증.. 테스트
		//클래스가 올바르게 설계되었는지?
		
		Book b1 = new Book();
		
		b1.setTitle("자바의정석");
		b1.setPrice(35000);
		b1.setPublisher("한빛 미디어");
		b1.setPage(500);
		b1.setAuthor("김재형");
		b1.setIsbn("kkk111");
		
		
		System.out.println(b1.info());
		
	}
}
