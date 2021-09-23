package swing;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFrame extends JFrame 
{
	public HelloFrame()
	{
		super("Hello");
		JLabel lbl = new JLabel("Hello");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setFont(new Font("SF Pro",Font.BOLD,40));
		
		Container c = this.getContentPane();
		c.add(lbl);
		
	}
	
	public static void main(String args[])
	{
		HelloFrame f = new HelloFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,200);
		f.setVisible(true);
	}
}
