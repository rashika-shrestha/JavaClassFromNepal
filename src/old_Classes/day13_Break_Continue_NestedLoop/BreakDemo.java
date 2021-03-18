package old_Classes.day13_Break_Continue_NestedLoop;

public class BreakDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("exit from loop");
    }
}
