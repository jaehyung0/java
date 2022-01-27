package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 길이: ");
		int length = Integer.parseInt(reader.readLine());

		int[] array = new int[length];
		int sum = 0;
		
		System.out.print("nums=[");
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*10)+1;
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		System.out.println();
		
		System.out.print("result=[");
		for(int i=0;i<array.length-1;i+=2) {
			sum = array[i]+array[i+1];
			System.out.print(sum+" ");
		}
		System.out.println("]");
	}
}
