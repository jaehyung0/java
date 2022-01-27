package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		//score();
		score2();
	}

	private static void score2() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수:");
		int score = Integer.parseInt(reader.readLine());
		
		String grade = "";
		
		if (score<=100 && score>=0) {
			if(score>=90) {
				grade = "A";
			}else if(score>=80) {
				grade = "B";
			}else if(score>=70) {
				grade = "C";
			}else if(score>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
			
		} else {
			System.out.println("점수는 0~100점 사이로 입력해주세요.");	
		}
		
		System.out.printf("입력한 %d점은 성적 %s입니다.",score,grade);
		
		
		
	}

	private static void score() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("점수는 0~100점 사이로 입력해주세요.");
		System.out.print("점수:");
		int score = Integer.parseInt(reader.readLine());
		
		
		if (score<=100 && score>=0) {
			if(score>=90) {
				System.out.printf("입력한 %d점은 성적A입니다.",score);
			}else if(score>=80) {
				System.out.printf("입력한 %d점은 성적B입니다.",score);
			}else if(score>=70) {
				System.out.printf("입력한 %d점은 성적C입니다.",score);
			}else if(score>=60) {
				System.out.printf("입력한 %d점은 성적D입니다.",score);
			}else {
				System.out.printf("입력한 %d점은 성적F입니다.",score);
			}
			
		} else 
			System.out.println("점수는 0~100점 사이로 입력해주세요.");	
		
		
	}
}
