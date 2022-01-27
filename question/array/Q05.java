package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최소 범위: ");
		int min = Integer.parseInt(reader.readLine());

		System.out.print("최대 범위: ");
		int max = Integer.parseInt(reader.readLine());
		
		int[] array = new int[20];
		int i=0;
		
		System.out.print("원본: ");
		for(i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*20)+1;
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		System.out.print("결과: ");
		for(i=0;i<array.length;i++) {
			if(array[i]>=min&&array[i]<=max) {
				System.out.print(array[i]+" ");
			}
		}
	}
}
