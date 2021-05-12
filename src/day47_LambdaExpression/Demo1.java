package day47_LambdaExpression;

public class Demo1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from thread1");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("hello from thread2");
        });
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("hello from thread3"));
        t3.start();

        new Thread( () -> System.out.println("Hello from thread4")).start();


    }
}
