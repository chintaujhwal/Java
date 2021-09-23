package library_2;

import java.util.ArrayList;

public class SortNames 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Mike");
		al.add("Eleven");
		al.add("Lucas");
		al.add("Max");
		
		al.sort(null);
		
		for(String i : al)
			System.out.println(i);
	}
}
