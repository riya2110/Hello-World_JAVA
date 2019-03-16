import java.util.Scanner;

class string
	{	
		public static void main(String[] args)
		{
			String str;

			Scanner sc = new Scanner(System.in);
			
			str=sc.nextLine();

			System.out.printf("%s%s",str.toUpperCase(),str.toLowerCase());
		}
	};
