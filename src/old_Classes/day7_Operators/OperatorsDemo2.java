package old_Classes.day7_Operators;

public class OperatorsDemo2 {

    public static void main(String[] args) {
        //Assignment Operator = += -= *= /= %=
        //Associativity Right to Left
        int a = 4 + 2 - 4 / 2 + 7 % 2 - 3 * 2;
        System.out.println(a);

        int i = 5;
        System.out.println(i);
        i += 3; //i = i +3;
        System.out.println(i);
    }
}
