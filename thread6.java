import java.lang.*;

class a extends Thread
{
	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{System.out.println(i);
		 Thread.sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class b extends Thread
{
	public void run()
	{
		try
		{
		for(int i=5;i<10;i++)
		{System.out.println(i);
		 Thread.sleep(1000);
		}
		}
		
		catch(InterruptedException e)
		{
		}
	}
}

class thread6
{
	public static void main(String[] args)
	{
		a t1 = new a();
		b t2 = new b();
	
		t1.start();
		t2.start();
	
		System.out.println("End");
	}
}
