package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.PrimeSieve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			int n;
			ArrayList<Integer> result = new ArrayList<Integer>();
			do {
				System.out.print("Nhập n = ");
				n = sc.nextInt();
			} while (n < 0 || n > Math.pow(10, 6));;
			result = PrimeSieve.primes_smaller_than(n);
			print(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	private static void print(ArrayList<Integer> result) {
		// TODO Auto-generated method stub
		for(int i = 0; i < result.size(); i++)
			System.out.print(result.get(i) + "\t");
	}

}
