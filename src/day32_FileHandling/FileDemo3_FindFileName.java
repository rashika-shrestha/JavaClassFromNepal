package day32_FileHandling;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileDemo3_FindFileName {

    public static void main(String[] args) {
        String filePath = "C:/Users/rashi/Desktop/demo.txt";
        File f = new File(filePath);
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        f.setWritable(true);
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getFreeSpace());
        System.out.println(f.getUsableSpace());
        System.out.println(f.lastModified());
        System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()), ZoneId.systemDefault()));
        filePath = "C:/Users/rashi/Desktop/demo/test.txt";
        File ff = new File(filePath);
        f.renameTo(ff);
        ff.delete();

    }
}
