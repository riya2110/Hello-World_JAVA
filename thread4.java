import java.lang.*;

class abc implements Runnable
{
	abc()
	{
		Thread t = new Thread(this);
		t.start();
		System.out.println(t);
		t.start();
	}

	public void run()
	{
		System.out.println("In Class");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class thread4
{
	public static void main(String[] args)
	{
		abc o=new abc();
		
		System.out.println("End1");
		System.out.println("End2");
		System.out.println("End3");
	}
}
		