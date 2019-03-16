import java.util.Scanner;
import java.io.*;

class FileInputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = null;
		int i=0;
		char c;
		byte b[] = new byte[20];
		
		try
		{
			file = new FileInputStream("C:\\Users\\dell\\Desktop\\File1.txt");
			System.out.println("No of available bytes : "+file.available());
			i=file.read(b,10,5);
			System.out.println("No of bytes read : "+i);
			
			System.out.println("Bytes read : ");

			for(byte b1:b)
			{
				c=(char)b1;
				System.out.print(c);
			}
			
		}

		catch(IOException e)
		{
			System.out.println(e);
		}
		
		finally
		{

			if(file!=null)
			{
				file.close();	
			}
		}
	}
}			
			

	