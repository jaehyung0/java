package com.test.question.file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FileTest {
		
	public static void main(String[] args) {
		
		//q03();
		//q04();
		//q05();
		//q07();
		//q08();
		//q09();
		q10();
				
	}

	private static void q10() {
		
		File dir = new File(MyPath.Q010);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				
				//아무게_2014__17.txt
				//아무게
				//2014
				
				String[] temp = getToken(file.getName());
				
				//D:\class\java\file\직원\아무게\2014
				
				File subdir = new File(MyPath.Q010 + "\\" + temp[0] + "\\" + temp[1]);
				//System.out.println(subdir.getAbsolutePath());
				subdir.mkdirs(); //직원명 + 년도 > 폴더 생성
				
				//현재 문서(파일)을 방금 만든 폴더로 이동하기
				file.renameTo(new File(subdir.getAbsolutePath() + "\\" + file.getName()));		
				
				System.out.println("완료");
				
			}
		}
		
		
	}

	private static String[] getToken(String name) {
		
		//아무게_2014__17.txt
//		String[] temp = new String[2];
		
//		int index = name.indexOf("_");
//		temp[0] = name.substring(0, index); //직원명
//		
//		int index2 = name.indexOf("_", index + 1);
//		temp[1] = name.substring(index + 1, index2); //년도
		
		String[] temp2 = name.split("_");
		
		return temp2;		
	}

	private static void q09() {
		
		File dir = new File(MyPath.Q009);
		ArrayList<File> list = new ArrayList<File>();
		
		if (dir.exists()) {
			addFiles(dir, list);
		}
		
		//System.out.println(list);
		
		for (int i=0; i<list.size()-1; i++) {
			for (int j=0; j<list.size()-1-i; j++) {
				
				if (list.get(j).length() < list.get(j+1).length()) {
					File temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
				
			}
		}
		
		for (File file : list) {
			System.out.printf("%s - %d\r\n", file.getName(), file.length());
		}
		
		System.out.println("완료");
		
	}

	private static void addFiles(File dir, ArrayList<File> list) {
		
		File[] sublist = dir.listFiles();
		
		for (File file : sublist) {
			if (file.isFile()) {
				list.add(file);//모든 파일을 1개의 ArrayList에 누적하기!!!
			}
		}
		
		for (File sub : sublist) {
			if (sub.isDirectory()) {
				addFiles(sub, list);
			}
		}
		
	}

	private static void q08() {
		
		File dir = new File(MyPath.Q008);
		
		if (dir.exists()) {
			delete(dir);
		}
		
		System.out.println("완료");
		
	}

	private static void delete(File dir) {
		
		//재귀 메소드
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				file.delete();
				//System.out.println(file.getAbsolutePath());
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				delete(sub);
			}
		}
		
		//현재 폴더(매개변수 dir)에는 아무런 파일과 폴더가 남아있지 않다. > 빈폴더
		dir.delete();		
		
	}

	private static void q07() {
		
		File dirA = new File(MyPath.Q007 + "\\MusicA");
		File dirB = new File(MyPath.Q007 + "\\MusicB");
		
		
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		int count = 0;
		
		for (File fa : listA) {
			
			boolean flag = false;
			
			for (File fb : listB) {

				//fa(1개) vs fb(모든)
				if (fa.getName().equals(fb.getName())) {
					//System.out.println(fa.getName());
					//count++;
					flag = true;
					break;
				}
				
			}
			
			if (!flag) {
				System.out.println(fa.getName());
			}
			
		}
		
		System.out.println(count);
		
	}

	private static void q05() {
		
		File dir = new File(MyPath.Q005);
		File[] list = dir.listFiles();
		
		//핵심
		//int gitCount = 0;
		//int jpgCount = 0;
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for (File file : list) {
			
			if (file.isFile()) {
				
				String ext = getExtension(file.getName());
				//System.out.println(ext);
				
				
				if (!count.containsKey(ext)) {
					//count.put(".jpg", 1);
					//count = 1;
					count.put(ext, 1);
				} else {
					//count.put(".jpg", count.get(".jpg")+1);
					//count = count + 1;
					count.put(ext, count.get(ext) + 1);
				}
				
			}
			
		}//for
		
		//System.out.println(count);
		
		Set<String> set = count.keySet();
		
		for (String key : set) {
			System.out.printf("%s : %d개\r\n", key, count.get(key));
		}
		
	}

	private static String getExtension(String name) {
		
		//마우스01.jpg, 마우스01.JPG
		int index = name.lastIndexOf(".");
		return name.substring(index).toLowerCase();
		
	}

	private static void q04() {
		
		File dir = new File(MyPath.Q004);
		
		File[] list = dir.listFiles(); //***
		
		int n = 1;
		
		for (File file : list) {
			
			//가져온 file이 파일인지? 폴더인지? 확신X
			if (file.isFile() 
					&& file.getName().toLowerCase().endsWith(".mp3")) {
				
				//System.out.println(file.getName());
				
				//가을 안부 - 먼데이 키즈 (Monday Kiz).mp3
				String filename = file.getName();
				
				//[001]가을 안부 - 먼데이 키즈 (Monday Kiz).mp3
				filename = String.format("[%03d]%s", n, filename); //***
				
				//log
				//System.out.println(filename);
				System.out.println(MyPath.Q004 + "\\" + filename);
				
				//파일명 바꾸기 ***
				file.renameTo(new File(MyPath.Q004 + "\\" + filename));
				
				n++;
				
			}
			
		}
		
	}

	private static void q03() {
		
		//파일 이동하기
		String path = "D:\\class\\java\\file\\AAA\\test.txt";
		String path2 = "D:\\class\\java\\file\\BBB\\test.txt";
		
		File file = new File(path);
		File file2 = new File(path2);
		
		if (file.exists()) {
			
			//동일한 파일 존재하는지? > exist()
			//파일 이동하기 > renameTo()
			
			//System.out.println(file2.exists());
			
			System.out.println("파일 이동을 실행합니다.");
			
			if (file2.exists()) {
				//이미 동일한 이름의 파일이 존재
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				Scanner scan = new Scanner(System.in);
				
				String answer = scan.nextLine();
				
				if (answer.equals("y")) {
					
					//덮어쓰기: 기존 파일 삭제 + 이동하기
					file2.delete();
					file.renameTo(file2);
					
				}				
				
			} else {
				//없음..
				file.renameTo(file2);
			}
			
		}
		
		
	}

}






