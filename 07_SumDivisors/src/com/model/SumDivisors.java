package com.model;

public class SumDivisors {
	public static long sum_divisors(long N) {
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static long sum_divisors_optimal(long N) {
        long sum = 0;
        for (long i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                sum += i;
                if (i * i != N) {// Trường hợp i * i == N ko được tính
                    sum += N / i;
                }
            }
        }
        return sum;
    }
}
