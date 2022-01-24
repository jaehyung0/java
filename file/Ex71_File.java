package com.test.java.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Ex71_File {
	
	private static int count = 0;
	private static int dcount = 0;
	
	public static void main(String[] args) {
		
		//Ex71_File.java
		
		//파일, 디렉토리 조작
		//파일 입출력
		
		//파일, 디렉토리 조작
		// -> 윈도우 탐색기로 하는 행동들.. > 자바로..
		// -> ?? > 파일, 디렉토리 정보 확인
		//       > 파일, 디렉토리 조작
		
		//파일 입출력
		// -> 파일 대상 > 데이터 입출력
		// -> 메모장
		
		//m1();
		//m2();
		
		//m3(); //파일명 바꾸기 > renameTo()
		//m4(); //파일 이동하기 > renameTo()
		//m5();	//파일 삭제하기 > delete()
		
		//m6(); //폴더 생성하기 > mkdir(), mkdirs()
		//m7();
		//m8(); //폴더명 바꾸기(=m3())
		//m9(); //폴더 이동하기(=m4())
		//m10(); //폴더 삭제하기
		
		//------------------ 기본
		
		//------------------ 본론
		//m11();
		//m12();
		//m13();
		//m14(); //우선 순위 1 복습(***)
		
		//m15();
		//m16();
		
		
		//정렬 예제
		//m17();
		//m18();
		//m19();
		
		//m20();
		//m21();
		
		m22();
		
	}

	private static void m22() {
		
		//"AAA > data.txt", "BBB" 폴더
		
		String path = "D:\\class\\java\\file\\AAA\\data.txt";
		String path2 = "D:\\class\\java\\file\\BBB\\data.txt";
		
		File file = new File(path);
		File file2 = new File(path2);
		
		if (file.exists()) {
			
			//덮어쓰기 -> 기존 파일 삭제(file2.delete()) + 새 파일 이동
			
			System.out.println(file.renameTo(file2));
			System.out.println("완료");
		}
		
	}

	private static void m21() {
		
		//1. 직접 정렬
		//2. Arrays.sort() > 객체 정렬(Comparable 구현) 
		//3. Collections.sort() > 객체 정렬(Comparable 구현)
		
		
		
		//ArrayList, HashMap, Stack, Queue
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(5);
		nums.add(2);
		nums.add(3);
		nums.add(1);
		nums.add(4);
		
		System.out.println(nums);
		Collections.sort(nums); //sort(List<T> list)
		System.out.println(nums);
		
		
		List<String> names = new ArrayList<String>();
		
		names.add("사과");
		names.add("귤");
		names.add("포도");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User("홍길동", 5, 1990, 5, 10));
		users.add(new User("아무개", 2, 1980, 2, 5));
		users.add(new User("유재석", 3, 1995, 3, 12));
		users.add(new User("강호동", 4, 1993, 11, 22));
		users.add(new User("테스트", 1, 1987, 12, 30));
		
		Collections.sort(users);
		
		System.out.println(users);
		
	}

	private static void m20() {
		
		//자바의 정렬 > 퀵정렬
		//1. Array, 순수배열
		//2. Collection, 컬렉션
		
		int[] nums = { 1, 5, 3, 2, 4 };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		String[] names = { "홍길동", "아무개", "하하하", "김길동", "홍길순" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		User[] list = new User[5];		
		
		list[0] = new User("홍길동", 5, 1990, 5, 10);
		list[1] = new User("아무개", 2, 1980, 2, 5);
		list[2] = new User("유재석", 3, 1995, 3, 12);
		list[3] = new User("강호동", 4, 1993, 11, 22);
		list[4] = new User("테스트", 1, 1987, 12, 30);
		
		Arrays.sort(list);
		
		//사용자 정의 객체가 sort()의 대상이 되려면 Comparable 인터페이스를 상속받아야 한다.				
		
		System.out.println(Arrays.toString(list));
		
		
		
		
	}

	private static void m19() {
		
		//User 객체 배열
		User[] list = new User[5];
		
		list[0] = new User("홍길동", 5, 1990, 5, 10);
		list[1] = new User("아무개", 2, 1980, 2, 5);
		list[2] = new User("유재석", 3, 1995, 3, 12);
		list[3] = new User("강호동", 4, 1993, 11, 22);
		list[4] = new User("테스트", 1, 1987, 12, 30);
		
		System.out.println(Arrays.toString(list));
		System.out.println();
		
		//요구사항] User를 무엇을 기준으로 오름차순으로 정렬해주세요.
		// -> 버블 정렬
		
		//정렬 기준
		//1. 이름
		//2. 레벨
		//3. 생일
		
		for (int i=0; i<list.length-1; i++) {
			for (int j=0; j<list.length-1-i; j++) {
				
				//객체의 정렬은 비교 대상과 교환 대상이 다르다..
				//비교 : 특정값
				//if (list[j].getLevel() > list[j+1].getLevel()) {
				//if (list[j].getName().compareTo(list[j+1].getName()) > 0) {
				if (list[j].getBirthday().getTimeInMillis() > list[j+1].getBirthday().getTimeInMillis()) {

					//교환 : 객체 자체
					User temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(list));
		
	}

	private static void m18() {
		
		String[] names = { "홍길동", "아무개", "하하하", "김길동", "홍길순" };
		
		//문자, 문자열 > 문자코드 우위 비교 > 정렬 가능
		
		System.out.println(Arrays.toString(names));
		
		for (int i=0; i<names.length-1; i++) {
			for (int j=0; j<names.length-1-i; j++) {
				
				//compareTo() > 양수, 음수, 0
				if (names[j].compareTo(names[j+1]) > 0) {
					
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m17() {
		
		//정렬, Sort
		//- 숫자, 문자, 날짜 
		//- > 우위 비교를 할 수 있는 자료형을 대상으로 크기순으로 나열
		
		//정렬 알고리즘
		//- 많음..(쉬움 ~ 아주 어려움)
		//- 이미 오랫동안 많은 사람들이.. 개발 + 사용
		//1. JDK -> 정렬 기능 -> 안정성 + 검증 -> 실용성
		//2. 사용자 직접 구현 -> 자기계발 -> 삽입, 선택, 머지, 힙, 퀵, 셸, 버블
		
		
		//버블 정렬
		int[] nums = { 5, 1, 3, 4, 2 };
		//int[] nums = { 2, 4, 5, 3, 1 };
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for (int i=0; i<nums.length-1; i++) { //배열의 길이 - 1 > Step
			
			System.out.println("Step" + (i+1));
			
			for (int j=0; j<nums.length-i-1; j++) {
				
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				System.out.println(Arrays.toString(nums));
				
			}
			
			System.out.println();
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		
	}

	private static void m16() {
		
		//일련번호 출력
		//001 -> 002 -> 003 -> 004 -> 005
		
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 100, 101 };
		
		for (int num : nums) {
			
			//System.out.println(getNumber(num)); //"001"
			//System.out.printf();
			System.out.println(String.format("%03d", num));
			
		}
	}

	private static String getNumber(int num) {
		
		if (num < 10) {
			return "00" + num;
		} else if (num < 100) {
			return "0" + num;
		} else {
			return "" + num;
		}
		
	}

	private static void m15() {
		
		HashMap<String,Integer> score = new HashMap<String,Integer>();
		
		//key(과목명), value(점수)
		score.put("국어", 100);
		score.put("영어", 90);
		score.put("수학", 80);
		
		//HashMap > 순서가 없는 목록 > index 노출(X) > 루프(탐색) 필요!!!
		
		Set<String> set = score.keySet();
		
		for (String key : set) {
			System.out.println(key + ":" + score.get(key));
		}
		
	}

	private static void m14() {
		
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			countFile(dir);
			
		}
		System.out.println(count); //총 파일 개수
		System.out.println(dcount); //총 폴더 개수
	}

	private static void countFile(File dir) {
		
		//A. 목록 가져오기
		File[] list = dir.listFiles();
		
		//B. 파일 개수 세기
		for (File subfile : list) {
			if (subfile.isFile()) {
				count++;
				
				//1. 파일의 크기 누적 > subfile.length() > 폴더 크기
				//2. subfile.delete(); > eclipse 폴더 내의 모든 파일이 삭제;;;
				
			}
		}
		
		//C. 자식 폴더를 대상으로 동일한 행동 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				dcount++;
				countFile(subdir); //재귀 호출
			}
		}
		
		
		//빈폴더 > dir.delete()
		
	}

	private static void m13() {
		
		//업무
		//- 특정 폴더 선택
		//- 해당 폴더의 모든 파일 개수?
		
		//- 재귀 호출
		
		//파일 12,102, 폴더 2,786
		//     12,102      2,786
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		//누적 변수
		int count = 0;
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles(); //부모 폴더의 목록
			
			for (File subfile : list) {
				if (subfile.isFile()) { //파일이면
					count++; //개수 누적
				}
			}
			
			for (File subdir : list) {
				if (subdir.isDirectory()) { //폴더면
					
					File[] sublist = subdir.listFiles(); //자식 폴더의 목록
					
					for (File subsubfile : sublist) {
						if (subsubfile.isFile()) {
							count++;
						}
					}
					
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							//eclipse > 손자 폴더들.. subsubdir
							File[] subsubsublist = subsubdir.listFiles();
							
							for (File subsubsubfile : subsubsublist) {
								if (subsubsubfile.isFile()) {
									count++;
								}
							}
							
							for (File subsubsubdir : subsubsublist) {
								if (subsubsubdir.isDirectory()) {
									//또 반복.. 언제까지?
								}
							}
							
						}
					}
					
				}
			}
			
		}//if
		
		System.out.printf("총 파일 개수: %d개\r\n", count);
		
	}

	private static void m12() {
		
		//데이터 집합 탐색용(배열, 컬렉션)
		//- for문 > index(루프변수)
		//- 향상된 for문 > 조작이 쉽다. 조작이 단순하다.
		//              > 사용자 의도에 맞는 루프가 불가능하다. > 무조건 0번째방부터 마지막방까지 항상 탐색 > 특징
		
		//- 향상된 for문 >>>> 일반 for문
		
		
		String[] list = { "사과", "바나나", "포도", "파인애플", "딸기" };
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
		
		//for (변수 : 집합) {}
		//- 루프 횟수?? > 배열의 첫번째방 ~ 마지막방 > 스스로 루프
		//- 배열의 첨자??
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		
	}

	private static void m11() {
		
		//디렉토리의 내용 보기
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
//			String[] list = dir.list(); //사용 잘 안함
//			
//			for (int i=0; i<list.length; i++) {
//				System.out.println(list[i]);
//				File file = new File(path + "\\" + list[i]);
//				System.out.println(file.isFile() + "," + file.isDirectory());								
//			}
			
//			File[] list = dir.listFiles(); //주로 사용
//			
//			for (int i=0; i<list.length; i++) {
//				System.out.println(list[i].getName() + ":" 
//								+ list[i].isDirectory());
//			}
			
			
			File[] list = dir.listFiles();
			
			for (int i=0; i<list.length; i++) {
				if (list[i].isDirectory()) {
					System.out.printf("[%s]\r\n"
										, list[i].getName());
				}
			}
			
			for (int i=0; i<list.length; i++) {
				if (list[i].isFile()) {
					System.out.printf("%s\r\n"
										, list[i].getName());
				}
			}
		}
		
		
	}

	private static void m10() {
		
		//폴더 삭제는 내용물이 없을때만 가능하다 > 빈폴더만 삭제할 수 있다.
		String path = "D:\\class\\java\\file\\todo";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			boolean result = dir.delete();
			System.out.println(result);
		}
		
	}
	

	private static void m9() {
		String path = "D:\\class\\java\\file\\user";
		String path2 = "D:\\class\\java\\file\\move\\user";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			
			File dir2 = new File(path2);
			dir.renameTo(dir2);
			
			System.out.println("폴더 이동하기");
			
		}
	}

	private static void m8() {
		
		String path = "D:\\class\\java\\file\\member";
		String path2 = "D:\\class\\java\\file\\user";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			
			File dir2 = new File(path2);
			dir.renameTo(dir2);
			
			System.out.println("폴더명 바꾸기(=파일명 바꾸기)");
			
		}
		
	}

	private static void m7() {
		
		//요구사항] 회원 > 회원명으로 각각 폴더 생성
		String[] member = { "홍길동", "아무개", "하하하", "호호호", "후후후" };
		
		for (int i=0; i<member.length; i++) {
			
			String path = String.format("D:\\class\\java\\file\\member\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			
			dir.mkdirs();
			
			//log.
			System.out.println(member[i] + "님 개인폴더 생성 완료");
			
		}
		
		
		
		//요구사항] D:\class\java\file\todo
		//- 자식 폴더 생성하기
		//- "2021-01-01" ~ "2021-12-31" 폴더 생성(365개)
		//- Calendar 사용!!
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 0, 1);
		
		for (int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			File dir = new File("D:\\class\\java\\file\\todo\\" 
									+ String.format("%tF", c));
			dir.mkdir();
			
			System.out.printf("%tF\r\n", c);
			c.add(Calendar.DATE, 1); //+1일씩 누적
		}
		
		System.out.println(c.getActualMaximum(Calendar.MONTH));//11
		System.out.println(c.getActualMaximum(Calendar.DATE));//31
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));//365
		
		
		
	}

	private static void m6() {
		
		//폴더 조작
		//- 폴더 생성하기, 폴더명 수정하기, 폴더 이동하기, 폴더 삭제하기
		
		//생성하기
		String path = "D:\\class\\java\\file\\BBB\\CCC\\DDD"; //희망 경로
		File dir = new File(path);
		
		if (!dir.exists()) {
			
			//boolean result = dir.mkdir(); //make directory
			boolean result = dir.mkdirs(); 
			System.out.println(result);
			
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
	}

	private static void m5() {
		
		//파일 삭제하기
		File file = new File("D:\\class\\java\\file\\data.txt");
		
		if (file.exists()) {
			
			//참조 객체를 삭제한다. > 휴지통(X, 폴더)
			//> 복구 불가능(주의!!!!!!) > 2~3중 백업(****)
			System.out.println(file.delete()); //성공(true), 삭제(false)
			
		} else {
			System.out.println("파일 없음");
		}
		
	}

	private static void m4() {
		
		//파일 이동하기
		//D:\class\java\file\hello.txt
		//D:\class\java\file\move\hello.txt
		
		//파일명 수정하기, 파일 이동하기 -> renameTo() 메소드
		
		File file = new File("D:\\class\\java\\file\\hello.txt");
		
		if (file.exists()) {
			
		   File moveFile = new File("C:\\eclipse\\hello.txt");
			
		   file.renameTo(moveFile);
		   
		   System.err.println("완료");
			
		} else {
			System.out.println("파일 없음");
		}
		
	}

	private static void m3() {
		
		//파일 조작
		//- 생성(X), 복사(X), 이동, 파일명 수정, 삭제 
		
		//파일명 수정하기
		//"data.txt" -> "hello.txt"
		
		//현재 상태
		File file = new File("D:\\class\\java\\file\\data.txt");
		
		if (file.exists()) {
			
			//희망 상태
			File renameFile = new File("D:\\class\\java\\file\\hello.txt");
			
			//file의 상태를 renameFile의 상태로 변경한다.
			file.renameTo(renameFile);
			
			System.out.println("완료");
			
		} else {
			System.out.println("파일이 없습니다.");
		}
		
	}

	private static void m2() {
		
		//폴더 정보 보기
		//- 폴더(Folder), 디렉토리(Directory)
		
		//경로
		String path = "D:\\class\\java\\file";
		
		//디렉토리 참조 객체
		File dir = new File(path);
		
		//디렉토리는 파일의 한 종류이다. > 부피(크기)가 없는 파일이다.
		//디렉토리의 크기 == 디렉토리내의 모든 파일 크기의 합
		// > 통상적인 디렉토리의 크기는 개발자가 직접 계산
		
		if (dir.exists()) {
			
			System.out.println(dir.getName()); //폴더명
			System.out.println(dir.isFile()); 
			System.out.println(dir.isDirectory());
			System.out.println(dir.length()); //무조건 0(****)
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.getPath());
			//---------------------------------------------------
			System.out.println(dir.lastModified());
			System.out.println(dir.canRead()); 
			System.out.println(dir.canWrite()); 
			System.out.println(dir.isHidden()); 
			System.out.println(dir.getParent());
			
		} else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
		
		
		
	}

	private static void m1() {
		
		//파일 정보 보기
		//D:\class\java\file\data.txt
		
		//외부 파일 접근 > 외부 리소스 접근 > 참조 객체(대리인, 위임자) 생성 > 참조 객체 조작 > 외부 파일 조작 적용
		
		//경로
		String path = "D:\\class\\java\\file\\data.txt";
		
		//파일 참조 객체
		//- java.io > File
		//- java.io > BufferedReader
		
		//file 객체 조작 -> data.txt에 적용
		File file = new File(path);
		
		
		//file 객체가 참조하고 있는 위치에 실제로 파일이 존재한다.
		//System.out.println(file.exists());
		
		if (file.exists()) {
			System.out.println("파일 존재O");
			
			//파일 정보 가져오기
			System.out.println(file.getName()); //data.txt 파일명
			System.out.println(file.isFile()); //true > 너 파일이니?
			System.out.println(file.isDirectory()); //false > 너 폴더니?
			System.out.println(file.length()); //19 > 파일 크기(size) 바이트(B)
			System.out.println(file.getAbsolutePath()); //D:\class\java\file\data.txt
			System.out.println(file.getPath()); //D:\class\java\file\data.txt
			//-----------------------------------------------------------------
			
			//‎2021‎년 ‎10‎월 ‎18‎일 ‎월요일, ‏‎오후 12:31:59
			//2021-10-18 12:31:59
			System.out.println(file.lastModified()); //1634527919664 > tick
			
			
			//tick -> Calendar
			Calendar c2 = Calendar.getInstance();//달력 종류..
			//Calendar c3 = new Calendar();
			
			c2.setTimeInMillis(file.lastModified()); //tick -> Calendar
			//System.out.println(c2.getTimeInMillis());//Tick 반환
			
			System.out.printf("%tF %tT\r\n", c2, c2);
			
			//file attribute
			System.out.println(file.canRead()); //true
			System.out.println(file.canWrite()); //true
			System.out.println(file.isHidden()); //false
			System.out.println(file.getParent()); //D:\class\java\file
			
			
			
			
		} else {
			System.out.println("파일 존재X");
		}
		
		
		
		
	}

}



class User implements Comparable<User> {
	
	private String name;
	private int level;
	private Calendar birthday;
	
	public User(String name, int level, int year, int month, int date) {
		
		this.name = name;
		this.level = level;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, date);
		this.birthday = c;
				
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		sb.append("name:" + this.name + ",");
		sb.append("level:" + this.level + ",");
		sb.append("birthday:" + String.format("%tF", this.birthday));
		sb.append("]");
		
		return sb.toString();//StringBuilder -> String
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	
	//Arrays.sort() 메소드가 객체를 비교할 때 어떤 방식으로 비교할지를 compareTo() 메소드를 사용한다.
	@Override
	public int compareTo(User o) {
		
		//return this.getLevel() - o.getLevel();
		//return this.getName().compareTo(o.getName());
		
		//return (int)((this.getBirthday().getTimeInMillis() - o.getBirthday().getTimeInMillis())/1000);

		return this.getBirthday().compareTo(o.getBirthday());
	}
	
}














