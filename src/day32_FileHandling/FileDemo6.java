package day32_FileHandling;

import java.io.*;

public class FileDemo6 {

    public static void main(String[] args) {
        String readFilePath = "C:/Users/rashi/Desktop/MethodDemo.java";
        String writeFilePath = "C:/Users/rashi/Desktop/demo/demo3.txt";

        try (
                FileReader in = new FileReader(readFilePath);
                FileWriter out = new FileWriter(writeFilePath);

        ){

            int len;
            while ((len = in.read()) != -1) {
                System.out.println(len);
                out.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
