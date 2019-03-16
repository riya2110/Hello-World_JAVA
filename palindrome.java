import java.util.Scanner;

class palindrome
	{
		static int palindrome(int num)
		{
			int r,rev=0,temp;
			temp=num;
					while(num!=0)
					{
						r=num%10;
						rev=(10*rev)+r;
						num=num/10;
					}
					num=temp;

			if(num==rev)
			{
				return 1;
			}
			else
			return 0;
		}

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			int cases;
			System.out.println("Enter no of test cases : ");
			cases=sc.nextInt();
			int num,r,rev=0,temp;
			do
			{
				
				System.out.println("Enter Number : ");
				num=sc.nextInt();
				num++;
				
				while(palindrome(num)!=1)
				{
					num++;
				}

				System.out.printf("%d",num);

				cases--;
			}while(cases!=0);
					
		}
	}
				
							
			

			
	