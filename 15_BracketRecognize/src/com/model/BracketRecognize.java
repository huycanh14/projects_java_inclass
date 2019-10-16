package com.model;

import java.util.ArrayList;
import java.util.Stack;
/*
 * Cấu trúc của stack: vào trước ra sau
 */
public class BracketRecognize {
	public static ArrayList<Integer> bracket_recognize(String s) {
        int n = s.length();
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ans.add(-1);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.add(i); //Lưu vào stack
            } else {
                int idx = stack.peek(); //lấy phần tử đầu tiên(giá trị vào sau cùng ko làm mất phần tử)
                stack.pop(); //xóa giá trị đầu tiên ra khỏi stack
                ans.set(idx, i); //gán giá trị tại vị trí idex bằng u
                ans.set(i, idx); //gán giá trị tại vị trí i bằng idx
            }
        }
        return ans;
    }
}
