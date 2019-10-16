package com.company;

import java.util.Scanner;

import com.model.BracketCheck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập dãy ký tự = ");
			String str = sc.nextLine();
			String ans = BracketCheck.bracket_check(str);
			System.out.println(ans);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
