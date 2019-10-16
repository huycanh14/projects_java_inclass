package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.ToPrimes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			int n;
			do {
				System.out.print("Nhập n =");
				n = sc.nextInt();
			} while (n < 0 || n > Math.pow(10, 12));
			ArrayList<Integer> result = ToPrimes.primes_smaller_than(n);
			String str = ToPrimes.ToPrimes(n, result);
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
