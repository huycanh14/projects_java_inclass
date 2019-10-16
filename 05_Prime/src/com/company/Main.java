package com.company;

import java.util.Scanner;

import com.model.Prime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			int n;
			boolean result;
			do {
				System.out.print("Nhập số cần kiểm tra = ");
				n = sc.nextInt();
			}while(n <= 0);
			result = Prime.Prime_check(n);
			if(result) System.out.println(n + " là số nguyên tố");
			else System.out.println(n + " không là số nguyên tố");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
