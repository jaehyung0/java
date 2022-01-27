package com.test.question.collection;



public class Q02 {

	public static void main(String[] args) {
		
		//배열 생성
		MyHashMap map = new MyHashMap();

		
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");
		map.put("과학", "축축");
		//map.put("gg", "ww");
		//읽기
		System.out.println("읽기");
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		System.out.println(map.get("과학"));
		System.out.println();
		//개수
		System.out.println("개수");
		System.out.println(map.size());
		System.out.println();
//		//수정
		System.out.println("수정");
		map.put("영어", "gkgk");
		System.out.println(map.get("영어"));
		System.out.println(map.size());
		System.out.println(map.toString());
		System.out.println();
		
//		//삭제
		System.out.println("삭제");
		map.remove("영어");
		System.out.println(map.toString());
		System.out.println(map.get("영어"));
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		System.out.println(map.size());
		System.out.println();
		
		//검색(key)
		System.out.println("검색");
		if (map.containKey("국어")) {
		    System.out.println("국어 점수 있음");
		} else {
		    System.out.println("국어 점수 없음");
		}
		System.out.println();
//		//검색(value)
		if (map.containsValue("합격")) {
		    System.out.println("합격 과목 있음");
		} else {
		    System.out.println("합격 과목 없음");
		}
		System.out.println(map.toString());
//		//초기화
		map.clear();
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.toString());
	}
}
