package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Function {
	public static List<String> getAllFunctions(File path) {

        List <String> arrayList = new ArrayList<>();

        String content = "";

        /**
         * get contents from file
         */
        try {
            content = Utils.readContentFromFile(path.getAbsolutePath());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        /**
         * get the functions
         */
        for (int i = 0; i < content.length() - 5; i++) {

            if (content.substring(i, i + 6).equals("static")) { // static found
                String tmp = "";
                int start = i;
                int cntSpace = 0;
                for (int j = i; j >= 0; j--) {
                    tmp = content.charAt(j) + tmp;
//                    if (content.charAt(j) == 'p') break;
                    if (content.substring(j, j + 6).equals("public") || content.substring(j, j + 7).equals("private")) {
                        break;
                    }
                }
                int cnt = 0;
                for (int j = i + 1; j < content.length(); j++) {
                    if (content.charAt(j) == '{') {
                        cnt++;
                    } else if (content.charAt(j) == '}') {
                        cnt--;
                        if (cnt == 0) {                                       // get enough brackets
                            tmp += content.charAt(j);
                            i = j;
                            break;
                        }
                    }
                    tmp += content.charAt(j);
                }
                arrayList.add(tmp);
            }

        }

        return arrayList;
    }


    /**
     *
     * get code function by name and data type
     * @param name
     * @return
     */
    public static String findFunctionByName(String name) {
        String file = "src/com/company/Utils.java";

        String P1 = "";
        ArrayList<String> p2 = new ArrayList<>();

        /**
         * split the datas' type
         */
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '(') {
                String tmp = "";
                for (int j = i + 1; j < name.length(); j++) {
                    if (name.charAt(j) == ',' || name.charAt(j) == ')') {
                        p2.add(tmp);
                        tmp = "";
                    } else {
                        tmp += name.charAt(j);
                    }
                }
                break;
            }
            P1 += name.charAt(i);
        }

        try {
            /**
             * use the get all functions
             */
            ArrayList<String> funcs = (ArrayList<String>) getAllFunctions(new File(file));

            for (String content: funcs) {

                for (int i = 0; i < content.length() - P1.length() + 1; i++) {
                    if (content.substring(i, i + P1.length()).equals(P1)) {                 // found name

                        String tmp = "";
                        for (int j = i + P1.length(); j < content.length() && content.charAt(j) != ')'; j++) {
                            tmp += content.charAt(j);
                        }
                        int start = 0;
                        int cnt = 0;
                        for (String x : p2) {
                            for (int j = start; j < tmp.length() - x.length() + 1; j++) {
                                if (tmp.substring(j, j + x.length()).equals(x)) {                    // compare each data type
                                    cnt++;
                                    start = j + x.length();
                                    break;
                                }
                            }
                        }
                        if (cnt == p2.size()) {
                            return content;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return "Not found!";
    }
}
