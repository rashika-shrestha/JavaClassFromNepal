package day23_WrapperClass;

public class WrapperDemo5 {

    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.valueOf("101", 2));
        System.out.println(Integer.toHexString(12));
        System.out.println(Integer.sum(4, 5));
        System.out.println(Integer.min(4, 5));
        System.out.println(Integer.max(5, 6));
    }
}
//101
//1*2^2+0*2^1+1*2^0
//4+0+1=5

//5%2=1
//2%2=0
//1