package com.test.question.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치: ");
		int del = Integer.parseInt(reader.readLine());

		int[] array = new int[5];
		
		System.out.print("원본:[");
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*9)+1;
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		
		switch(del) {
			case 0: array[0]=array[1]; 
					//array[1]=array[2]; 
					//array[2]=array[3];
					//array[3]=array[4];
					//array[4]=0;
					//break;    스위치는 break를 잡아줘야 다음 걸로 안넘어 간다.
			case 1: array[1]=array[2];
					//array[2]=array[3];
					//array[3]=array[4];
					//array[4]=0;
					//break;
			case 2: array[2]=array[3];
					//array[3]=array[4];
					//array[4]=0;
					//break;
			case 3: array[3]=array[4];
					//array[4]=0;
					//break;
			case 4: array[4]=0;		
					//break;	
			}
		System.out.print("결과:[");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		}
		

	
}

