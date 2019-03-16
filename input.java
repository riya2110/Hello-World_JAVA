import java.util.Scanner;

class input
	{
		public static void main(String[] args)
		{
			int x,y,z;
			String str;

			Scanner sc = new Scanner(System.in);
			x=sc.nextInt();		
			y=sc.nextInt();
			str=sc.next();
			z=sc.nextInt();

			System.out.printf("\n%d",x);
			System.out.printf("\n%d",y);
			System.out.printf("\n%s",str);
			System.out.printf("\n%d",z);
		}
	};
