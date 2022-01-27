package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//김재형
public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		chooseOne();
	}

	private static void chooseOne() throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자:");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자:");
		int finishNum = Integer.parseInt(reader.readLine());
		System.out.print("증가치:");
		int increase = Integer.parseInt(reader.readLine());
		
		for(int i = startNum;i<=finishNum;i+=increase) {
			System.out.println(i);
		}
	}
}
