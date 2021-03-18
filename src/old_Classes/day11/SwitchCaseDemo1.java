package old_Classes.day11;

import javax.swing.*;

//menu-driven programming
public class SwitchCaseDemo1 {

    public static void main(String[] args) {
        String ch = JOptionPane.showInputDialog("Enter choice: 1.add|2.sub|3.mul|4.div");
        int choice = Integer.parseInt(ch);

        switch (choice) {

            case 1:
                System.out.println("this is addition");
                break;
            case 2:
                System.out.println("this is subtraction");
                break;
            case 3:
                System.out.println("this is multiplication");
                break;
            case 4:
                System.out.println("this is division.");
                break;
            default:
                System.out.println("wrong choice!!!");
                break;
        }

        System.out.println("exit from switch case");
        System.out.println("more code");
        System.out.println("end");
    }
}
