package com.test.java;

public class Ex07_output {

	public static void main(String[] args) {
		
		/*콘솔 입출럭, console input output, console IO
		 *-기본 입력장치:키보드
		 *-기본 출력장치:모니터
		 *키보드로 데이터를 입력하는 방법
		 *모니터로 데이터를 출력하는 방법
		 * 콘솔출럭
		 * 1. System.out.print(); 메소드
		 * 	-출력하고 끝
		 * 2. System.out.println(); 메소드
		 * 	-출력하고 엔터치고 끝
		 * 	-print line(줄단위 출력)
		 * 3. System.out.printf(); 메소드
		 * 	-기능이 많음
		 * 	-print format
		 * 	-형식을 제공해준다. 출력을 용이하게 도와주는 형식 문자열을 제공한다.
		 *  
		 */
		System.out.print(100);
		System.out.print(200);
		System.out.print(300);
		
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		//성적표
		String name1 ="홍길동";
		int kor1 =100;
		int eng1 =90;
		int math1 =80;
				
		String name2 ="아무개";
		int kor2 =99;
		int eng2 =90;
		int math2 =88;
		
		System.out.println("===========================");
		System.out.println("        성적표");
		System.out.println("===========================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("===========================");
		
		System.out.print(name1 + "\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\n");
		
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//printf()
		//요구사항) "안녕하세요. 홍길동님." > 출력
		String name ="홍길동";
		System.out.println("안녕하세요. name님.");  //이렇게 하면 안됨
		//요구사항) "안녕하세요. 홍길동님. 반갑습니다. 홍길동님." >출력
		System.out.println("안녕하세요." + name + "님. 반갑습니다."+ name + "님.");
		//요구사항) "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님."
		System.out.println("안녕하세요." + name + "님. 반갑습니다."+ name + "님. 잘가세요." +name+"님.");
		
		//Oracle >SQL 언어구문
		//insert into tblMember (seq, name, age, address, tel) values (1,'홍길동', 20, '서울시 강남구 역삼동', '010-5555-9999');
		String seq ="1";
		String age ="20";
		String address="서울시 강남구 역삼동";
		String tel = "010-5555-9999";
		
		//System.out.println("insert into tblMember (seq, name, age, address, tel) values ("+seq+",'"+name+"', "+age+", '"+address+"', '"+tel+"');");
		
		
		//printf()
		// -%s: 형식 문자, Placeholder
		//요구사항) "안녕하세요. 홍길동님." > 출력
		
		System.out.printf("안녕하세요. %s님.\n",name);
		System.out.printf("안녕하세요. %s님.\n","아무개");
		
		//요구사항) "안녕하세요. 홍길동님. 반갑습니다. 홍길동님." >출력
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님.\n",name,name);
		
		//요구사항) "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님."
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님. 잘가세요. %s님.\n",name,name,name);
		
		//insert into tblMember (seq, name, age, address, tel) values (1,'홍길동', 20, '서울시 강남구 역삼동', '010-5555-9999');
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s,'%s', %s, '%s', '%s');\n",seq, name, age, address, tel);
		
		//printf()의 형식문자
		//1. %s -> String, 문자열 자리 맡아주는 역할
		//2. %d -> Decimal, 정수(byte, short ,int, l
		//3. %f -> Float, 실수(float, double)
		//4. %c -> Char, 문자
		//5. %b -> Boolean
		
		System.out.printf("문자열: %s\n", "수수");
		System.out.printf("정수: %d\n", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("논리: %b\n", true);
		System.out.println();
		System.out.println();
		System.out.println();
		//형식 문자의 추가 기능
		//1. %d  -> %숫자d > 출력할 너비 지정
		//(+): 우측정렬
		//(-): 좌측정력
		//-서식 작업(탭하고 같이 사용해서 서식을 꾸민다.)
		//-수치로써 사용되는 숫자: 우측정렬
		//-수치가 아닌 숫자: 좌측 정렬, 우측 정렬
		//-문자열: 좌측정렬
		
		
		int num =100;
		System.out.printf("숫자: %d입니다.\n",num);
		System.out.printf("[%d]\n",num);
		System.out.printf("[%6d]\n",num); //5칸에 뒤부터 num설정
		System.out.printf("[%-6d]\n",num);//5칸에 앞부터 num설정
		
		//2. %숫자f
		//- %f 형식 문자에서 사용가능
		//- 소숫점 이하 자릿수 지정
		double d1 =3.14;
		System.out.printf("%f\n",d1);
		System.err.printf("%.2f\n",d1);
		d1=3.12345567888;
		System.out.printf("%f\n",d1);
		System.out.printf("%.8f\n",d1); //반놀림		
		System.out.printf("%.0f\n",d1); //정수 출력
		
		d1=3.14;
		System.out.printf("[%10f]\n",d1);
		
		//3. %,d
		//- %d, %f 적용가능
		//- 숫자형에만 적용가능
		//- 천단위표기(3자리마다 , 찍기)
		int price =1000000;
		System.out.printf("금액: %d원\n",price);
		System.out.printf("금액: %,d원\n",price);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=======================");
		System.out.println("        음료가격");
		System.out.println("=======================");
		System.out.printf("1.콜라: \t\t%,6d원\n",2500);
		System.out.printf("2.스무디: \t%,6d원\n",3500);
		System.out.printf("3.박카스: \t%,6d원\n",500);
		System.out.printf("4.아메리카노: \t%,6d원\n",12000);
		
		//%,10.2f - 천단위콤마, 너비 10자리, 소수이하 2자리
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=======================");
		System.out.println("        음료가격");
		System.out.println("=======================");
		System.out.printf("1.콜라: \t\t%,6d\n",2500);
		System.out.printf("2.스무디: \t%,6d\n",3500);
		System.out.printf("3.박카스: \t%,6d\n",500);
		System.out.printf("4.아메리카노: \t%,6d\n",12000);
	
		

		
	}
}
