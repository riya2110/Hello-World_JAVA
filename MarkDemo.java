import java.util.Scanner;
import java.io.*;

class MarkDemo
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream f2=null;
		
		try
		{			
			f2 = new FileInputStream("File2.txt");
			int i;
			char c;
			f2.mark(10);
			while((i=f2.read())!=-1)
			{
				c=(char)i;
				System.out.print(c);
			}
				
			System.out.print("File written successfully . ");
	
		}
		catch(IOException e)
		{
			System.out.println("Exception thrown : "+e);
		}
		finally
		{
			if(f2!=null)
			f2.close();
		}
	}
}
	