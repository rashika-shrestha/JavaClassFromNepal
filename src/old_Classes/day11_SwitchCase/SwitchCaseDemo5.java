package old_Classes.day11_SwitchCase;

import javax.swing.*;

public class SwitchCaseDemo5 {

    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter choice: 1.add|2.sub|3.mul|4.div"));

        switch (choice) {

            case 1:
                System.out.println("this is addition");
                break;
            case 2:
                System.out.println("this is subtraction");
                break;
            default:
                System.out.println("wrong choice!!!");
            case 3:
                System.out.println("this is multiplication");
                break;
            case 4:
                System.out.println("this is division.");
                break;

        }

        System.out.println("exit from switch case");
        System.out.println("more code");
        System.out.println("end");
    }
}
