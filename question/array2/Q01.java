package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
		
		int n=1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행: ");
		int hang = Integer.parseInt(reader.readLine());
		
		System.out.print("열: ");
		int yeol = Integer.parseInt(reader.readLine());

		int[][] nums = new int[hang][yeol];

		for (int i=0; i<hang; i++) {
			if(i%2==0) {
				for(int j=0;j<yeol;j++) {
					nums[i][j]=n;
					n++;}
			}
			else {
				for(int j=yeol-1;j>=0;j--) {
					nums[i][j]=n;
					n++;}
			}
				
				
			
		}
		
		output(nums);
		}	
	
		
		


	private static void output(int[][] nums) {

		for (int i=0; i<nums.length; i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
		
	}
}	
