package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Marks 
{
	public static void main(String args[]) throws IOException
	{
		Path p = Path.of("c:\\resources\\marks.txt");
		
		Files.lines(p)
			 .mapToInt(v -> Integer.parseInt(v))
			 .sorted()
			 .forEach(System.out::println);
		
		var AvgMarks = Files.lines(p)
							.mapToInt(v -> Integer.parseInt(v))
							.average()
							.getAsDouble();
		
		System.out.println(AvgMarks);
	}
}