import java.util.Scanner;
import java.io.*;


class DataInputStreamDemo 

{
	
	public static void main(String args[]) throws IOException 
	
	{
		//writing the data.
		
			
			try 

			{

				DataOutputStream dout =	new DataOutputStream(new FileOutputStream("file.dat"));			
				dout.writeDouble(1.1);
			
				dout.writeInt(55);
	
				dout.writeInt(56);

				dout.writeInt(57);
		
				dout.writeBoolean(true);
			
				dout.writeChar('4');
		
			}
		
		
			catch(FileNotFoundException ex)
		
			{
			
				System.out.println("Cannot Open the Output File");
			
				return;
		
			}
		
		
			// reading the data back.
		
			
			try 
		
			{

	
				DataInputStream din =
new DataInputStream(new FileInputStream("file.dat"));
				int i,b=0;char d;					
				//illustrating readDouble() method
			
				double a = din.readDouble();
						
				//illustrating readInt() method
	
				while((i=din.read())!=-1)		
				{ b = din.readInt();
	
					System.out.println(b);}					
				//illustrating readBoolean() method
			
				//boolean c = din.readBoolean();
						
				//illustrating readChar() method
			
				//char d=din.readChar();
			
				System.out.println("Values: " + a  );
		
			}
		
			catch(FileNotFoundException e)
		
			{
			
				System.out.println("Cannot Open the Input File");
			
				return;
		
			}
	
	}

}