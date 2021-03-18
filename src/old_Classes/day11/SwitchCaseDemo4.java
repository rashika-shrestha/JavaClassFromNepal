package old_Classes.day11;

import javax.swing.*;

public class SwitchCaseDemo4 {

    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter choice: 1.add|2.sub|3.mul|4.div"));

        switch (choice) {

            case 1:
                System.out.println("this is addition");
                break;
            case 2:
            case 3:
                System.out.println("this is subtraction");
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
