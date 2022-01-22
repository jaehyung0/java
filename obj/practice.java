package com.test.java.obj;

public class practice {

	public static void main(String[] args) {
		
		String title = "김재형";
		
		for(int i=0;i<title.length();i++) {
			char c = title.charAt(i);
			if((c>'a'&&c<'z')||(c>'0'&&c<'9')||(c>'가'&&c<'힣'))
				title+=c;
			System.out.println(title);
		}
		
		System.out.println(title);
	}
}
