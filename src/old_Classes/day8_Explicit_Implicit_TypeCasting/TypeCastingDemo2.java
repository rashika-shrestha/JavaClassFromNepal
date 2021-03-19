package old_Classes.day8_Explicit_Implicit_TypeCasting;

public class TypeCastingDemo2 {

    public static void main(String[] args) {
        char c1 = 'a';
        byte b1 = 'a';
        System.out.println(c1);
        System.out.println(b1);

        char c2 = 97;
        byte b2 = 97;
        System.out.println(c2);
        System.out.println(b2);

        char c3 = 65;
        byte b3 = (byte) c3;
        System.out.println(c3);
        System.out.println(b3);

        byte b4 = 66;
        char c4 = (char) b4;
        System.out.println(b4);
        System.out.println(c4);

    }
}
