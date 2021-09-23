package library_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListEmp2
{
	public static void main(String args[]) throws Exception
	{
		var lines = Files.readAllLines(Path.of("C:\\resources\\employees.txt"));
		var employees = new TreeMap<String, TreeSet<String>>();
		
		for(String i : lines)
		{
			String parts[] = i.split(",");
			
			if(parts.length < 2)
				continue;
			
			String dept_name = parts[0];
			String emp_name = parts[1];
			
			if(employees.containsKey(dept_name))
				employees.get(dept_name).add(emp_name);
			else
			{
				var names = new TreeSet<String>();
				names.add(emp_name);
				employees.put(dept_name, names);
			}
		}
		
		for(String i : employees.keySet())
		{
			System.out.printf("%-8s --> ",i);
			for(String j : employees.get(i))
				System.out.print(j + "\t");
			System.out.println();
				
		}
		
	}
}
