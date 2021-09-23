package library_1;

import java.util.Arrays;

public class SortNames {
	public static void main(String args[])
	{
		String s1 = "Mike,El,Lucas,Max,Dustin,Steve,Robin";
		
		String names[] = s1.split(",");
		
		Arrays.sort(names);
		
		for(String i : names)
			System.out.println(i);
	}

}
