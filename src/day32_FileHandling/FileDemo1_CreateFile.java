package day32_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1_CreateFile {

    public static void main(String[] args) {
        String filePath = "C:/Users/rashi/Desktop/demo.txt";
        File f = new File(filePath);
        try {
            if (f.createNewFile()) {
                System.out.println("new file created...");
            } else {
                System.out.println("file already exists...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
