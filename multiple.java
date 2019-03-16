import java.util.Scanner;

class multiple
	{
		public static void main(String[] args)
		{
			int num1,num2,res;
						
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter first no. : ");
			num1 = sc.nextInt();

			System.out.println("Enter second no. : ");
			num2 = sc.nextInt();
	
			if(num1%num2==0)
			System.out.printf("%d is a multiple of %d",num1,num2);

			else if(num2%num1==0)
			System.out.printf("%d is a multiple of %d",num2,num1);
			
			else
			System.out.printf("%d is not a multiple of %d",num1,num2);
 		}
};