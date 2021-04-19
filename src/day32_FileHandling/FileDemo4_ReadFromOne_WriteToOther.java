package day32_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4_ReadFromOne_WriteToOther {

    public static void main(String[] args) {
        String readFilePath = "C:/Users/rashi/Desktop/MethodDemo.java";
        String writeFilePath = "C:/Users/rashi/Desktop/demo/demo1.txt";

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(readFilePath);
            out = new FileOutputStream(writeFilePath);
            int len;
            while ((len = in.read()) != -1) {
                System.out.println(len);
                out.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
