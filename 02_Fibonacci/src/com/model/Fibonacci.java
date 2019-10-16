package com.model;

public class Fibonacci {
	public int fibonacci_one_query (int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return (this.fibonacci_one_query(n - 1) + this.fibonacci_one_query(n - 2));
    }
}
