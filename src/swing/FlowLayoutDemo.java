package swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

	public FlowLayoutDemo() 
	{
		super("Flow Layout");
		
		var l = new JLabel("Email Address");
		var txt = new JTextField(20);
		var b1 = new JButton("Register");
		var b2 = new JButton("Cancel");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(l);
		c.add(txt);
		c.add(b1);
		c.add(b2);
		
	} 

	public static void main(String args[]) 
	{
		FlowLayoutDemo l = new FlowLayoutDemo();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(350, 200);
		l.setVisible(true);
	}
}