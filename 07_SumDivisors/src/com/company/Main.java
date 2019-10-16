package com.company;

import java.util.Scanner;

import com.model.SumDivisors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			long n, result;
			do {
				System.out.print("Nhập n = ");
				n = sc.nextLong();
			} while (n < 0 || n > Math.pow(10, 12) );
			result = SumDivisors.sum_divisors_optimal(n);
			System.out.println("Kết quả = " + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
