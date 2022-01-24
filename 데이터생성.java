package com.test.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class 데이터생성 {
	
	private static Scanner scan = new Scanner(System.in);
	private static String auth;
	private static String lv;
	
	public static void main(String[] args) throws Exception {
		
//		String[] name = {"홍길동","아무개","하하하"};
//		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("member.sql"));
//		
//		for (int i=0;i<3;i++) {
//			String sql = String.format("insert into tblMember(seq,name) values (memberSeq.nextVal,'%s');",name[i]);
//			System.out.println(sql);
//			writer.write(sql+"\r\n");
//		}
//		
//		writer.close();
		
		m1();
		m2();
	}

	private static void m2() {
		System.out.print("아이디:");
		String id = scan.nextLine();
		
		System.out.print("암호:");
		String pw = scan.nextLine();
		
		
		
	}

	private static void m1() throws Exception {
		// 회원가입
		
		
		System.out.print("아이디:");
		String id = scan.nextLine();
		
		System.out.print("암호:");
		String pw = scan.nextLine();
		
		System.out.print("이름:");
		String name=scan.nextLine();
		
//	    Connection conn = DBUtil.open(); //자바와 오라클 연결
//	    PreparedStatement stat = conn.prepareStatement("insert into tblTeacher (seq,id,pw,name,lv) values (seqTeacher.nextVal,?,?,?,default)");
//	    
//	    stat.setString(1, id);
//	    stat.setString(2, pw);
//	    stat.setString(3, name);
//	    
//	    int result = stat.executeUpdate();
//	    		
//	    if(result==1) {
//	    	System.out.print("회원가입 성공");
//	    }else {
//	    	System.out.println("회원가입 실패");
//	    }
		
	}
}
