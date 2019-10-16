package com.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class UniqueAppearance {
	public static ArrayList<Integer> unique_appearance_tree_map(ArrayList<Integer> arr) { 	
		/*
		 * TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
		 */
        ArrayList<Integer> ans = new ArrayList<>(arr.size());
        Map<Integer, Integer> map = new TreeMap<>(); //Tạo mảng Map có key: int, value: int
        for (int val: arr) { // Gán giá trị vào map
            addElement(map, val);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) { //so sánh giá trị của key
                ans.add(key);
            }
        }

        return ans;
    }
    private static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) { // ktra giá trị element có tồn tại trong treeMap hay chưa. Đã tồn tại rồi thì gán số lần xuất hiện mới
            int count = map.get(element) + 1;
            map.put(element, count);
        } else { //chưa tồn tại thì gán giá trị lần xuất hiện là 1
            map.put(element, 1);
        }
    }
}
