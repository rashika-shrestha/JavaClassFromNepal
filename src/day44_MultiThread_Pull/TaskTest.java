package day44_MultiThread_Pull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        executors.execute(new Task1_Runnable("task1"));
        executors.execute(new Task1_Runnable("task2"));
        executors.execute(new Task1_Runnable("task3"));
        executors.execute(new Task1_Runnable("task4"));
        executors.execute(new Task1_Runnable("task5"));
        executors.shutdown();
    }
}
