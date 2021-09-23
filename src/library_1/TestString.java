package library_1;

public class TestString {
	public static void main(String args[])
	{
		String s1 = new String("Hello");
		String s2 = "Java Standard Edition";
		
		System.out.println(s1.length()); 			//5
		System.out.println(s2.charAt(0));			//J
		System.out.println(s2.endsWith("tion"));	//true
		System.out.println(s1.concat(s2));			//HelloJava Standard Edition
		System.out.println(s2.indexOf("a",4));  	//7
		System.out.println(s2.toLowerCase());		//java standard edition
		System.out.println(s2.toUpperCase());		//JAVA STANDARD EDITION
		System.out.println(s2.substring(5,13));		//Standard
				
		String s3[] = {"hello", "bonjour", "hola"};
		System.out.println(String.join(" - ", s3));	//hello - bonjour - hola
		
		String s4[] = s2.split(" ");
		for(String i : s4)
			System.out.println(i);
		
	}
}
