package swing;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame 
{
	public BorderLayoutDemo()
	{
		super("Border Layout");
		
		Container c = getContentPane();
		
		c.add(new JButton("Top"), BorderLayout.PAGE_START);
		c.add(new JButton("Bottom"), BorderLayout.PAGE_END);
		c.add(new JButton("Left"), BorderLayout.LINE_START);
		c.add(new JButton("Right"), BorderLayout.LINE_END);
		
		JPanel p = new JPanel();
		p.add(new JLabel("Label"));
		p.add(new TextField(20));
		p.add(new JButton("Go"));
		
		c.add(p);
		
	}
	
	public static void main(String args[])
	{
		BorderLayoutDemo l = new BorderLayoutDemo();
		l.setDefaultCloseOperation(EXIT_ON_CLOSE);
		l.setSize(350,200);
		l.setVisible(true);
	}
}
