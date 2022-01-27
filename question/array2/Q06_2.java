package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06_2 {

	
						
	public static void main(String[] args) throws IOException {					
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));				
						
						
				
		int hang = 0, yeol = 0;				
		int[][] nums;				
						
		System.out.print("행 : ");				
		hang = Integer.parseInt(reader.readLine());				
						
		System.out.print("열 : ");				
		yeol = Integer.parseInt(reader.readLine());				
						
						
					
		nums = new int[hang][yeol];				
						
		int n = 1;				
		int sum = 0;				
						
		for(int i = 0; i < hang - 1; i++) {				
			sum = 0;			
			for(int j = 0; j < yeol ; j++) {			//4x5열 한번에
				if(j != yeol -1) {		
					sum += n;	
					nums[i][j] = n++;	
				}		
				else		
					nums[i][j] = sum;	
			}			
		}				
						
		//마지막 행				
		for(int i = 0; i < yeol - 1; i++) {				
			for(int j = 0; j < hang - 1; j++)			
				nums[hang-1][i] += nums[j][i];		
			nums[hang-1][yeol-1] += nums[hang-1][i];			
		}				
						
				
		output(nums);				
						
	}	
	public static void output(int[][] nums) {					
		for(int i = 0; i < nums.length; i++) {				
			for(int j = 0; j < nums[0].length; j++)			
				System.out.printf("%4d", nums[i][j]);		
			System.out.println();			
		}				
	}					
}
