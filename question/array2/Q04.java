package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행: ");
		int hang = Integer.parseInt(reader.readLine());
		
		System.out.print("열: ");
		int yeol = Integer.parseInt(reader.readLine());

		int[][] nums = new int[hang][yeol];
		
		int n=1;
		
		for(int i=0;i<hang;i++) {
			for(int j=0;j<yeol-i;j++) {
				nums[i][j]=n;
				n++;
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
