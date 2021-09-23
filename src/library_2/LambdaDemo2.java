package library_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) 
	{
		return s1.length() - s2.length();
	}
	
}

public class LambdaDemo2 
{
	public static void main(String args[])
	{
		var names = Arrays.asList(new String[] {"Java", "Python", "JavaScript", "C#", "C++", "Kotlin"});
		
		// normal sort
		//Collections.sort(names);
		
		// sort based in length
		//Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
		
		Collections.sort(names, new LengthCompare());
		
		for(String i : names)
			System.out.println(i);
	}
}
