package day25_String;

public class StringDemo2_Compare {

    public static void main(String[] args) {
        String s1 = "Nepal";
        String s2 = "Nepal";
        String s3 = new String("Nepal");
        String s4 = new String("Nepal");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false

        System.out.println("===========");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

        System.out.println("++++++++++++");
        String s5 = "nepal";
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));

        System.out.println("****************");
        if(s1.compareTo(s4)==0){
            System.out.println("both equals");
        }else{
            System.out.println("Not equals");
        }

        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.contentEquals(s5));
    }
}
