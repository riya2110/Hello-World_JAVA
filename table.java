import java.util.Scanner;

class table
	{
		public static void main(String[] args)
		{
			int n,n1,n2,n3;
						
			Scanner sc = new Scanner(System.in);
			
			System.out.print("N\t10*N\t100*N\t1000*N");
			
			for(n=1;n<6;n++)
			{
				n1=n*10;
				n2=n*100;
				n3=n*1000;
				System.out.printf("\n%d\t%d\t%d\t%d",n,n1,n2,n3);
				
			}
		}
	};