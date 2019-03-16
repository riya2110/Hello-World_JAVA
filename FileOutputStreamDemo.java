import java.util.Scanner;
import java.io.*;

class FileOutputStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream f1=null;
		FileInputStream f2=null;
		String str="Data needs to be written in the file";
		try
		{
			f1 = new FileOutputStream("C:\\Users\\dell\\Desktop\\File1.txt");
			f2 = new FileInputStream("C:\\Users\\dell\\Desktop\\File1.txt");
			byte byteArray[]=str.getBytes();
			int x = f2.available();
			int y = str.length();
			f1.write(byteArray,4,y-4);

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
	