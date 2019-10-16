package com.company;

import java.util.Scanner;

import com.model.DigitSum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)){
			int result, n;
			System.out.print("Nhập số nguyên n = ");
			n = sc.nextInt();
			result = DigitSum.DigitSum(n);
			System.out.println("Tổng các số nguyên = " + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
