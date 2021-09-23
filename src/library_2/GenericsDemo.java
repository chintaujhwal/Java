package library_2;

import java.util.ArrayList;

public class GenericsDemo 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
	
		al.add("Mike");
		al.add("Eleven");
		al.add("lucas");
		
		System.out.println(al.get(0));
	}
}
