import java.lang.*;

class abc extends Thread
{
	public void run()
	{
		System.out.println("in Thread");
	}
}

class thread2 
{
	public static void main(String[] args)
	{	
		abc o = new abc();
		System.out.println(o);
		System.out.println("End1");
		o.start();
		System.out.println("End2");
		System.out.println("End3");
		System.out.println("End4");
	}
}