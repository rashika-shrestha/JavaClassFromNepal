package day32_FileHandling;

import java.io.File;

public class FileDemo2_CreateFloder {

    public static void main(String[] args) {
        String filePath = "C:/Users/rashi/Desktop/demo";
        File f = new File(filePath);
        if(f.mkdir()){
            System.out.println("new directory created...");
        }else{
            System.out.println("already exists...");
        }
    }
}
