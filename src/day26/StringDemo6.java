package day26;

public class StringDemo6 {

    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Good");
        System.out.println(sbf);
        sbf.append(" Evening");
        System.out.println(sbf);
        sbf.insert(0, "Hello, ");
        System.out.println(sbf);
        sbf.delete(7, 11);
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
    }
}
