import java.util.Scanner;

class lift
	{
		public static void main(String[] args)
		{
			int n,n1,n2,n3,min,f=0;		

			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();

			min=n-n1;

			if((n>n2)&&(min>n-n2))
			{
				min=n-n2;
				f=n2;				
			}

			if((n>n3)&&(min>n-n3))
			{
				min=n-n3;
				f=n3;
			}

			if((n>n1)&&(min>n-n1))
			{
				min=n-n1;
				f=n1;
			}

			System.out.print(f);
		}
}
		
		
		