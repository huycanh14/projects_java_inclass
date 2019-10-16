package com.model;

public class LCM_GCD {
	public static int greatest_common_divisor(int a, int b) { //ước chung lớn nhất
		if(b == 0) return a;
		return greatest_common_divisor(b, a % b);
	}
	
	public static int lowest_common_multiple(int a, int b) { // bội chung nhỏ nhất
		return (a * b) / greatest_common_divisor(a, b);
	}
}
