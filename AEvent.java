import java.awt.*;  
import java.awt.event.*;  
class AEvent extends Frame implements ActionListener{  
TextField tf ,tf1;  
AEvent(){  
  
//create components  
tf=new TextField();  
tf1=new TextField();  
tf.setBounds(60,50,170,20);  
tf1.setBounds(60,80,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf); add(tf1); 
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
String s = tf.getText();
int a = Integer.parseInt(s);
if(a%2 ==0){
	tf1.setText("Even");
}  
else{
	tf1.setText("Odd");
}
}
public static void main(String args[]){  
new AEvent();  
}  
}
