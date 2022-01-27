package com.test.question.file;

import java.io.File;
import java.util.Scanner;



public class Q03 {

	public static void main(String[] args) {
		
		System.out.println("파일 이동을 실행합니다.");
		
		
	
		
		String path = "E:\\class\\JavaTest\\file\\aaa\\data.txt";
		String path2 = "E:\\class\\JavaTest\\file\\BBB\\data.txt";
		
		File file = new File(path);
		File file2 = new File(path2);
		if(file.getName().equals(file2.getName())) {
			System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			
			if(input.equals("y")) {
				file.renameTo(file2);
				System.out.println("y.파일을 덮어썼습니다.");
			}else if(input.equals("n")){
				System.out.println("n.작업을 취소합니다.");
			}
			
			
		}else {
			System.out.println("파일을 이동합니다.");
		}
		
		
		
	}
}
