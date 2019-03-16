
import java.util.Scanner;
import java.io.*;

class ReadWriteDemo
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream f1=null;
		FileInputStream f2=null;
		
		try
		{
			f1 = new FileOutputStream("File2.txt");
			f2 = new FileInputStream("C:\\Users\\dell\\Desktop\\File1.txt");
			int i;
			char c;
			while((i=f2.read())!=-1)
			{
				c=(char)i;
				f1.write(c);
			}
				
			System.out.print("File written successfully . ");
	
		}
		catch(IOException e)
		{
			System.out.println("Exception thrown : "+e);
		}
		finally
		{
			if(f1!=null)
			f1.close();
		}
	}
}
	