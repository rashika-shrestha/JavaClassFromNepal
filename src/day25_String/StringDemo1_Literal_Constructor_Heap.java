package day25_String;

public class StringDemo1_Literal_Constructor_Heap {

    public static void main(String[] args) {
        //Implicit creation(by using literals)
        String s1 = "Nepal";
        System.out.println(s1);

        //Explicit creation(by calling constructor)
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("Nepal");
        System.out.println(s3);

        char [] ch = {'d', 'e','f'};
        String s4 = new String(ch);
        System.out.println(s4);

        byte [] bb = {97, 98, 99};
        String s5 = new String(bb);
        System.out.println(s5);
    }
}
