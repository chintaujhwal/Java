package library_1;

class Time {
	private int hours, min, sec;
	
	Time(int hours, int min, int sec)
	{
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}
	
	public int getTotalSeconds()
	{
		return hours*60*60 + min*60 + sec;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Time)
		{
			Time t = (Time) obj;
			return t.getTotalSeconds() == this.getTotalSeconds();
		}
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		return String.format("%d:%d:%d",hours,min,sec);
	}
	
}

public class TestTime {

	public static void main(String[] args) {
		
		Time t1 = new Time(10,20,30);
		Time t2 = new Time(10,20,30);

		System.out.println(t1.equals(t2));
		System.out.println(t1.toString());
	}

}
