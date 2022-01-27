package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int money = 0;
		String sel = "";
		
		for(;;) {
		menu();
		
		System.out.println("-----------------");
		System.out.print("투입 금액(원):");
		money = Integer.parseInt(reader.readLine());
		
		System.out.println("-----------------");
		System.out.print("음료 선택(번호):");
		sel = reader.readLine();
		
		System.out.println("-----------------");
		
		if(money>=getItemPrice(sel)) {
		
		System.out.printf("+%s를 제공합니다.\n",getItemName(sel));
		System.out.printf("잔돈을 %,d원을 제공합니다.\n",money-getItemPrice(sel));
		}else {
			System.out.printf("+투입한금액 %,d원은 %s 음료를 구입하기엔 %,d원이 부족합니다.\n",money, getItemName(sel),getItemPrice(sel)-money);
		}
		
		pause(reader);
		
		
		}
		
	}//main

	private static void pause(BufferedReader reader) throws IOException {
		System.out.println();
		System.out.println("계속 하시려면 엔터를 입력하시오.");
		reader.readLine();
	}

	private static int getItemPrice(String sel) {
		if (sel.equals("1")) {
			return 700;
		}else if(sel.equals("2")) {
			return 600;
		}else if (sel.equals("3")) {
			return 500;
		}
		return 0;
	}

	private static String getItemName(String sel) {

		if (sel.equals("1")) {
			return "콜라";
		}else if(sel.equals("2")) {
			return "사이다";
		}else if (sel.equals("3")) {
			return "비타500";
		}
		return null;
	}

	private static void menu() {
		System.out.println("=================");
		System.out.println("      자판기");
		System.out.println("=================");
		System.out.println("1. 콜라: 700원");
		System.out.println("2. 사이다: 600원");
		System.out.println("3. 비타500: 500원");
		
		
		
	}
}
