package com.questiontwo;

import java.io.*;
//import java.sql.SQLOutput;
import java.util.ArrayList;

public class Expression {
	public static void NullPointerException() throws NullPointerException{
		Object object = null;
        System.out.println(object.toString());
	}
	
	public static void ArrayIndexOfBoundsException() throws ArrayIndexOutOfBoundsException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.get(0));
    }
	
	public static void ArithmeticException() throws ArithmeticException {
        System.out.println(1/0);
    }

    public static void ClassCastException() throws ClassCastException {
        Object object = new Object();
        System.out.println((Integer)object);
    }

    /**
     * @throws IOException
     */
    public static void IOException() throws java.io.IOException {
        FileWriter fileWriter = new FileWriter("output.txt", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.close();
        bufferedWriter.write("xxx");
        bufferedWriter.close();

    }

    /**
     * @throws FileNotFoundException
     */
    public static void FileNotFoundException() throws java.io.FileNotFoundException {
        FileReader fileReader = new FileReader("");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            NullPointerException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ArrayIndexOfBoundsException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ArithmeticException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ClassCastException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            IOException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileNotFoundException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
	}

}
