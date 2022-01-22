package com.test.java.obj.inheritance;

import java.util.Random;

public class UtilRandom extends Random {

		public int nextTinyInt() {
		
		return this.nextInt(10)+1;
	}
	
	public String nextColor() {
		
		String[] colors = {"red","yellow","blue","orange","green"};
		
		return colors[this.nextInt(colors.length)];
	}
	
}
