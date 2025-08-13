import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp1 extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton, modButton, bckButton, clrButton, exitButton; // Added exitButton

    CalculatorApp1() {
        setTitle("Basic Arithmetic Calculator");
        setSize(1450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 6, 10, 10));

        // UI Components
        add(new JLabel("Enter Number 1:"));
        num1Field = new JTextField();
        num1Field.setBackground(new Color(255, 255, 200)); // light yellow
        num1Field.setForeground(Color.BLACK);
        add(num1Field);

        add(new JLabel("Enter Number 2:"));
        num2Field = new JTextField();
        num2Field.setBackground(new Color(255, 255, 200)); // light yellow
        num2Field.setForeground(Color.BLACK);
        add(num2Field);

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");
        modButton = new JButton("Remainder");
        bckButton = new JButton("Back");
        clrButton = new JButton("Clear");
        exitButton = new JButton("Exit"); // Initialized the exit button

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        modButton.addActionListener(this);
        bckButton.addActionListener(this);
        clrButton.addActionListener(this);
        exitButton.addActionListener(this); // Added the action listener for the exit button

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(modButton);
        add(bckButton);
        add(clrButton); // Moved clrButton to be before resultField, for better placement. 
        add(exitButton); // Added the exit button

        add(new JLabel("Result:"));

        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBackground(new Color(200, 255, 200));
        resultField.setForeground(Color.BLACK);
        add(resultField);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        try {

            double num1 = Double.parseDouble(num1Field.getText());

            if (e.getSource() == addButton) {
                // ... Existing Add button logic ...
            } else if (e.getSource() == exitButton) { // Handle the exit button click
                System.exit(0);
            }

            // ... other button logic ...

        } catch (NumberFormatException ex) {
            // Handle invalid input for numbers
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
