package file_handling;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ShowFile2 {
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\class\\src\\Factors.java");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		int lineno = 1;
		
		while(true)
		{
			String line = lnr.readLine();
			if(line == null)
				break;
			System.out.printf("%3d : %s\n", lnr.getLineNumber(), line);
			lineno++;
		}
		
		fr.close();
		lnr.close();
		
	}

}
