package com.test.java.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeMap;

public class Ex80_Map {

	public static void main(String[] args) {
		
		//Map 인터페이스
		//-TreeMap, HashTable, Properties
		
		//TreeMap
		//-이진트리를 가진 Map
		//-자동 정렬 _  범위 검색 용이 ->Tree
		//-key + value -> Map
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		//HashMap<String,String> map = new HashMap<String,String>();
		
		
		
		map.put("white", "하양");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("yellow", "노랑");
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("m", "w"));
		
		//Vector -> ArrayList
		//HashTable -> HashMap
		
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("국어", 100);
		ht.put("영어", 90);
		ht.put("수학", 80);
		
		System.out.println(ht.size());
		System.out.println(ht);
		System.out.println(ht.get("국어"));
		System.out.println(ht.get("미술"));
		System.out.println(ht.containsKey("수학"));
		System.out.println(ht.containsValue(100));
		
		
		//Properties > XML,JSON
		//-프로그램의 설정값 관리
		
//		Properties prop = new Properties();
//		
//		
//		prop.setProperty("font-family", "Consolas");
//		prop.setProperty("font-size", "14pt");
//		prop.setProperty("font-color", "Black");
//		
//		System.out.println(prop);
//		
//		try {
//			prop.store(new FileOutputStream("setting.ini"), "");
//			System.out.println("설정저장");
//		}catch (Exception e) {
//			System.out.println("Ex80_Map");
//			e.printStackTrace();
//		}
		
		
		//저장된 설정 읽어오기 > 파일 읽기
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("setting.ini"));
			
			System.out.println(prop);
			
			System.out.println(prop.getProperty("font-color"));
		}catch (Exception e) {
			System.out.println("Ex80_Map");
			e.printStackTrace();
		}
		
		
		
		
	}
}
