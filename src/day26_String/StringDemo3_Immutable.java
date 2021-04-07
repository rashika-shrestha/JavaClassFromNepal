package day26_String;

public class StringDemo3_Immutable {

    public static void main(String[] args) {
        String s1 = "Good Morning";
        System.out.println(s1);
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0, 4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("M"));
        System.out.println(s1.charAt(5));
        System.out.println(s1.contains("Good"));
        System.out.println(s1.contains("Bad"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("Morning", "Evening"));
        System.out.println("Hello ".concat(s1));

        String s2 = " I am Santosh Karna ";
        System.out.println(s2);
        System.out.println(s2.trim());

        int a = 5;
        System.out.println(String.valueOf(a));//"5"

    }
}
