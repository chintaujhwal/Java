package library_1;

import java.util.StringJoiner;

public class TestSB {
	public static void main(String args[])
	{
		StringBuffer s1 = new StringBuffer("Java");
		
		s1.append(" SE");
		System.out.println(s1);
		s1.insert(7," 15");
		System.out.println(s1);
		s1.insert(0,"Oracle ");
		System.out.println(s1);
		s1.delete(15, s1.length());
		System.out.println(s1);
		
		
		StringJoiner s2 = new StringJoiner(" ");
		
		s2.add("Marvel's");
		s2.add("Avengers");
		s2.add("ENDGAME");
		
		System.out.println(s2);
	}
}