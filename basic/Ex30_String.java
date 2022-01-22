package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30_String {

	public static void main(String[] args) throws IOException {
		
		//문자열, String
		//-문자의 집합
		//-참조형
		//-리터럴
		//-자바에서 문자열 조작하는 기능 제공
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		m14();
		
	}

	private static void m14() {
		
		//문자열 치환(바꾸기)
		//-문자열의 일부를 다른 문자열로 교체하는 메소드
		//-String replace(String old, String new)
		
		String txt = "안녕하세요. 홍길동입니다. 저를 홍길동이라고 부르세요.";
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판에 글을 작성합니다. 바보야!!!";
		String word = "바보";
		
		System.out.println(content.replace(word, "**"));
		
		//공백제거
		txt="      하나     둘      셋     ";
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
		System.out.printf("[%s]\n",txt.replace(" ", ""));
		
		
		
	}

	private static void m13() {

		//length(),indexOf(),substring()
		//문자열 추출
		//-char charAt(int index) > 1글자 추출
		//-String substring(int begin,int end) >범위 추출
		//-String substring(int begin) >begin부터 문자열 끝까지
		
		
		String txt="가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3,7)); //라마바사 > 3이상 7미만
		
		String jumin = "950210-2012123";
		System.out.println(jumin.charAt(7)=='1'?"남자":"여자");
		System.out.println(jumin.substring(7,8).equals("1") ?"남자":"여자");
		
		//몇년생?
		System.out.println(jumin.substring(0,2)+"년생");
		
		//태어난 월?
		System.out.println(jumin.substring(2,4)+"월생");
		
		//태어난 일
		System.out.println(jumin.substring(4,6)+"일생");
		
		
		//파일 전체 경로
		String path ="D:\\class\\java\\javaTest\\src\\Ex10.java";
		
		//1.lastindexOf
		//2.substring
		//3.length()
		
		//파일명 추출 "Ex10.java"
		
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index+1);
		System.out.println(fileName);
		
		//확장자 없는 파일명 추출 "Ex10"
		
		index = fileName.lastIndexOf(".");
		String fileNameWithoutExt=fileName.substring(0,index);
		System.out.println(fileNameWithoutExt);
		
		//확장자 추출 ".java"
		
		String ext =fileName.substring(index);
		System.out.println(ext);
		
		
		
		
		
	}

	private static void m12() {

		//boolean startsWith(String word)
		//boolean endsWith(String word)
		
		String txt="홍길동";
				
		//txt가 "홍"으로 시작하는 문자열입니까? >T,F
		System.out.println(txt.startsWith("홍"));//가독성1순위
		System.out.println(txt.charAt(0)=='홍');          //3개는 같은 거
		System.out.println(txt.indexOf("홍")==0);
		
		System.out.println(txt.startsWith("홍길동"));
		System.out.println(txt.startsWith("김"));
		
		txt="홍길동님 안녕하세요?";
		System.out.println(txt.endsWith("?"));
		System.out.println(txt.charAt(txt.length()-1)=='?');
		System.out.println(txt.indexOf('?')==txt.length()-1);
				
		//파일 경로 or 이름 > 조작
		//이미지 파일인지 검사
		String path="D:\\class\\java\\.jpg\\dog.jpg";
		
		if (path.endsWith(".jpg")||path.endsWith(".png")||path.endsWith(".jpeg")||path.endsWith(".gif")) {
			System.out.println("이미지 파일");
		}else {
			System.out.println("이미지 아님");
		}
		
		if(path.indexOf(".jpg") ==path.length()-4) {
			System.out.println("이미지파일");
		}else {
			System.out.println("x");
		}
		
		//indexOf : 왼쪽에서 오른쪽
		//lastIndexOf : 오른쪽에서 왼쪽
		System.out.println(path.lastIndexOf(".jpg"));
		if(path.lastIndexOf(".jpg") ==path.length()-4)
		{System.out.println("ㅇㅇ");
			
		}else {
			System.out.println("xx");
		}
		
	}

	private static void m11() {

		//대소문자 변경
		//String toUpperCase() >> 문자를 모두 대문자로
		//String toLowerCase() >> 문자를 모두 소문자로
		
		String txt = "Hello Java";
		System.out.println(txt);
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		String content = "메모장의 내용입니다. java입니다.";
		String word = "Java";
		
		//대소문자 구분
		//정확도 높음 , 검색률 낮음
		if(content.indexOf(word)>-1) {
			System.out.println("검색 O");
		}else {
			System.out.println("검색 x");
		}
		
		//대소문자 구분 x
		//정확도 낮음 , 검색률 높음
		if(content.toUpperCase().indexOf(word.toUpperCase()) >-1) {
			System.out.println("검색 O");
		}else {
			System.out.println("검색 x");
		}
		
	}

	private static void m10() {
		
		//유효성 검사
		//게사판 글쓰기 > 금지어!
		
		String word = "바보";
		String content = "안녕하세요. 자바를 배우는 학생입니다.";
		
		if(content.indexOf(word) == -1) {
			//올바른 경우
			System.out.println(content);
		}else {
			//금지어 발견
			System.out.println("비속어가 섞여있읍니다. 다시써주세요");
		}
		
		//주민등록번호 + '_'
		
		String jumin = "940817-1111111";
		
		if (jumin.charAt(6) == '-'){
			System.out.println("통과");
		}else {
			System.out.println("불통");
		}
		
		if (jumin.indexOf('-')==6) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
		
		
		
	}

	private static void m9() {

		//문자열 검색
		//-문자열내에서 원하는 문자열)을 검색 > 발견한 위치(index) 반환
		//-int indexOf(char c)
		//-int indexOf(String s)
		//검색 결과가 없으면 -1 반환
		//처음 일치하는 단어만 찾아줌 뒤에 더 있어도 안찾아줌
		
		//-startIndex부터 검색해서 처음 일치하는 결과를 반환
		//-int indexOf(char c, int startIndex)
		//-int indexOf(String s, int startIndex)
		
		String txt = "안녕하세요. 김재형입니다.";
		int index = -1;
		
		index = txt.indexOf('하'); //2
		System.out.println(index);
		
		index = txt.indexOf('김'); //7
		System.out.println(index);
		
		index = txt.indexOf('.'); //5
		System.out.println(index);
		
		index = txt.indexOf(' '); //6
		System.out.println(index);
		
		index = txt.indexOf('가'); //-1 못찾으면 설정한 값 돌려줌 
		System.out.println(index);
		
		index = txt.indexOf("홍길순"); //-1  다 맞아야됨
		System.out.println(index);
		
		index = txt.indexOf("김재형"); //7
		System.out.println(index);
		
		txt = "안녕하세요. 김재형입니다. 저를 재형이라고 불러주세요.";
		
		index = txt.indexOf("재형"); 
		System.out.println(index);

		index = txt.indexOf("재형",index+"재형".length());
		System.out.println(index);
		
		
	}

	private static void m8() {

		//공백 제거
		//-String trim()
		//-문자열에 존재하는 공백문자(White space >> 스페이스, 탭, 개행)를 제거하는 메소드
		//-문자열의 시작과 끝에 존재하는 공백 문자만 제거
		//-검색어를 대상으로 많이 사용
		//-불필요하거나 or 사용자 실수로 생긴 공백제거
		
		String txt = "     하나     둘     셋     ";
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]",txt.trim());
		
	}

	private static void m7() throws IOException {

		//유효성 검사
		//- 주민 등록 번호 입력 > 반드시 '-' 입력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민등록번호: ");
		String jumin = reader.readLine();

		if (isValidJumin(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");
			if(jumin.charAt(7)=='1') {
				System.out.println("남자");
			}else if(jumin.charAt(7)==2) {
				System.out.println("여자");
			}
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}

		
	}

	private static boolean isValidJumin(String jumin) {

		if(jumin.charAt(6)!='-') {
			return false;
		}
		return true;
	}

	private static void m6() throws IOException {
		
		//회원가입
		//- 이름 입력 + 길이(2~5) + 구성(한글만)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름입력: ");
		String name = reader.readLine();

		if (isValid(name)) {
			System.out.println("업무 진행");
		}else {
			System.out.println("이름을 올바르게 입력하세요.");
		}
		
	}

	private static boolean isValid(String name) {
		
		//***유효성 검사 > 잘못된 부분을 검사하는것이 코딩하기 편하다.
		//길이 검사
		//한글 검사
		if (name.length()<2 || name.length()>5) {
			
			return false;
		}
		
		for (int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			
			if(c<'가'||c>'힣') {
				return false;
			}
		}
		
		// 여기까지 도달 >> 올바른이름
		
		return true;
	}

	private static void m5() throws IOException {
		
		//유효성 검사
		//- 아이디입력 + 소문자
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아이디 입력: ");
		String id = reader.readLine();

		for (int i=0;i<id.length();i++) {
			char c = id.charAt(i); //i번짜 글자
			
			
			if (c<'a' || c>'z') {
				System.out.println("잘못된 문자가 발견되었습니다.");
				break;
			}
		}
		System.out.println("종료");
		
		
		
	}

	private static void m4() {

		//문자열 추출
		//-char charAt(int index)
		//-원하는 위치의 문자열을 추출하는 메소드
		//-자바는 0부터셈 :zero-based Index
		
		String txt="안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(3);
		System.out.println(c);
		
		//문자열의 마지막 문자의 index == length()-1
		c=txt.charAt(txt.length() -1);
		System.out.println(c);
		
		//c=txt.charAt(15);
		//System.out.println(c); 
		//java.lang.StringIndexOutOfBoundsException: index 15, length 14
		//0~13인데 넘어갔다.
		
	}

	private static void m3() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.print("이름 입력: ");
			String name = reader.readLine();

			if (name.length()>=2 && name.length()<=5) {
				System.out.println("올바른 이름입니다.");
				System.out.println("업무진행");
				break;
			}
			else {
				System.out.println("이름은 2~자 내로 입력하세요.");
			}

		}
		
	}

	private static void m2() throws IOException {
		
		//문자열 길이 + 유효성 검사
		//회원 가입 > 아이디 입력 > 서버 전송 > DB 저장 > 에러
		
		//이름입력 > 2~5자이내
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력: ");
		String name = reader.readLine();

		if (name.length()>=2 && name.length()<=5) {
			System.out.println("올바른 이름입니다.");
			System.out.println("업무진행");
		}
		else {
			System.out.println("이름은 2~5자 내로 입력하세요.");
		}
		
	}

	private static void m1() throws IOException {
		
		//문자열길이
		//-문자열을 구성하는 문자의 갯수
		//-int length()
		
		String txt = "ABCDE";
		
		System.out.println(txt.length());
		
		//요구 사항) 사용자입력>문자수?
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("문자입력:");
		//String statement = reader.readLine();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력: ");
		String statement = reader.readLine();
					
		System.out.printf("입력한 문장은 총 %d개의 문자로 구성되어 있습니다.\n",statement.length());
		
	}
}
