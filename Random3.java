package com.mkyong.form.test;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomNumberInRange(33, 38));
		}

	}

	private static int getRandomNumberInRange(int min, int max) {
	
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}
	
}
