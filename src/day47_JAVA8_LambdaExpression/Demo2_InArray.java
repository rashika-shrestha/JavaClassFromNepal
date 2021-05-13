package day47_JAVA8_LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo2_InArray {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10, 40, 30, 20);
        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i+" ");
            }
        });

        l.forEach( i -> System.out.print(i+" "));
    }
}
