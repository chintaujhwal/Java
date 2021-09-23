package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile1 
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("C:\\resources\\names.txt");
		
		if(f.exists())
			System.out.println("file exists \n");
		
		try(FileWriter fw = new FileWriter(f))
		{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("enter a name : ");
			String s = input.next();
			
			fw.write(s + "\n");
		}
		}
		
	}
}
