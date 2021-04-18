package day26_String;

public class StringDemo6_StringBuffer {

    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Good");
        System.out.println(sbf);
//        sbf.append(" Evening");
//        System.out.println(sbf);
//        sbf.insert(0, "Hello, ");
//        System.out.println(sbf);
//        sbf.delete(7, 11);
//        System.out.println(sbf);
//        sbf.reverse();
//        System.out.println(sbf);
        sbf.delete(1, 4);
        System.out.println(sbf);
        sbf.insert(1, ".");
        System.out.println(sbf);
    }
}
