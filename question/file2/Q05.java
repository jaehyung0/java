package com.test.question.file2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) throws Exception {
		
		String pathUser="D:\\class\\java\\파일_입출력_문제\\검색_회원.dat";
		String pathOrder="D:\\class\\java\\파일_입출력_문제\\검색_주문.dat";
		
		BufferedReader readerUser = new BufferedReader(new FileReader(pathUser));
		BufferedReader readerOrder = new BufferedReader(new FileReader(pathOrder));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름:");
		String name = scan.nextLine();
		
		String line=null;
		String line2=null;
		
		System.out.println("========구매내역=========");
		System.out.println("[번호]\t[이름]\t[상품명]  [개수]  [배송지]");
		while((line=readerUser.readLine())!=null) {
			String[] user = line.split(",");
			if(name.equals(user[1])) {
				while((line2=readerOrder.readLine())!=null) {
					String[] order = line2.split(",");
					if(user[0].equals(order[3])) {
						System.out.printf("%3s\t%s\t%s\t%6s\t  %s\n",order[0],user[1],order[1],order[2],user[2]);
					}//if equal order
					
						
					
				}//while line2
			}// if equal name
		
		}//while line
		
	}
}
