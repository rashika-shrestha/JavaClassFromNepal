package old_Classes.day7_Operators;

public class OperatorsDemo3 {
    public static void main(String[] args) {
        //Increment/Decrement Operator
        //++ --
        //post pre
        //a++ a-- ++a --a

        int i = 5;
        System.out.println(i);
        ++i; //i = i + 1;
        System.out.println(i);

        int a = 7;
        System.out.println(a);//7
        System.out.println(a++);//7
        System.out.println(a);//8

        int m = 9;
        int n = m++;
        System.out.println(m);//10
        System.out.println(n);//9

    }
}
