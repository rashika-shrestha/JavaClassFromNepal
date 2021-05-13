package demo48_JAVA8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo4_Array {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 5, 9, 8, 11, 4);
        numbers.stream().forEach(System.out::println);
    }
}
