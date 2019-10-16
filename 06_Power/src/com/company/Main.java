package com.company;

import java.util.Scanner;

import com.model.Power;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try(Scanner sc = new Scanner(System.in)) {
			 int n, mod, a;
			 long result;
			 do {
				 System.out.print("Nhập a = ");
				 a = sc.nextInt();
				 System.out.print("Nhập n = ");
				 n = sc.nextInt();
				 System.out.print("Nhập mod = ");
				 mod = sc.nextInt();
			 }while(n > Math.pow(10, 9)|| mod < 0);
			 result = Power.pow_optimize(a, n, mod);
			 System.out.println("Kết quả = " + result);
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		}
	}

}
