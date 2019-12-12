package com.company;

import java.util.List;

public class Main {
	/*
	 * Câu a
	 */
	public static int maxOfTwoNumbers(final int a, final int b) {
        try {
            if (a > b) {
                return a;
            }
            return b;
        } catch (Exception ex){
            return -1;
        }
    }
	/*
	 * Câu b
	 */
	public static int minOfArray(final List<Integer> myList) {
        int uniqueValue = -1;
        if (myList != null) {
            if (myList.size() > 0) {
                int ans = myList.get(0);
                for (int x : myList) {
                    if (x < ans) {
                        ans = x;
                    }
                }
                return ans;
            } else {
                return uniqueValue;
            }
        } else {
            return uniqueValue;
        }
    }
	/*
	 * Câu c
	 */
	public static String checkBMI(final double BMI) {
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else {
            if (23 <= BMI && BMI < 25) {
                return "Thừa cân";
            } else {
                if (18.5 <= BMI && BMI < 23) {
                    return "Bình thường";
                }
            }
        }
        if (BMI == 25) {
            return "So special BMI!";
        }
        return "Béo phì";
    }

    public static String BMI (final double weight, final double height) {
        String uniqueValue = "#";
        try {
            if (height > 0) {
                double BMI = weight / (height * height);
                System.out.println(BMI);
                System.out.println(checkBMI(BMI));
                return checkBMI(BMI);
            } else {
                return "Invalid height";
            }
        } catch (Exception ex) {
            return uniqueValue;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
