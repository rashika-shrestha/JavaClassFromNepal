package day47_LambdaExpression;

import javax.swing.*;

public class SwingDemo extends JFrame {

    private JTextField firstField;
    private JTextField secondField;
    private JTextField resultField;

    private JLabel firstNumberLbl;
    private JLabel secondNumberLbl;
    private JLabel resultLbl;

    private JButton addButton;

    public SwingDemo() {
        super("Sum Demo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        firstNumberLbl = new JLabel("Enter first number: ");
        firstField = new JTextField();

        secondNumberLbl = new JLabel("Enter second number: ");
        secondField = new JTextField();

        resultLbl = new JLabel("Result is: ");
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("Add");

        add(firstNumberLbl).setBounds(5, 10, 100, 50);
        add(firstField).setBounds(120, 10, 150, 50);
        add(secondNumberLbl).setBounds(5, 70, 100, 50);
        add(secondField).setBounds(120, 70, 150, 50);
        add(resultLbl).setBounds(5, 140, 100, 50);
        add(resultField).setBounds(120, 140, 150, 50);
        add(addButton).setBounds(180, 220, 70, 40);

        addButton.addActionListener( e ->  {
                int num1 = Integer.parseInt(firstField.getText());
                int num2 = Integer.parseInt(secondField.getText());
                int sum = num1 + num2;
                System.out.println("sum is : "+sum);
                resultField.setText(String.valueOf(sum));
        });

    }

    public static void main(String[] args) {
        new SwingDemo().setVisible(true);
    }
}
