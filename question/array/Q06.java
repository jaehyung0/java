package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열 크기: ");
		int size = Integer.parseInt(reader.readLine());
		System.out.print("숫자의 범위: ");
		int range = Integer.parseInt(reader.readLine());
		
		
		int[] array = new int[size];
		
		for(int i=0;i<array.length;i++) {
			int num = (int)(Math.random()*range)+1;
			array[i]=num;
			//System.out.print(num+"."); // 확인용
			
			for(int j=0;j<i;j++) {
				if(array[j]==num) {
					i--;   //같으니까 돌아가서 다시 설정
					//System.out.print(array[i]+","); //확인용
					
					
				}
			}
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}
}
