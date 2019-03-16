import java.io.*;

public class ExceptError extends Exception
{
	int x;
		
	public int num(int y)
	{
		x=y;
		if(x>12)
		{	
			throw 12-x;
		}
		else
		return x;
	}
}

class ExceptMain
{
	public static void main(String[] args)
	{
		ExceptError ex = new ExceptError();
		Scanner s = new Scanner(System.in);

		int z,w;

		try
		{
			z=s.nextInt();
			w=ex.num(z);
			System.out.println("X is : "+w);

			z=s.nextInt();
			w=ex.num(z);
			System.out.println("X is : "+w);
		}
		catch(ExceptError e)
		{
			System.out.println("No greater than 12 by : "+ex.num());
		}
		
		System.out.print("Out of block ");
	}
}