package day23_WrapperClass;

import javax.swing.*;

public class WrapperDemo2 {

    public static void main(String[] args) {
//        String s1 = "10";
        String s1 = JOptionPane.showInputDialog("Enter number1: ");
        int i1 = Integer.parseInt(s1);
//        String s2 = "20";
        String s2 = JOptionPane.showInputDialog("Enter number2: ");
        int i2 = Integer.parseInt(s2);
        int sum = i1 + i2;
        System.out.println("Sum is: " + sum);
    }
}
