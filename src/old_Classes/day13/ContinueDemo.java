package old_Classes.day13;

public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("exit from loop");
    }
}
