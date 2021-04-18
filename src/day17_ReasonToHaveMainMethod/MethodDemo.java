package day17_ReasonToHaveMainMethod;

public class MethodDemo {

    public static void main(String[] abc) {
        String[] names = {"ram", "shyam", "hari"};
        print(abc);
    }


    public static void print(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
