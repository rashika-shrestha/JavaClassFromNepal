package old_Classes.day11;

import javax.swing.*;

public class SwitchCaseDemo2 {

    public static void main(String[] args) {
        String ch = JOptionPane.showInputDialog("Enter choice: + add|- sub|* mul| / div");
        char choice = ch.charAt(0);


        switch (choice) {

            case '+':
                JOptionPane.showMessageDialog(null, "this is addition");
                break;
            case '-':
                JOptionPane.showMessageDialog(null, "this is subtraction");
                break;
            case '*':
                JOptionPane.showMessageDialog(null, "this is multiplication");
                break;
            case '/':
                JOptionPane.showMessageDialog(null, "this is division");
                break;
            default:
                JOptionPane.showMessageDialog(null, "wrong choice!!!");
                break;
        }
    }
}
