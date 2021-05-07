package day44;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        executors.execute(new Task("task1"));
        executors.execute(new Task("task2"));
        executors.execute(new Task("task3"));
        executors.execute(new Task("task4"));
        executors.execute(new Task("task5"));
        executors.shutdown();
    }
}
