package old_Classes.days15_MethodConcept;

public class MethodDemo2 {

    //    <access modifier> <return type> <method name> (zero to any number and any type of args){
//        ==
//        ==
    //return value;
//    }

    //method definition
    public static int sum() {
        int a = 5;
        int b = 6;
        int r = a + b;
        return r;
    }

    public String greet(String name, String msg) {
        int s = sum();
        System.out.println("summmmm is: " + s);
        String g = "Hello, " + name + " " + msg;
        return g;
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        //method calling
        int result = sum();
        System.out.println("sum is: " + result);

        MethodDemo2 obj = new MethodDemo2();
        String name = "raju";
        String msg = "good morning";
        String g = obj.greet(name, msg);
        System.out.println(g);

        int max = findMax(15, 6);
        System.out.println(max);
    }
}
