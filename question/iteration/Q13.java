package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Q13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int money=0;
		int num=0;
		
		for(int i=0;;i++) {
			
			
		bendingMachine();
		System.out.print("투입 금액(원):");
		money = Integer.parseInt(reader.readLine());
		System.out.println("-----------------");
		System.out.print("음료 선택(번호):");
		num = Integer.parseInt(reader.readLine());
			
		choose(money, num);
		
		
		System.out.println();
		System.out.println("계속하시려면 엔터를 입력하세요");
		String enter = reader.readLine(); //그냥 reader.readLine();만 써도 됨
		
		
		}
		
		
		
	}

	private static void bendingMachine() {
		System.out.println("=================");
		System.out.println("      자판기");
		System.out.println("=================");
		System.out.println("1. 콜라: 700원");
		System.out.println("2. 사이다: 600원");
		System.out.println("3. 비타500: 500원");
		System.out.println("-----------------");
	}

	private static void choose(int money, int num) {
		switch(num) {
			case 1: System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n",money-700);
					break;
			case 2: System.out.println("+사이다를 제공합니다.");
					System.out.printf("잔돈 %d원을 제공합니다.\n",money-600);
					break;
			case 3: System.out.println("+비타500을 제공합니다.");
					System.out.printf("잔돈 %d원을 제공합니다.\n",money-500);
					break;
			}
	}
}
