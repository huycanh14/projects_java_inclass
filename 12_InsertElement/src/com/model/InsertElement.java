package com.model;

import java.util.ArrayList;

public class InsertElement {
	public static void insert(int x, int y, ArrayList<Integer> arr) {
        int n = arr.size();
        if (y >= n) {
            arr.add(x);
        } else {
            y = Math.max(y, 0);
            arr.add(-1);
            for (int i = n - 1; i >= y; i--) {
                arr.set(i + 1, arr.get(i));
            }
            arr.set(y, x);
        }
    }
}
