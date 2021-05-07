package day44;

import java.util.concurrent.*;

public class Task2 implements Callable<Integer> {

    private String name;

    public Task2(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(name);
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        try {
            ExecutorService executors = Executors.newFixedThreadPool(3);
            Future<Integer> f = executors.submit(new Task2("task1"));
            executors.shutdown();
            System.out.println(f.get());
            System.out.println(f.isDone());
            System.out.println(f.isCancelled());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
