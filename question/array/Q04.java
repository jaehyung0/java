package com.test.question.array;

import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {
		
		
		int[] nums = new int[20];
		
		
		System.out.print("원본: ");
		for(int i=0;i<nums.length;i++) {
			
			nums[i] = (int)(Math.random()*20)+1;
			System.out.print(nums[i]+" ");		
		}
		System.out.println();
		System.out.println(Arrays.toString(nums)); 
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
				
			}
			
			if(min>nums[i]) {
				min=nums[i];
				
			}
		}
		System.out.printf("최댓값: %d\n",max);
		System.out.printf("최솟값: %d\n",min);
	}
}
