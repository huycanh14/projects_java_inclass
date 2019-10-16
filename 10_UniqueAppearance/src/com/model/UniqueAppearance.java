package com.model;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueAppearance {
	//Xét đến phần tử arr[i], nếu arr[i] != arr[i - 1] && arr[i] != arr[i + 1] thì arr[i] là duy nhất trong mảng.
	public static ArrayList<Integer> unique_appearance(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>(arr.size());
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            boolean ok = true;
            if (i > 0 && arr.get(i).equals(arr.get(i - 1))) {
                ok = false;
            }
            if (i < arr.size() - 1 && arr.get(i).equals(arr.get(i + 1))) {
                ok = false;
            }
            if (ok) {
                ans.add(arr.get(i));
            }
        }
        return ans;
    }
}
