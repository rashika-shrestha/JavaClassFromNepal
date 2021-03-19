package day15;

public class ArrayDemo1 {

    public static void main(String[] args) {
        //<data type> [] <array name> = new <data type>[size of an array];
        String  []  names = new String[3];
        System.out.println(names);
        System.out.println(names.length);

        names[0] = "ram";
        names[1] = "shyam";
        names[2] = "hari";
//        names[3] = "krishna";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
//        System.out.println(names[3]);
    }
}
