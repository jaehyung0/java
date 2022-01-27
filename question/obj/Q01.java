package com.test.question.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("책 제목: ");
		String title = reader.readLine();

		System.out.print("가걱: ");
		int price = Integer.parseInt(reader.readLine());

		System.out.print("저자: ");
		String author = reader.readLine();

		System.out.print("책 페이지: ");
		int page = Integer.parseInt(reader.readLine());

		System.out.print("출판사: ");
		String publisher = reader.readLine();

		System.out.print("ISBN: ");
		String isbn = reader.readLine();

		
		





		
		Book b1 = new Book();
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setAuthor(author);
		b1.setPage(page);
		b1.setPublisher(publisher);
		b1.setIsbn(isbn);
		System.out.println(b1.info());
		
		
	}
}
