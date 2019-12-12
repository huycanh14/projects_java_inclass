package com.company;

public class Main {
	public static int GCD(int a, int b) {//greatest common divisor
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
	public static int Fibonacci(int n) {
		if(n==0) return 0;
	    else if(n==1) return 1;
	    return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Câu 1
		 */
		System.out.println(GCD(8, 16));
		System.out.println(Fibonacci(9));
		
	}

}
