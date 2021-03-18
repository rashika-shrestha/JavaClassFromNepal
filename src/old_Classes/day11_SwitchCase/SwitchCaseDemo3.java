package old_Classes.day11_SwitchCase;

import javax.swing.*;

public class SwitchCaseDemo3 {

    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Enter choice: add|sub|mul|div");

        switch (choice) {

            case "add":
                JOptionPane.showMessageDialog(null, "this is addition");
                break;
            case "sub":
                JOptionPane.showMessageDialog(null, "this is subtraction");
                break;
            case "mul":
                JOptionPane.showMessageDialog(null, "this is multiplication");
                break;
            case "div":
                JOptionPane.showMessageDialog(null, "this is division");
                break;
            default:
                JOptionPane.showMessageDialog(null, "wrong choice!!!");
                break;
        }

    }
}
