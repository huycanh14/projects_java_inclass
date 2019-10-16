package com.model;

public class BracketCheck {
	public static String bracket_check(String bracket) {
        int n = bracket.length();
        int check_value = 0;
        for (int i = 0; i < n; i++) {
            if (bracket.charAt(i) == '(') {
                check_value++;
            } else {
                check_value--;
                if (check_value < 0) {
                    return "Dãy ngoặc không hợp lệ!";
                }
            }
        }
        if (check_value > 0) {
            return "Dãy ngoặc không hợp lệ!";
        }
        return "Dãy ngoặc hợp lệ!";
    }
}
