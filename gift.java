import java.util.Scanner;

class gift
	{
		public static void main(String[] args)
		{
			String s1,s2,s3;
			char c,c1,c2,c3;

			Scanner sc = new Scanner(System.in);

			s1=sc.nextLine();
			s2=sc.nextLine();
			s3=sc.nextLine();

			c=sc.next().charAt(0);
			c1=s1.charAt(0);
			c2=s2.charAt(0);
			c3=s3.charAt(0);

			if((c==c1)||(c==c2)||(c==c3))
			{
				System.out.print("Yes");
			}
		}
		
	}
		