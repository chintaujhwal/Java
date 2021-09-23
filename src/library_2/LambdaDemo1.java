package library_2;

class Task implements Runnable 
{
	@Override
	public void run() 
	{
		System.out.println("Task");
	}
}

public class LambdaDemo1 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Task());
		t1.start();

		Thread t2 = new Thread(new Runnable() 
		{
			public void run() 
			{
				System.out.println("Anonymous class");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Lambda Expression"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> 
		{
			for (int i = 0; i < 5; i++)
				System.out.print(i + " ");
			System.out.println();
		});
		t4.start();

		// Method reference
		Thread t5 = new Thread(LambdaDemo1::printNumbers);
		t5.start();

	}

	public static void printNumbers() 
	{
		for (int i = 5; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();
	}

}