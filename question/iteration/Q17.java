package com.test.question.iteration;

//김재형
public class Q17 {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			int c=0;
			for(int k=1;k<=i;k++) {
				if(i%k==0) c+=1;
			}
			if(c==2)
			System.out.print(i+",");
		}
	}
}