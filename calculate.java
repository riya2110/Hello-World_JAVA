import java.util.Scanner;

class calculate
	{
		public static void main(String[] args)
		{
			int num1,num2,num3,small,grt;
						
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter first no. : ");
			num1 = sc.nextInt();

			System.out.println("Enter second no. : ");
			num2 = sc.nextInt();
	
			System.out.println("Enter third no. : ");
			num3 = sc.nextInt();

			small=num1<num2?num1:num2;
			small=small<num3?small:num3;

			grt=num1>num2?num1:num2;
			grt=grt>num3?grt:num3;

			System.out.printf("Sum : %d",num1+num2+num3);
			System.out.printf("\nAverage : %d",(num1+num2+num3)/3);
			System.out.printf("\nProduct : %d",num1*num2*num3);
			System.out.printf("\nSmallest : %d",small);
			System.out.printf("\nLargest : %d",grt);
 		}
};