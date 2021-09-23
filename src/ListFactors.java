public class ListFactors 
{
	
	public static void main(String ... nums)
	{
		for(String n : nums)
		{
			int x = Integer.parseInt(n);
			
			System.out.println("Factors of " + x);
		
			for(int i = 2; i <= x/2; i++)
			{
				if(x % i == 0)
					System.out.println(i);
			}
		}
	}
	
}
