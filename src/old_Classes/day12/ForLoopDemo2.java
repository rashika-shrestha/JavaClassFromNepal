package old_Classes.day12;

import javax.swing.*;

public class ForLoopDemo2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        JOptionPane.showMessageDialog(null, "Sum of nth number is: " + sum);

    }
}
