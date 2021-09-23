package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class MobileNumber {

	public static void main(String[] args) throws Exception
	{
		Path p = Path.of("c:\\resources\\mobile.txt");
		
		Files.lines(p)
			 .forEach(System.out::println);
		
		/*public static boolean isMobile(String s)
		{
			return Pattern.matches("\\d+",s);
		}*/
	}

}
