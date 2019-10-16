package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.BracketRecognize;

public class Main {
	public static void main(String[] args) {
		//Khi gặp ngoặc mở, ta đẩy nó vào stack. Khi gặp ngoặc đóng, ký tự tương ứng với nó nằm ở đầu stack, khi đó ta pop phần tử ở đầu stack.
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Nhập dãy kí tự = ");
			String bracket1 = sc.nextLine();
			System.out.println("Kết quả:");
			print(BracketRecognize.bracket_recognize(bracket1));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void print(ArrayList<Integer> bracket_recognize) {
		// TODO Auto-generated method stub
		for(Integer value : bracket_recognize)
			System.out.print(value + "\t");
		
	}
}
