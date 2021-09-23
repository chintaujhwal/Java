package threading;

class ChildThread extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i <= 20; i++)
		{
			System.out.printf("Child : %d\n",i);
		}
	}
}

public class ChildThreadDemo 
{
	public static void main(String args[])
	{
		
		ChildThread ct = new ChildThread();
		
		ct.start(); // invokes run method
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.printf("Main : %d\n",i);
		}
		
		System.out.println("end of main");
	}

}
