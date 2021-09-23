package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintNonBlankLines 
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C://names.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true)
		{
			String line = br.readLine();
			if(line == null)
				break;
			if(line.length() > 0)
				System.out.println(line);
		}
		
		fr.close();
		br.close();
	}
}
