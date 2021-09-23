package exception_handling;

import java.util.Scanner;

public class Demo {
	public static void main(String args[])
	{	
		Scanner input = new Scanner(System.in);
		
	try
	{
		System.out.print("enter a number : ");
		int x = input.nextInt();
		
		if(x % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");	
	}
	catch(Exception ex)
	{
		System.out.println("invalid input");
	}
	
	}

}