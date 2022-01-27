package com.test.question.obj;

public class Book {

	//제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수 >> 멤버 변수 만들기
	private String title;
	private int price;
	private String author;
	private int page;
	private String publisher;
	private String pubYear="2019";
	private String isbn;
	
	
	
	//제목
	public void setTitle(String title) {
		if(title.length()<50) {
				for(int i=0;i<title.length();i++) {
				
				char c = title.charAt(i);
				if(!(c>='a'&&c<='z')&&!(c>='A'&&c<='Z')&&!(c>='0'&&c<='9')&&!(c>='가'&&c<='힣')) {
						System.out.println("제목은 한글, 영어, 숫자만 입력하세요.");
						return;
					}
								
					
				}
			
		}else {
			System.out.println("50자 이내로 입력하세요.");
			return;
		}
			
		
		
		this.title=title;
			
	}
	
	public String getTitle() {
		return this.title;
	}
	
	//가격
	public void setPrice(int price) {
		if(price>=0&&price<=1000000) {
			this.price=price;
		
		}else
			System.out.println("1~1000000사이로 입력해주세요.");
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//저자
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	//페이지수
	public void setPage(int page) {
		if(page>=1)
			this.page=page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	//출판사
	public String setPublisher(String publisher) {
		return this.publisher;
	}
	
	//발행년도
	public String getPubYear() {
		return this.pubYear;
	}
	
	//ISBN
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	
	
	//출력
	
	public String info() {
		return "제목: " + this.title+"\n" + "가격: " + this.price+"\n" + "저자: " + this.author+"\n" + "출판사: " + this.publisher+"\n" + "페이지수: " + this.page+"\n" + "발행년도: " + this.pubYear+"\n" + "ISBN: " + this.isbn; 
	}
}
