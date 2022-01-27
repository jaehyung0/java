package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("한변의 정사각형 수(홀수만): ");
		int num = Integer.parseInt(reader.readLine());
		
		int[][] nums = new int[num][num];
		
		int n=1;
		
		for (int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				int sum = i+j;
				for(int k=0;k<num;k++) {
					if(sum<k) {
						nums[i][j]=n;
						n++;	
					}
					
					
				}
				
				
				
					
				
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
