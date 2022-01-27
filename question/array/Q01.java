package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		
		
		
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			nums1[i] = num;
			
			nums2[i]= nums1[i];
			
		}
		
		System.out.println("nums[4]="+nums2[4]);
		System.out.println("nums[3]="+nums2[3]);
		System.out.println("nums[2]="+nums2[2]);
		System.out.println("nums[1]="+nums2[1]);
		System.out.println("nums[0]="+nums2[0]);
		

	}
}
