import java.util.Scanner;

class large
	{
		public static void main(String[] args)
		{
			int num1,num2;
			Scanner sc = new Scanner(System.in);
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			if(num1>num2)
			{
				System.out.printf("%d is larger . ",num1);
			}
			
			else if(num2>num1)
			{
				System.out.printf("%d is larger . ",num2);
			}
			
			else 
			{
				System.out.print("Both are equal . ");
			}
		}
};
 