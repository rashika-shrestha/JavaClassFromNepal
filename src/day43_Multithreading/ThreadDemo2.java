package day43_Multithreading;

public class ThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from thread...");
    }

    public static void main(String[] args) {
        ThreadDemo2 th1 = new ThreadDemo2();
        ThreadDemo2 th2 = new ThreadDemo2();
        ThreadDemo2 th3 = new ThreadDemo2();

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);

        t1.start();
        t2.start();
        t3.start();
    }
}
