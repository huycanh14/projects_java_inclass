package com.model;

import java.util.ArrayList;

public class ToPrimes {
	public static ArrayList<Integer> primes_smaller_than(int N) { //Tạo mảng nguyên tố
        ArrayList<Boolean> p = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            p.add(true);
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (p.get(i)) {
                for (int j = i * i; j <= N; j += i) {
                    p.set(j, false);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(N + 1);
        for (int i = 2; i <= N; i++) {
            if (p.get(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
	
	public static String ToPrimes(int N, ArrayList<Integer> primes) {
        String ans = "";
		/*
		 * Chạy vòng lặp của mảng nguyên tố, gán prime = giá trị đang xét. Nếu N % prime == 0 => trong khi N % prime thì cnt + 1, N = N/N % prime
		 * ans = giá trị vị trí đang xét, số mũ là cnt
		 * Đến cuối cùng N > 1 thì giá trị còn lại của N chính là một số nguyên tố.
		 * Ngược lại ans = ans.substring(0, ans.length() - 1) để xóa kí tự dư thừa "*"
		 */
        for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            if (N % prime == 0) {
                int cnt = 0;
                while (N % prime == 0) {
                    cnt += 1;
                    N /= prime;
                }
                ans += "(" + Integer.toString(prime) + "^" + Integer.toString(cnt) + ")*";
            }
        }
        if (N > 1) {
            ans += "(" + Integer.toString(N) + "^1)";
        } else {
            ans = ans.substring(0, ans.length() - 1);
        }
        return ans;
    }
}
