package com.test.java;

public class Ex13_Operator {
	
	public static void main(String[] args) {
		
		//3.논리 연산자
		//- &&(and),||(or),!(not)
		//- 피연산자를 대상으로 정해진 규칙에 따라 정해진 값을 반환하는 역할
		//- &&,|| :2항 연산자
		//- ! : 1항 연산자
		//- 피연산자의 자료형이 boolean이다. (다른 자료형은 불가능)
		//- 연산의 결과가 boolean이다.
		//- 피연산자는 주로 비교연산식을 가진다.
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		System.out.println(!b1); //false
		System.out.println(!b2); //true
		System.out.println();
		System.out.println();
		System.out.println();
		//요구사항) 나이를 입력 > 19세 이상~ 60세 미만 나이가 짝수
		int age =18;
		
		System.out.println(age>=19 && age<60 && age%2==0);
		System.out.println();
		
		//숫자 1개 > 2의 배수이면서 3의 배수
		int num =6;
		System.out.println(num%2==0 && num%3==0);
		System.out.println();
		System.out.println();
		//4. 대입 연산자, 할당 연산자
		//- =
		//- +=, -=, *=, /=, %= : 복합 대입 연산자
		//- LValue(변수) = RValue(상수,변수)
		//- Lvalue와 RValue는 반드시 자료형이 동일해야 한다.(형변환)
		//- 연산자 우선순위가 모든 연산자 중 가장 낮다.
		
		//연산자 우선순위
		//- 하나의 문장에 속하는 모든 연산자들이 가지는 실행순서
		//- 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		//연산자 연산방향
		//- 하나의 문장에 속하는 동일한 종류의 연산자들이 가지는 실행 순서
		//- 대입 연산자, 증감 연산자: 오른쪽에서 왼쪽
		//- 나머지 연산자: 왼쪽에서 오른쪽
		//철저하게 분해 + 순서 명확하게 인식
		
		//int sum = 10+20+30;
		//int sum = 30+30;
		//int sum = 60;
		//sum; <<60
		
		int n=10;
		//n = n+1; // => n +=1;
		//System.out.println(n);
		//n+=1;
		
		n=n*2;
		System.out.println(n);
		n*=2;
		System.out.println(n);
		n=n/2;
		System.out.println(n);
		n/=2;
		System.out.println(n);
		n=n%3;
		System.out.println(n);
		n%=3;
		System.out.println(n);
		System.out.println(n);
		System.out.println();
		
		//산술연산자(+)
		// - 피연산자가 숫자형을 가진다.
		
		//문자열 연결 연산자(+)
		// - 피연산자를 문자열을 가진다. System.out.println("문자열" + "입니다");
		// - Concat
		// - 문자열 + 문자열 = 문자열
		// - 문자열 + 비문자열 = X -> 산술 연산자
		//System.out.println("문자열" + 100); >>100을 "100"로 취급 > 문자열100 출력
		//System.out.println(100+ "문자열"); >>100문자열 출력
		
		System.out.println(100+200+300); //600
		System.out.println(100+200+"300"); //300300
		System.out.println(100+"200"+300); //100200300
		System.out.println("100"+(200+300)); //100200300
		
		//>,>=,<,<=
		// - 피연산자는 모든 숫자형을 가진다.
		//==,!=
		// - 피연산자는 모든 자료형을 가진다
		//비교연산자(==,!=)
		System.out.println(true==true);
		String str1="홍길동"; //회원가입할때 작성한 비밀번호
		String str2="홍길동"; //로그인할때 작성한 비밀번호
		String str3="아무개";
		String str4="홍";
		str4=str4+"길동";
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		//자바는 ==,!=을 문자열을 대상으로 사용할 수 없다.
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str1==str4);
		//결론: 문자열의 동등 비교는 연산자 (==,!=)를 사용해서는 절대 안되고, 반드시 equals() 메소드를 사용해야 한다.
		System.out.println(str1.equals(str4)); //==
		System.out.println(!str1.equals(str4)); //!=
		
		//5.증감 연산자
		//- ++(증가),--(감소)
		//- 1항 연산자, 단항 연산자
		//- 피연산자는 숫자형을 가진다.
		//- 피연산자의 값을 +1,-1 누적 연산
		//- 연산자의 위치에 따라 연산 우선 순위가 달라진다.
		//  a.++n: 전위 배치(전치)
		//  b.n++: 후위 배치(후치)
		//- 증감연산자(전치) > 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자 > 증감연산자(후치)
		n=10;
		n=n+1;//11
		n+=1;//12
		++n;//13
		System.out.println(n);
		
		n=n-1;//12
		n-=1;//11
		--n;//10
		System.out.println(n);
			
		n=10;
		int sum = 0;
		sum=20+ ++n;
		System.out.println(sum);
		System.out.println(n);
		
		n=10;
		sum=0;
		sum=20+n++;
		System.out.println(sum);
		System.out.println(n);
		
		//결론: 증감 연산자는 전치를 쓰던 후치를 쓰던 마음대로 사용해도 된다.
		// > 단, 한 문장에 증감 연산자 이외의 연산자를 같이 사용하지 말것
		
		//sum = 20 + ++n;
		//++n;        <<
		//sum = 20+n; <<이렇게 쓰면 틀릴 일이 없다.
		
		int o =10;
		System.out.println(--o-o--);
		System.out.println(o);
		
		//6.조건 연산자
		//- A ? B : C
		//- ?,:
		//- A,B,C: 피연산자
		//- 3항 연산자
		//- A: boolean
		//- B,C: 상수, 변수, 연산식, 메소드
		//- 직관적이고 읽기 쉽고, 사용하기 쉬운 연산자
		//- 반드시 B와 C는 자료형이 동일해야 한다.
		
		boolean flag = false;
		String result = flag ? "참" : "거짓";
		System.out.println(result);
		
		
		age=25;
		result = age >= 19 && age<60 ? "성공" : "실패";
		System.out.printf("입력하신 나이 %d세는 회원가입 %s입니다.\n",age,result);
		
		n=10;
		String result2 = n%2==0 ? "짝수" : "홀수";
		System.out.println(result2);
		System.out.println(n%2==0 ? "짝수" : "홀수");
			
		
	}

}
