package day26_String;

public class StringDemo5_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good");
        System.out.println(sb);
        sb.append(" Evening");
        System.out.println(sb);
        sb.insert(0, "Hello, ");
        System.out.println(sb);
        sb.delete(7, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
