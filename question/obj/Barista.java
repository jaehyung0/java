package com.test.question.obj;

public class Barista {

	
	
	public Espresso makeEspresso(int bean) {
		
		Espresso E1 = new Espresso(bean);
		Coffee.espresso++;
		Coffee.bean=Coffee.bean+bean;
		
		return E1;
		
	}
	
	public Espresso[] makeEspressoes(int bean,int count) {
		
		Espresso[] E2 = new Espresso[count];
		for(int i=0;i<E2.length;i++) {
			E2[i]=new Espresso(bean);
			Coffee.espresso++;
			Coffee.bean+=bean;
		}
		return E2;
	}
	
	public Latte makeLatte(int bean,int milk) {
		
		Latte alatte = new Latte(bean,milk);
		Coffee.latte++;
		Coffee.bean+=bean;
		Coffee.milk+=milk;
		
		return alatte;
	}
	
	public Latte[] makeLattes(int bean,int milk,int count) {
		
		Latte[] lattes = new Latte[count];
		for(int i=0;i<count;i++) {
			lattes[i]=new Latte(bean,milk);
			Coffee.latte++;
			Coffee.bean+=bean;
			Coffee.milk+=milk;
		}
		return lattes;
	}
	
	public Americano makeAmericano(int bean,int water,int ice) {
		
		Americano ameri = new Americano(bean,water,ice);
		Coffee.bean+=bean;
		Coffee.water+=water;
		Coffee.ice+=ice;
		
		return ameri;
	}
	
	public Americano[] makeAmericanos(int bean,int water,int ice,int count) {
		Americano[] ameris = new Americano[count];
		for(int i=0;i<count;i++) {
			ameris[i]=new Americano(bean,water,ice);
			Coffee.americano++;
			Coffee.bean+=bean;
			Coffee.water+=water;
			Coffee.ice+=ice;
		}
		return ameris;
	}
	
	public void result() {
		System.out.println("======================");
		System.out.println("판매결과");
		System.out.println("======================");
		System.out.println();
		System.out.println("----------------------");
		System.out.println("음료판매량");
		System.out.println("----------------------");
		System.out.printf("에스프레소: %d잔\n",Coffee.espresso);
		System.out.printf("아메리카노: %d잔\n",Coffee.americano);
		System.out.printf("라떼: %d잔\n",Coffee.latte);
		System.out.println();
		System.out.println("----------------------");
		System.out.println("원자재 소비량");
		System.out.println("----------------------");
		System.out.printf("원두: %dg\n",Coffee.bean);
		System.out.printf("물: %dml\n",Coffee.water);
		System.out.printf("얼음: %d개\n",Coffee.ice);
		System.out.printf("우유: %dml\n",Coffee.milk);
		System.out.println();
		System.out.println("----------------------");
		System.out.println("매출액");
		System.out.println("----------------------");
		
		Coffee.beanTotalPrice=Coffee.bean*Coffee.beanUnitPrice;
		Coffee.waterTotalPrice=Coffee.water*Coffee.waterUnitPrice;
		Coffee.iceTotalPrice=Coffee.ice*Coffee.iceUnitPrice;
		Coffee.milkTotalPrice=Coffee.milk*Coffee.milkUnitPrice;
		
		System.out.printf("원두: %d원\n",Coffee.beanTotalPrice);
		System.out.printf("물: %d원\n",(int)Coffee.waterTotalPrice);
		System.out.printf("얼음: %d원\n",Coffee.iceTotalPrice);
		System.out.printf("우유: %d원\n",Coffee.milkTotalPrice);
		
	
	}
}
