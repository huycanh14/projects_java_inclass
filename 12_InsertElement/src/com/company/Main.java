package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.InsertElement;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int n, x, y;
			do {
				System.out.print("Nhập số phần tử của mảng = ");
				n = sc.nextInt();
			} while (n < 0);
			ArrayList<Integer> arr = new ArrayList<Integer>(n);
			arr = Input(arr, n);
			System.out.println("Mảng vừa nhập là:");
			print(arr);
			System.out.print("Nhập vị trí cần thêm vào y = ");
			y = sc.nextInt();
			System.out.print("Nhập giá trị cần thêm x = ");
			x = sc.nextInt();
			InsertElement.insert(x, y, arr);
			System.out.println("Mảng mới là:");
			print(arr);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	private static void print(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		for(Integer value : arr)
			System.out.print(value + "\t");
		System.out.println();
	}
	private static ArrayList<Integer> Input(ArrayList<Integer>arr, int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i < n ; i++) {
			System.out.print("Nhập phần tử thứ " + (i) + " = ");
			arr.add(sc.nextInt());
		}
		return arr;
	}
}
