package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile1 {
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\class\\src\\Factors.java");
		BufferedReader br = new BufferedReader(fr);
		
		int lineno = 1;
		
		while(true)
		{
			String line = br.readLine();
			if(line == null)
				break;
			System.out.printf("%3d : %s\n", lineno, line);
			lineno++;
		}
		
		fr.close();
		br.close();
		
	}

}
