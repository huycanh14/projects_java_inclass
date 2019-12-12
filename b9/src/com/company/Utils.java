package com.company;
import java.io.*;

public class Utils {
	private static void privateVoid() {
        System.out.println("Private void!");
    }

    public static String readContentFromFile(String path) throws FileNotFoundException, IOException {
        String ans = "";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            ans += line;
            ans += "\n";
        }

        bufferedReader.close();
        fileReader.close();

        return ans;
    }

    public static void writeContentToFile(String path) throws IOException {

        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String content = "\nHaFeng rat dang yeu!";
        bufferedWriter.write(content);

        bufferedWriter.close();
        fileWriter.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
        File dir = new File(folderPath);

        File[] matches = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contentEquals(fileName);
            }
        });

        if (matches.length > 0) return matches[0];

        return null;
    }
}
