package day43_Multithreading;

public class ThreadDemo6_PrioritySet extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo6_PrioritySet t1 = new ThreadDemo6_PrioritySet();
        ThreadDemo6_PrioritySet t2 = new ThreadDemo6_PrioritySet();
        ThreadDemo6_PrioritySet t3 = new ThreadDemo6_PrioritySet();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
