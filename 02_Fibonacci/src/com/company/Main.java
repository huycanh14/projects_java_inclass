package com.company;

import java.util.Scanner;

import com.model.Fibonacci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			Integer n, mod, result;
			do {
				System.out.print("Nhập n = ");
				n = sc.nextInt();
				System.out.print("Nhập mod = ");
				mod = sc.nextInt();
			}while(n < 0 || n> 1000|| mod <0);
			Fibonacci fib = new Fibonacci();
			result = fib.fibonacci_one_query(n) % mod;
			System.out.println("Kết quả = " + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
