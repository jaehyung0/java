package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어: ");
		int kor = Integer.parseInt(reader.readLine());
		int kornum=kor/10;
		
		System.out.print("영어: ");
		int eng = Integer.parseInt(reader.readLine());
		int engnum=eng/10;
		
		System.out.print("수학: ");
		int math = Integer.parseInt(reader.readLine());
		int mathnum=math/10;
		
		String[][] score = new String[10][3];
		
		for(int i=score.length-1;i>=0;i--) {
			if(i>=score.length-kornum)
				score[i][0]=" ■ ";
			else
				score[i][0]="   ";
					
		}
		
		for(int i=score.length-1;i>=0;i--) {
			if(i>=score.length-engnum)
				score[i][1]=" ■ ";
			else
				score[i][1]="   ";
		}

		for(int i=score.length-1;i>=0;i--) {
			if(i>=score.length-mathnum)
				score[i][2]=" ■ ";
			else
				score[i][2]="  ";
}
			
		output(score);
		System.out.println("--------------");
		System.out.println("국어 영어 수학");
	}

	private static void output(String[][] score) {
		for (int i=0; i<score.length; i++) {
			for(int j=0;j<score[0].length;j++) {
				System.out.printf("%s",score[i][j]);
			}
			System.out.println();
		}
		
	}
}
