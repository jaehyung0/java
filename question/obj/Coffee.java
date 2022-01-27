package com.test.question.obj;

public class Coffee {

	public static int bean;
	
	public static int water;
	public static int ice;
	public static int milk;
	public static int beanUnitPrice;
	public static double waterUnitPrice;
	public static int iceUnitPrice;
	public static int milkUnitPrice;
	public static int beanTotalPrice;
	public static double waterTotalPrice;
	public static int iceTotalPrice;
	public static int milkTotalPrice;
	public static int americano;
	public static int latte;
	public static int espresso;
	
	static {
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2; 
		Coffee.iceUnitPrice = 3; 
		Coffee.milkUnitPrice = 4; 
	}
//	public static int getBeanTotalPrice() {
//		beanTotalPrice=bean*Coffee.beanUnitPrice;
//		return beanTotalPrice;
//	}
//	public static double getWaterTotalPrice() {
//		waterTotalPrice=Coffee.water*Coffee.waterUnitPrice;
//		return waterTotalPrice;
//	}
//	public static int getIceTotalPrice() {
//		iceTotalPrice=Coffee.ice*Coffee.iceUnitPrice;
//		return iceTotalPrice;
//	}
//	public static int getMilkTotalPrice() {
//		Coffee.milkTotalPrice=Coffee.milk*Coffee.milkUnitPrice;
//		return Coffee.milkTotalPrice;
//	}
	
	
}
