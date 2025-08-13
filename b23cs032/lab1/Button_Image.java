import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;
class Button_Image implements ActionListener{
static JFrame frame;
public static void main(String args[]){
frame= new JFrame("Image on Click");
frame.setSize(1080,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.white);
frame.setLayout(new FlowLayout());
JButton button = new JButton("Display");
frame.add(button);
Button_Image obj=new Button_Image();
button.addActionListener(obj);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){

ImageIcon icon=new ImageIcon("new.jpeg");


ImageIcon icon2=new ImageIcon("new2.jpeg");
JLabel label=new JLabel(icon);
JLabel label2=new JLabel(icon2);
frame.add(label);
frame.add(label2);
frame.pack();
frame.setSize()
}}