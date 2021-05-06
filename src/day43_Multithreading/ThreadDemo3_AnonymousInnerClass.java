package day43_Multithreading;

public class ThreadDemo3_AnonymousInnerClass {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from thread");
            }
        });
        t1.start();
    }
}
