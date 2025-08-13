import javax.swing.*;
import java.awt.event.*;
import java.time.localTime;
public class GreetingApp extends JFrame implements ActionListener {
JButton button;
JLabel label;
GreetingApp(){
setTitle("Time-Based Greeting");
button = new JButton("Get Greeting");
button.setBounds(100, 100, 150, 40);
button.addActionListener(this);
label = new JLabel("");
label.setBounds(100, 160, 300, 30);
add(button);
add(label);
setSize(400, 300);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
int hour=localTime.now().getHour();
String greeting;
if(hour>=5 && hour<12){
greeting = "Good Morning!";
}
else if(hour>=12 && hour<17){
greeting = "Good Afternoon!";
}
else{
greeting = "Good Evening!";
}
label.setText(greeting);
}
public static void main(String[] args){
new GreetingApp();
}}
