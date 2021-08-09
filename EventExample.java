import javax.swing.*; 
 import java.awt.*; 
 import java.awt.event.*; 
 class EventExample extends JFrame implements ActionListener 
 { 
     private int count =0; 
     JLabel lblData; 
     EventExample() 
     { 
       setLayout(new FlowLayout()); 
       lblData = new JLabel("Button Clicked 0 Times"); 
       JButton btnClick=new JButton("Click Me"); 
       btnClick.addActionListener(this);  
       add(lblData); 
       add(btnClick); 
     } 
     public void actionPerformed(ActionEvent e) 
     { 
       count++; 
       lblData.setText("Button Clicked " + count +" Times"); 
     } 
 } 
   class EventHandlingJavaExample 
  { 
     public static void main(String args[]) 
     { 
        EventExample frame = new EventExample(); 
        frame.setTitle("Event Handling Java Example"); 
        frame.setBounds(200,150,180,150); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
     } 
  }
