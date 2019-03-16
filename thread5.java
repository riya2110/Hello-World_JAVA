import java.lang.*;

class abc extends Thread
{

	public void run()
	{
		System.out.println("In Class");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class thread5
{
	public static void main(String[] args)
	{
		abc o1=new abc();
		abc o2=new abc();

		//o1.start();
		//o2.start();
		
		o1.run();
		o2.run();

		System.out.println("End1");
		System.out.println("End2");
		System.out.println("End3");
	}
}
		