package day43_Multithreading;

public class ThreadDemo5_Join extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo5_Join t1 = new ThreadDemo5_Join();
        ThreadDemo5_Join t2 = new ThreadDemo5_Join();
        ThreadDemo5_Join t3 = new ThreadDemo5_Join();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
