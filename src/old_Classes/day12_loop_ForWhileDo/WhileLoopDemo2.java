package old_Classes.day12_loop_ForWhileDo;

import java.util.Scanner;

public class WhileLoopDemo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("name is: " + name);
            if (name.equals("rashi")) {
                flag = false;
            }
        }
    }
}
