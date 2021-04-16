package day32_FileHandling;

import java.io.*;

public class FileDemo7_BufferedReader_BufferedWriter {

    public static void main(String[] args) {
        String readFilePath = "C:/Users/rashi/Desktop/MethodDemo.java";
        String writeFilePath = "C:/Users/rashi/Desktop/demo/demo4.txt";

        try (
                FileReader in = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(in);
                FileWriter out = new FileWriter(writeFilePath);
                BufferedWriter bw = new BufferedWriter(out);

        ) {

            String len;
            while ((len = br.readLine()) != null) {
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
