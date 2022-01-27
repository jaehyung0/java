package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		String filename = "";
		int gif =0;
		int jpg =0;
		int png =0;
		int hwp =0;
		int doc =0;
		
		for(int i =0;i<2;i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("파일명: ");
			filename = reader.readLine();
			
			int index = filename.lastIndexOf(".");
			String ext = filename.substring(index+1);
			
			if(ext.equals("gif"))
				gif++;
			else if(ext.equals("jpg"))
				jpg++;
			else if (ext.equals("png"))
				png++;
			else if (ext.equals("hwp"))
				hwp++;
			else if (ext.equals("doc"))
				doc++;
		}
		
		
		
		System.out.printf("gif: %d개",gif);
		System.out.printf("jpg: %d개",jpg);
		System.out.printf("png: %d개",png);
		System.out.printf("hwp: %d개",hwp);
		System.out.printf("doc: %d개",doc);
		
	}

	
}
