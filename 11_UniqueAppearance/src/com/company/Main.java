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
				System.out.print("Số phần tử trong mảng  = ");
				n = sc.nextInt();
			}while(n <= 0);
			ArrayList<Integer> input = create_array_list(n);
			System.out.println("Danh sách vừa nhập là:");
	        print(input);
	        ArrayList<Integer> unique_appear = UniqueAppearance.unique_appearance_tree_map(input);
	        System.out.println("Danh sách các số xuất hiện 1 lần là:");
	        print(unique_appear);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	private static void print(ArrayList<Integer> input) {
		// TODO Auto-generated method stub
		for(int value : input)
			System.out.print(value + "\t");
		System.out.println();
	}

	private static ArrayList<Integer> create_array_list(int n) {
		ArrayList<Integer> input = new ArrayList<Integer>(n + 1);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< n; i++) {
			System.out.print("Nhập giá trị của phần tử thứ " + (i+1) + " = ");
			input.add(sc.nextInt());
		}
		return input;
	}

}
