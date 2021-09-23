package swing;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame
{
	public GridLayoutDemo()
	{
		super("Grid Layout");
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(0,3));
		
		for(int i = 1; i < 10; i++)
			c.add(new JButton("Button " + i));
	}
	
	public static void main(String args[])
	{
		GridLayoutDemo l = new GridLayoutDemo();
		l.setDefaultCloseOperation(EXIT_ON_CLOSE);
		l.setSize(350,200);
		l.setVisible(true);
	}
}
