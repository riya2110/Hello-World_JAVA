import java.util.Scanner;

class largest
	{
		public static void main(String[] args)
		{
			int count,largest=0,num;
						
			Scanner sc = new Scanner(System.in);

			for(count=0;count<10;count++)
			{
				num=sc.nextInt();
				largest=largest>num?largest:num;
			}

			System.out.printf("Lagest of all 10 sales is %d",largest);
		}
	};


