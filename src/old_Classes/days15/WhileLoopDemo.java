package old_Classes.days15;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(n);
    }
}
