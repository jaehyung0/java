package com.test.java.obj.inheritance.interface2;

public class Ex59_interface {

	public static void main(String[] args) {
		
//		Gram lg = new Gram();
//		lg.start();
//		lg.stop();
//		
//		//10년 사용 > 고장
//		
//		MacBook mac = new MacBook();
//		mac.start();
//		mac.stop();
		
		//결론
		LapTop lg = new Gram();
		
		lg.start();
		lg.stop();
		
		LapTop mac = new MacBook();
		
		mac.start();
		mac.stop();
		
		
	}
}

//인터페이스
//- 클래스들간의 사용법을 규칙화하는 도구
//- 제약사항(=인터페이스) > 사용법 제시(강제적)

//모든 노트북 > start(), stop()

interface LapTop{
	void start();
	void stop();
}


class Gram implements LapTop{
	public String model;
	public String Color;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void start() {
		System.out.println("전원을 켭니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("전원을 끕니다.");
		
	}
}


class MacBook implements LapTop {
	
	public String model;
	public int weight;
	
	public void start() {
		System.out.println("맥북 On");
	}
	
	public void stop() {
		System.out.println("맥북 Off");
	}
	
}

class Galaxy {
	
}
