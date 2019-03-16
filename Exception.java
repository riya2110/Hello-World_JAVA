import java.util.Scanner;
import java.io.*;

class Exception
{
	public static void main(String[] args)
	{
		try
		{
			int ar[]=new int[2];
			System.out.println("Element : "+ar[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown : "+e);
		}
		System.out.print("Out of  block .");
	}
}
	