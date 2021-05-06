package day43_Multithreading;

public class FacebookLike_Synchronization {

    private int likes;

    public FacebookLike_Synchronization(int likes){
        this.likes = likes;
    }

    public synchronized void increaseLikes(){
        try {
            System.out.println(likes);
            Thread.sleep(2000);
            likes++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
