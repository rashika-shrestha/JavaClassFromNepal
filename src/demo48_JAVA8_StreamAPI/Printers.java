package demo48_JAVA8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Printers {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> bookList = Arrays.asList("java", "php", "C++");
        bookList.forEach(Printers::print);
    }
}
