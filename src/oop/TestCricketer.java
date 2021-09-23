package oop;

abstract class Cricketer
{
	protected String name, country;
	
	public Cricketer(String name, String country)
	{		
		this.name = name;
		this.country = country;
	}
	
	void print()
	{
		System.out.print(name + " - " + country);
	}
	
	abstract void points();
}


class Batsman extends Cricketer
{
	protected int runs;
	
	public Batsman(String name, String country, int runs)
	{
		super(name, country);
		this.runs = runs;
	}
	
	@Override //Annotation
	void print()
	{
		super.print();
		System.out.println(" - " + runs);
	}
	
	void points()
	{
		System.out.println("Points : " + runs / 30);
	}
}

class Bowler extends Cricketer
{
	protected int wickets;
	
	public Bowler(String name, String country, int wickets)
	{
		super(name, country);
		this.wickets = wickets;
	}
	
	void print()
	{
		super.print();
		System.out.println(" - " + wickets);
	}
	
	void points()
	{
		System.out.println("Points : " + wickets / 2);
	}
}


public class TestCricketer
{
	public static void main(String[] args)
	{
		Cricketer x = new Batsman("Dhoni", "IND", 250);
		x.print();
		x.points();
		
		Cricketer y = new Bowler("Ashwin", "IND", 100);
		y.print();
		y.points();
	}
}