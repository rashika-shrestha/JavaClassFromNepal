package day23_WrapperClass;

public class WrapperDemo1 {

    public static void main(String[] args) {

        int i1 = 5;//primitive
        Integer ii1 = new Integer(i1);//Object
        System.out.println(i1);
        System.out.println(ii1);

        Integer a1 = new Integer(7);//object
        int a2 = a1.intValue();
        System.out.println(a1);
        System.out.println(a2);

    }
}
