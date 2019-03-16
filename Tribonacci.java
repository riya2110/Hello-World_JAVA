import java.util.Scanner;

class Tribonacci
	{
		public static void main(String[] args)
		{
			int n1,n2,n3,sum=0;

			n1=0;
			n2=0;
			n3=1;

			System.out.printf("%d %d %d ",n1,n2,n3);
			
			for(int i=0;i<5;i++)
			{
				sum=n1+n2+n3;
				System.out.printf("%d ",sum);
				n1=n2;
				n2=n3;
				n3=sum;
			}
		}
	}	
							
			