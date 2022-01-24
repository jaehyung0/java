package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Ex73_file {
	
	private static Scanner scan;
	private static int num;
	
	static {
		scan = new Scanner(System.in);
		
		//num=1;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(MyPath.DATA));
			
			String line =null;
			
			//스트림 읽기: 원하는 라인만 읽기가 불가능하다. 무조건 처음~끝
			while((line=reader.readLine())!=null) {
				String[] temp = line.split(",");
				num=Integer.parseInt(temp[0]);
			}
			
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		//회원 정보 관리 시스템
		//1. 기능 설계
		//	a.회원 정보 추가하기
		//	b.회원 정보 목록하기
		//	c.회원 정보 삭제하기
		//	d.회원 정보 검색하기
		//	e.회원 정보 수정하기(손이 많이 감)
		//2. 데이터 설계(***)
		//	- 어디 + 어떤 파일 > JavaTest > data > user.dat
		//	- 데이터 포맷(형식) *****
		//	- 회원(이름, 번호, 나이, 주소)
		
		//1.절대 경로
		//	- 드라이브명으로 시작
		
		//2.상대 경로
		//	- 현재 폴더((.\\)생략)로 시작
		//	- 현재폴더 == 프로젝트 폴더 (.\\)생략
		
		
//		File file = new File("data\\user.dat");
//		System.out.println(file.exists());
		
		
		System.out.println("================================");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("=          시작 화면           =");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("=                              =");
		System.out.println("================================");
		System.out.println("시작하려면 엔터를 누르세요");
		String start = scan.nextLine();
		boolean loop = true;
		
		while(loop) {
			
			menu();
			
					
			System.out.print("선택: ");
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				add();
			}else if(sel.equals("2")) {
				list();
			}else if(sel.equals("3")) {
				delete();
			}else if(sel.equals("4")) {
				search();
			}else if(sel.equals("5")) {
				edit();
			}else {
				loop=false;
			}
			
			
		}//while
		
		
		
		
		System.out.println("종료");
		
	}

	private static void edit() throws Exception {
		header("회원 수정하기");
		
		System.out.print("수정할 회원 번호:");
		String num = scan.nextLine();
		
		BufferedReader reader = new BufferedReader(new FileReader(MyPath.DATA));
		
		String line =null;
		
		while((line=reader.readLine())!=null) {
			if(num.equals(line.split(",")[0])) {
				break;
			}
		}
		System.out.println(line);
		String[] temp = line.split(",");
		
		System.out.println("기존이름: "+temp[1]);
		System.out.print("수정 이름(수정하지 않으려면 그냥 엔터): ");
		String name = scan.nextLine();
		if(name.equals("")) {
			name=temp[1];
		}
		
		System.out.println("기존 나이:"+temp[2]);
		System.out.print("수정 나이(수정하지 않으려면 그냥 엔터): ");
		String age = scan.nextLine();
		if(age.equals("")) {
			age=temp[2];
		}
		
		System.out.println("기존 주소:"+temp[3]);
		System.out.print("수정 주소(수정하지 않으려면 그냥 엔터): ");
		String address = scan.nextLine();
		if(address.equals("")) {
			address=temp[3];
		}
		
		reader.close();
		
		reader = new BufferedReader(new FileReader(MyPath.DATA));
		
		String txt="";
		line = null;
		while((line=reader.readLine())!=null) {
			if(num.equals(line.split(",")[0])) {
				txt+=String.format("%s,%s,%s,%s\r\n",num,name,age,address);
			}else {
				txt+=line+"\r\n";
			}
		}
		
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(MyPath.DATA));
		writer.write(txt);
		writer.close();
		
		
		
		
		pause("회원을 수정했습니다.");
	}

	private static void search() throws IOException {
		header("회원 검색하기");
		
		System.out.print("검색어(주소 일부분): ");
		String word= scan.nextLine();
		
		BufferedReader reader = new BufferedReader(new FileReader(MyPath.DATA));
		
		String line = null;
		
		System.out.println("[번호]\t[이름]\t[나이]\t[주소]");
		
		while((line=reader.readLine())!=null) {
			
			String[] temp = line.split(",");
			if(temp[3].indexOf(word)> -1) {
				System.out.printf("%5s\t%s\t%5s\t%s\r\n",temp[0],temp[1],temp[2],temp[3]);
			}
			
		}
		reader.close();
		
		
		pause("회원을 검색했습니다.");
	}

	private static void delete() throws Exception {
		header("회원 삭제하기");
		
		
		System.out.print("삭제할 회원 번호:");
		String num = scan.nextLine();
		
		BufferedReader reader = new BufferedReader(new FileReader(MyPath.DATA));
		
		String txt = ""; //누적 변수
		String line = null;
		
		while((line=reader.readLine())!=null) {
			if(!num.equals(line.split(",")[0])) {
				txt +=line+"\r\n"; //앤터가 날라가서 넣어줘야됨
			}
			
		}
		
		reader.close();
		
		//System.out.println(txt);
		
		//덮어쓰기 모드
		BufferedWriter writer = new BufferedWriter(new FileWriter(MyPath.DATA));
		
		writer.write(txt); //삭제
		
		writer.close();
		
		
		pause("회원을 삭제했습니다.");
	}

	private static void list() throws Exception {
		header("회원 목록 보기");
		
		
		BufferedReader reader = new BufferedReader(new FileReader(MyPath.DATA));
		
		String line = null;
		
		System.out.println("[번호]\t[이름]\t[나이]\t[주소]");
		
		while((line=reader.readLine())!=null) {
			//1회전 == 유저1명
			//0,아무개,22,서울시 강동구 길동
			//System.out.println(line);
			
			//출력 정렬
			//1.숫자
			//	- 가운데, 우측(**)
			//2.문자열
			//	- 가운데: 고정폭
			//	- 좌측: 가변폭
			String[] temp = line.split(",");
			System.out.printf("%5s\t%s\t%5s\t%s\r\n",temp[0],temp[1],temp[2],temp[3]);
		}
		reader.close();
		pause("회원 목록을 출력했습니다..");
	}

	private static void add() {
		header("회원 추가하기");
		
		
		
		System.out.print("이름:");
		String name = scan.nextLine();
		
		System.out.print("나이:");
		String age=scan.nextLine();
		
		System.out.print("주소:");
		String address = scan.nextLine();
		
		File file = new File(MyPath.DATA);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(MyPath.DATA,true));
			
			num++;
			//번호,이름,나이,주소
			writer.write(String.format("%s,%s,%s,%s\r\n", num,name,age,address));
			
			
			
			writer.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//잠시 휴식
		pause("회원을 추가했습니다.");
		
	}
	
	public static void header(String title) {
		System.out.printf("[%s]\r\n",title);
	}

	public static void pause(String msg) {
		System.out.println(msg);
		System.out.println("계속하시려면 엔터키를 누르세요...");
		scan.nextLine();
	}

	private static void menu() {
		System.out.println("===========================");
		System.out.println("         회원관리");
		System.out.println("1.회원 추가하기");
		System.out.println("2.회원 목록보기");
		System.out.println("3.회원 삭제하기");
		System.out.println("4.회원 검색하기");
		System.out.println("5.회원 수정하기");
		System.out.println("6.프로그램 종료");
		System.out.println("===========================");
		
	}
}
