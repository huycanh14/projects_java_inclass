package com.company;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            List<String> list = Function.getAllFunctions(new File("src/com/company/Utils.java"));
            for (String x: list) {
                System.out.println(x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("---------------------------------------------------------------------------------------");

        /**
         * get specific name
         */
        try {
            System.out.println(Function.findFunctionByName("privateVoid()"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	}

}
