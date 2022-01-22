package com.test.java.obj;

public class Ex64_Wrapper {

	public static void main(String[] args) {
		
//		//Wrapper class, Utility class
//		//int->Integer
//		//double->Double
//		//boolean->Boolean
//		//갑형 7개 -> Wrapper Class 제공
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE);
//		
//		System.out.println(Integer.parseInt("100")+100);
//		System.out.println(Double.parseDouble("3.14")*2);
//		
//		//두 숫자의 우위비교
//		//1(크다) -1(작다) 0(같다)
//		System.out.println(Integer.compare(10, 5));
//		System.out.println(Integer.compare(5, 10));
//		System.out.println(Integer.compare(5, 5));
//		System.out.println();
//		
//		//양수(크다) 음수(작다) 0(같다)
//		System.out.println(compareInt(10,5));
//		System.out.println(compareInt(50,5));
//		System.out.println(compareInt(10,5));
//		
//		System.out.println();
//		System.out.println(Integer.max(10, 5)); //더 큰수
//		System.out.println(Integer.min(10, 5)); //더 작은수
//		System.out.println();
//		
//		System.out.println(Integer.compare(-10, 5));
//		System.out.println(Integer.compareUnsigned(-10, 5)); //절대값 비교
//		System.out.println(Math.abs(-10)>Math.abs(5)); //절대값 비교
//		System.out.println();
//		
//		
//		System.out.println(Integer.toString(100)); //"100"
//		System.out.println(String.valueOf(100)); //"100"
//		System.out.println(100+""); //"100"
//		System.out.println();
//		
//		System.out.println(Integer.toBinaryString(10)); //2진수
//		System.out.println(Integer.toOctalString(10)); //8진수
//		System.out.println(Integer.toHexString(10));  //16진수
//		
//		//문자, 문자열 비교
//		char c1 = 'A';
//		char c2 = 'B';
//		
//		System.out.println(c1>c2);
//		System.out.println();
//		
//		
		String s1 ="A";
		String s2="B";
//		
//		//System.out.println(s1>s2); //주소값 우위비교는 불가능
//		
//		//정렬 > 우위 비교
//		
		System.out.println(compareString("홍길동","아무개"));
		System.out.println(compareString("홍길동","홍길순"));
		System.out.println(compareString("홍길동","홍길동"));
		System.out.println(compareString("홍길동","홍길동입니다"));
		
		s1="홍길동";
		s2="아무개";
		System.out.println(s1.compareTo(s2)); //양수4361 >> s1이 크다
		System.out.println(s2.compareTo(s1)); //음수-4361 >> s1이 작다
		
		System.out.println();
		
		s1="Java";
		s2="java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1)); 
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
		
		
	}
	
	public static int compareInt(int a,int b) {
//		if(a>b) {
//			return 1;
//		}else if(a<b) {
//			return -1;
//		}else
//			return 0;
		return a-b;
	}
	
	public static int compareString(String s1, String s2) {
		
		//s1="홍길동";
		//s2="아무개";
		
		//int length = s1.length()>s2.length() ? s2.length():s1.length();
		int length = Integer.min(s2.length(),s1.length());
		
		for(int i=0;i<length;i++) {
			System.out.printf("%c-%c\r\n",s1.charAt(i),s2.charAt(i));
			
			if(s1.charAt(i)>s2.charAt(i)) {
				return 1;
			}else if(s1.charAt(i)<s2.charAt(i)) {
				return -1;
			}
		}
		
		//작은 문자열의 길이까지는 동일한 문자열
		return 0;
	}
}
