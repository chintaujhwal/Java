package library_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListEmp1 
{
	public static void main(String args[]) throws Exception
	{
		var lines = Files.readAllLines(Path.of("C:\\resources\\employees.txt"));
		var employees = new TreeMap<String, String>();
		
		for(String i : lines)
		{
			String parts[] = i.split(",");
			
			if(parts.length > 1)
				employees.put(parts[0], parts[1]);
		}
		
		for(String i : employees.keySet())
			System.out.printf("%-8s - %s\n", i, employees.get(i));
		
	}
}
