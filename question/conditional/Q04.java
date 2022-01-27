package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//workif();
		workswitch();
	}

	private static void workswitch() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무년수:");
		int workYear = Integer.parseInt(reader.readLine());
		
		switch(workYear) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.printf("%d년차 초급 개발자입니다.\n",workYear);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.",10-workYear);
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.printf("%d년차 중급 개발자입니다.\n",workYear);
			System.out.printf("당신은 %d년전까지 초급개발자였습니다.\n",workYear-4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.",10-workYear);
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		
			System.out.printf("%d년차 고급 개발자입니다.\n",workYear);
			System.out.println("퇴직합니다~~");
			break;
		}
		
	}

	private static void workif() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무년수:");
		int workYear = Integer.parseInt(reader.readLine());
		
		
		
		if(workYear>=0 && workYear<=4) {
			System.out.printf("%d년차 초급 개발자입니다.\n",workYear);
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n",5-workYear);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n",10-workYear);
		}else if(workYear>=5 && workYear<=9) {
			System.out.printf("%d년차 중급 개발자입니다.\n",workYear);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n",workYear-4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n",10-workYear);
		}else if(workYear>=10) {
			System.out.printf("%d년차 고급 개발자 입니다.",workYear);
		}
		
	}
}
