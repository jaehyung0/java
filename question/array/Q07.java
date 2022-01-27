package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삽입 위치: ");
		int input = Integer.parseInt(reader.readLine());

		System.out.print("값: ");
		int num = Integer.parseInt(reader.readLine());

		int[] array = new int[10];
		
		System.out.print("원본:[");
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*9)+1;
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		
		//난수 생성
		
		
		for (int i=array.length-2;i>=input;i--) {
			array[i+1]=array[i];
			
		}
		array[input]=num;
		System.out.println(Arrays.toString(array));
		
	}
}
