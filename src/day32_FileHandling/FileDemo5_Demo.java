package day32_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo5_Demo {

    public static void main(String[] args) {
        String readFilePath = "C:/Users/rashi/Desktop/MethodDemo.java";
        String writeFilePath = "C:/Users/rashi/Desktop/demo/demo2.txt";


        try (
                FileInputStream   in = new FileInputStream(readFilePath);
                FileOutputStream out = new FileOutputStream(writeFilePath);

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
