import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class CalculatorApp extends JFrame implements ActionListener {

  private JTextField num1Field, num2Field, resultField;

  private JButton addButton, subButton, mulButton, divButton, modButton,bckButton,clrButton;

  public CalculatorApp() {

    setTitle("Basic Arithmetic Calculator");

    setSize(400,250);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(10, 5, 10, 10));

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

    addButton.addActionListener(this);

    subButton.addActionListener(this);

    mulButton.addActionListener(this);

    divButton.addActionListener(this);
    
    modButton.addActionListener(this);
   
    bckButton.addActionListener(this);
    clrButton.addActionListener(this);

    add(addButton);

    add(subButton);

    add(mulButton);

    add(divButton);
    
    add(modButton);
 
    add(bckButton);

    add(clrButton);
System.out.println();
System.out.println();
System.out.println();

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

      double num2 = Double.parseDouble(num2Field.getText());

      double result = 0;

      if (e.getSource() == addButton) {

        result = num1 + num2;

      } else if (e.getSource() == subButton) {

        result = num1 - num2;

      } else if (e.getSource() == mulButton) {

        result = num1 * num2;

      } 

         else if (e.getSource() == bckButton) {

        System.exit(0);

      }
         else if (e.getSource() == modButton) {

        result = num1 % num2;

       }
      else if (e.getSource() == clrButton) {

        num1Field.setText(" ");
              num2Field.setText(" ");
          resultField.setText(" ");

       }
else if (e.getSource() == divButton) {

        if (num2 == 0) {

          resultField.setText("Cannot divide by zero");

          return;

        } else {

          result = num1 / num2;

        }

      }

      resultField.setText(String.valueOf(result));

    } catch (NumberFormatException ex) {

      resultField.setText("Invalid Input");

    }

  }

  public static void main(String[] args) {

    new CalculatorApp();

  }

}