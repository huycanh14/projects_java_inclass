package com.model;

public class Prime {
	public static boolean Prime_check(int n) {
		int limit = (int)Math.sqrt(n); 
		for(int i = 2; i <= limit; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
