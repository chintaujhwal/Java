package library_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortWords1 
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\resources\\notes.txt");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> al = new ArrayList<>();
		
		while(true)
		{
			String line = br.readLine();
			
			if (line == null)
				break;
			
			String words[] = line.split(" ");
			for(String i : words)
				al.add(i);
		}
		
		fr.close();
		br.close();
		
		al.sort(null);
		
		for(String j : al)
			System.out.println(j);
	}
}
