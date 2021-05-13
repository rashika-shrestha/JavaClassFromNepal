package demo48_JAVA8_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3_CollectionStreamAPI {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 5, 9, 8, 11, 4);

        List<Integer> evenMultipliers = numbers.stream().map(n -> {
            if (n % 2 == 0) {
                return n * 2;
            }
            return n;
        }).collect(Collectors.toList());

        List<Integer> evenList = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(evenMultipliers);
        System.out.println(evenList);
        System.out.println(oddList);

        int r = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(r);
        long n = numbers.stream().count();
        System.out.println(n);
        int min = numbers.stream().mapToInt(a -> a).min().orElseThrow();
        int max = numbers.stream().mapToInt(a -> a).max().orElseThrow();
        System.out.println(min);
        System.out.println(max);

        min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

       boolean flag  = numbers.stream().anyMatch(j -> j == 13);
        System.out.println(flag);

    }
}
