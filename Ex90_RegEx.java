package com.test.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Ex90_RegEx {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		m4();
	}

	private static void m4() {
		//프로젝트 > 유효성 검사
		Scanner scan = new Scanner(System.in);
		
		//사용자에게 한글 이름 + 2~5자 이내 입력!!
		System.out.print("이름:");
		String name = scan.nextLine();
		
		//유효성 검사
		//1. 문자열 길이 > name.length()
		//2. 문자 코드 > for + name.charAt(i)
		
		String regex = "[가-힣]{2,5}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		
		if(m.find()) {
			System.out.println("올바른 이름 입력");
		}else {
			System.out.println("올바르지 않은 이름 입력");
		}
		
		
	}

	private static void m3() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\class\\java\\JavaTest\\data\\naver.txt"));
			String wholeText = "";
			String line ="";
			
			while((line = reader.readLine())!=null) {
				wholeText += line + "\r\n";
			}
			reader.close();
			
			Pattern p = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");
			Matcher m = p.matcher(wholeText);
			int n=1;
			
			while(m.find()) {
				System.out.printf("%03d > %s\r\n",n,m.group());
				n++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		//Pattern 클래스
		String txt ="안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. 언제든지 연락주세요. 그리고 집 전화는 02-5145-5152입니다. 연락주세요~";
		
		//글 내용에 전화번호가 존재하는지 판단?
		
		//정규식 객체 생성
		Pattern p = Pattern.compile("\\d{2,3}-\\d{3,4}-\\d{4}");
		
		Matcher m = p.matcher(txt);
		
		//System.out.println(m.find());
		
//		if(m.find()) {
//			System.out.println("전화번호 있음");
//			System.out.println(m.group());
//		}else {
//			System.out.println("전화번호 없음");
//		}
		
		//모든 전화번호
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	}

	private static void m1() {

		//게시판 글쓰기 내용
		String txt ="안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. 언제든지 연락주세요. 그리고 집 전화는 02-5145-5152입니다. 연락주세요~";
		
		//게시판 정책 > 연락처 작성 금지 > 프로글매 > 마스킹 처리
		//txt=txt.replace("010-1234-5678","****");
		
		txt=txt.replaceAll("\\d{2,3}-\\d{3,4}-\\d{4}", "###");
		System.out.println(txt);
	}
}
