package old_Classes.day8;

public class ImplicitTypeCasting {

    public static void main(String[] args) {
        byte b = 120;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}

//byte => short => int => long => float => double