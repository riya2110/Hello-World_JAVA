import java.lang.*;

class abc implements Runnable
{
	abc()
	{
		Thread t = new Thread(this);
		t.start();
		System.out.println(t);
	}

	public void run()
	{
		System.out.println("In Class");
	}
}

class thread3
{
	public static void main(String[] args)
	{
		abc o=new abc();
		
		System.out.println("End");
	}
}
		