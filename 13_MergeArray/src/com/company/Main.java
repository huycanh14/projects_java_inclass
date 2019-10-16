package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.model.MergeArray;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int n, m;
			do {
				System.out.print("Nhập phần tử của mảng thứ 1: n = ");
				n = sc.nextInt();
				System.out.print("Nhập phần tử của mảng thứ 2: m = ");
				m = sc.nextInt();
			}while(n< 0 || m < 0);
			ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
			ArrayList<Integer> arr2 = new ArrayList<Integer>(m);
			System.out.println("Nhập giá trị mảng thứ 1");
			input(arr1, n);
			Collections.sort(arr1);
			System.out.println("\nNhập giá trị mảng thứ 2");
			input(arr2, m);
			Collections.sort(arr2);
			ArrayList<Integer> ans = MergeArray.merge_array(arr1, arr2);
			System.out.println("\nMảng mới:");
			print(ans);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	private static void print(ArrayList<Integer> ans) {
		// TODO Auto-generated method stub
		for(Integer value : ans)
			System.out.print(value + "\t");
		System.out.println();
	}
	private static void input(ArrayList<Integer> arr, int size) {
		for(int i = 0; i< size; i++) {
			System.out.print("Nhập giá trị thứ " + i + " = ");
			arr.add(sc.nextInt());
		}
	}

}
