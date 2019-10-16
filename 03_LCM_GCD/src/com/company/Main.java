package com.company;

import java.util.Scanner;

import com.model.LCM_GCD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)){
			Integer a, b, lcm, gcd;
			do {
				System.out.print("Nhập số a =");
				a = sc.nextInt();
				System.out.print("Nhập số b = ");
				b = sc.nextInt();
			}while(a < 0 || a > Math.pow(10, 6) || b < 0 || b > Math.pow(10, 6));
			
			gcd = LCM_GCD.greatest_common_divisor(a, b);
			System.out.println("Ước chung lớn nhât = " + gcd);
			lcm = LCM_GCD.lowest_common_multiple(a, b);
			System.out.println("Bội chung nhỏ nhất = " + lcm);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
