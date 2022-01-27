package com.test.question.obj2;

public class Book {

	private String title;
	private int price;
	private String author;
	private int page;
	private String publisher;
	private String pubYear="2019";
	private String isbn;
	
	public void setTitle(String title) {
		if(isValid(title)&&title.length()<=50) {
			this.title=title;
		}else {
			System.out.println("제목은 최대 50자 이내(한글, 영어, 숫자)로 입력하세요.");
			return;
		}
			
	}
	
	private boolean isValid(String title) {
		for(int i=0; i<title.length();i++) {
			char c = title.charAt(i);
			if((c<'가'||c>'힣')
					&&(c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c!=' ')){
				return false;
			}
			
		}
		return true;
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public String info() {
		
		String temp="";
		temp+="제목:" +this.title+",";
		temp+="가격:" +this.price+",";
		temp+="저자:" +this.author+",";
		temp+="출판사:" +this.publisher+",";
		temp+="발행년도:" +this.pubYear+",";
		temp+="INBN:" +this.isbn+",";
		temp+="페이지수:" +this.page;
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
}
