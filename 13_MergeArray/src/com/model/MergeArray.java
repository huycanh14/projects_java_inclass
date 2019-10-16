package com.model;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArray {
	public static ArrayList<Integer> merge_array(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int n = arr1.size();
        int m = arr2.size();
        ArrayList<Integer> ans = new ArrayList<>(n + m);
        for(int value : arr1)
        	ans.add(value);
        for(int value : arr2)
        	ans.add(value);
        Collections.sort(ans);
        return ans;
    }
}
