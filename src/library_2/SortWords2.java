package library_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class SortWords2 
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("C:\\resources\\notes.txt");
		BufferedReader br = new BufferedReader(fr);
		
		TreeSet<String> SortedWords = new TreeSet<>();
		
		while(true)
		{
			String line = br.readLine();
			
			if (line == null)
				break;
			
			String words[] = line.split(" ");
			for(String i : words)
				SortedWords.add(i);
		}
		
		fr.close();
		br.close();
		
		
		for(String j : SortedWords)
			System.out.println(j);
	}
}
