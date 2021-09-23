package library_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class WordCount 
{
	public static void main(String[] args) throws Exception
	{
		Path p = Path.of("c:\\resources\\notes.txt");
		
		String text = Files.readString(p);
		
		var words = text.split("\\W");
		
		var wordCount = new TreeMap<String, Integer>();
		
		for(String w : words)
		{
			if(wordCount.containsKey(w))
			{
				var count = wordCount.get(w);
				wordCount.put(w, count + 1);
			}
			else
			{
				wordCount.put(w, 1);
			}
		}
		
		
		for(String w : wordCount.keySet())
			System.out.printf("%-12s - %3d\n",w,wordCount.get(w));
	
	}
}
