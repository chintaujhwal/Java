package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class ShowFiles {

	public static void main(String[] args) throws Exception
	{
		Path p = Path.of("E:\\Music\\English\\");
		
		Files.walk(p)
			 .filter(v -> v.toString().endsWith(".mp3"))
			 .filter(v -> v.toString().contains("Selena"))
			 .forEach(System.out::println);
	}
}
