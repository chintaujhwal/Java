package file_handling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\class\\src\\Factors.java");
		
		int ch;
		
		while(true)
		{
			ch = fr.read();
			if(ch == -1)
				break;
			System.out.println((char)ch);
		}
		
		fr.close();
		
	}

}
