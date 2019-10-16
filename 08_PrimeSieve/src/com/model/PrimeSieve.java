package com.model;

import java.util.ArrayList;

public class PrimeSieve {
	public static ArrayList<Integer> primes_smaller_than(int N) {
		/*
		 * Khai báo 1 collection ArrayList với n + 1 phần tử gán giá trị true
		 * ktra từ 2 -> căn bậc 2 của n. Nếu giạ trị của phần tử ArrayList thứ i = true, chạy vòng for gán j = i*i mà <= N ==> ko là số nguyên tố
		 * tạo ArrayList mới và gán các giạ trị là true
		 */
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
}
