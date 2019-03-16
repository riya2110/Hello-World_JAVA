import java.util.Scanner;

class string_reverse
	{
		public static void main(String[] args)
		{
			String s;
			Scanner sc = new Scanner(System.in);

			s=sc.nextLine();

			int size1,size2;
				
			String s1[]=s.split(" ");
			size1=s1.length;

			System.out.printf("%d\n",size1);

			for(int i=0;i<size1;i++)
			{
				StringBuffer sb = new StringBuffer(s1[i]);
				sb.reverse().toString();
				
				System.out.printf("%s ",sb);
			}
		}

	}