package day23_WrapperClass;

public class WrapperDemo3 {

    public static void main(String[] args) {
        int a1 = 10;
        String s1 = String.valueOf(a1);//"10"
        Integer i1 = new Integer(a1);
        String s2 = i1.toString();//"10"
        String s3 = Integer.valueOf(a1).toString();//"10"
    }
}
