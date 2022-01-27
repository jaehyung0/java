package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수: ");
		int student = Integer.parseInt(reader.readLine());
		
		String[] room = new String[student];
		int i=0;
		
		for(i=0;i<student;i++) {
			System.out.print("학생명: ");
			String name = reader.readLine();
			room[student-i-1] = name; //뒤에부터 집어넣음
			
					
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n",student);
		for(i=0;i<student;i++)
			System.out.printf("%d. %s\n",i+1,room[i]);
		

	}
}
