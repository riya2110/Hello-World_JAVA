import java.util.Scanner;

class NewThread implements Runnable
{
	String name;
	Thread t;

	NewThread(String Threadname)
	{
		name = Threadname;
		t = new Thread(this,name);
		System.out.println("New Thread : "+t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			System.out.println(name + "Interuppted");
		}

		System.out.println(name + "Exiting");
	}
}

class MultiThreadDemo
{
	public static void main(String[] args)
	{
		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");
		
		try
		{
			Thread.sleep(1000);
		}

		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}
