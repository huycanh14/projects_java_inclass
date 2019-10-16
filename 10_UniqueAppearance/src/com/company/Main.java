package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.UniqueAppearance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			int n;
			do {
				System.out.print("Nhập số phần tử trong mảng = ");
				n = sc.nextInt();
			} while (n <= 0);
			ArrayList<Integer> arr = new ArrayList<Integer>(n + 1);
			ArrayList<Integer> result = new ArrayList<Integer>(n + 1);
			for(int i = 0; i < n ; i++) {
				System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + " = ");
				int temp = sc.nextInt();
				arr.add(temp);
			}
			result = UniqueAppearance.unique_appearance(arr);
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
