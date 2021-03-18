package old_Classes.day5;

public class LiteralDemo {

    public static void main(String[] args) {
        //Literals: a source code representation of fixed value.
        //Literals: fixed value + data type

        //1. Integer Literals: 4354 65 7687688987 980 (int)
        byte b = 127;
        short s = 32767;
        int i =  2147483647;
        long l1 =  2147483647;
        long l2 =  2147483648L;
        long l3 = 9223372036854775807L;

        //2. Floating Literals 34.66 78.56(double)
        float f = 343.56F;
        double d = 343.56;

        //3. Boolean Literals: true false
        boolean b1 = true;
        boolean b2 = false;

        //4. Character Literals 'a' '1' '?'
        char c1 = 'a';
        char c2 = '1';
        char c3 = '#';
        char c4 = '\u0000';

        //5. String Literals:
        String s1 = "a";
        String s2 = "ram";
        String s3 = "abc@123#qr";
        String s4 = "Hello, I am Santosh Lal Karna";
        String s5 = "123";
        String s6 = "23.45";
        String s7 = "2011-01-11";
        String s8 = "";
        String s9 = " ";

        //6. Null Literals
        String s10 = null;

        LiteralDemo ob = new LiteralDemo();//this is an object in java
        LiteralDemo obj = null;

    }
}
