package com.model;

public class Power {
//	a^n = a^(n / 2) * a^(n / 2)
	public static long pow_optimize(int a, int n, int mod) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a % mod;
        }
        long tmp = pow_optimize(a, n / 2, mod);
        tmp = (tmp * tmp) % mod;
        System.out.println(tmp);
        if (n % 2 == 1) { // Vì n là số lẻ nên khi n/2 sẽ thiếu đi 1 đơn vị => tính thêm đơn vị đó
            tmp = (tmp * a) % mod;
        }
//        System.out.println(tmp);
//        System.out.println("----------------------------");
        return tmp;
    }
	
	public static long pow(int a, int n, int mod) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = (res * a) % mod;
        }
        return res;
    }
}
