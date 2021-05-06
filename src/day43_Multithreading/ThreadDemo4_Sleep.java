package day43_Multithreading;

public class ThreadDemo4_Sleep extends Thread{

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
        ThreadDemo4_Sleep t1 = new ThreadDemo4_Sleep();
        ThreadDemo4_Sleep t2 = new ThreadDemo4_Sleep();
        ThreadDemo4_Sleep t3 = new ThreadDemo4_Sleep();

        t1.start();
        t2.start();
        t3.start();
    }
}
