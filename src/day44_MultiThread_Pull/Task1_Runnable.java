package day44_MultiThread_Pull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1_Runnable implements Runnable {

    private String name;

    public Task1_Runnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        for (int i = 0; i <= 5; i++) {
            if (i == 0) {
                System.out.println("Initialization time of " +name +" is: "+sdf.format(new Date()));
            }else{
                System.out.println("Running time of " +name +" is: "+sdf.format(new Date()));
            }
        }
        System.out.println(name+" is terminated.");
    }
}
