package streams;

import java.util.function.Consumer;
import java.util.Arrays;

class PrintName implements Consumer<String>
{
	@Override
	public void accept(String t) 
	{
		System.out.println(t.toUpperCase() );
	}
}

public class ArrayToStream 
{
	public static void main(String args[])
	{
		String[] names = {"Java", "Python", "JavaScript", "C#", "C++", "Kotlin"};
		
		//Arrays.stream(names).forEach(new PrintName());
		
		//Arrays.stream(names).forEach(v -> System.out.print(v.toUpperCase()));
		
		Arrays.stream(names).filter(v -> v.length() > 3)
							.sorted()
							.forEach(System.out::println);
	}
}
