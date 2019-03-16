import java.util.*;
import java.io.*;

class pin_no
	{
		static int ones_digit(int arr[])
		{
			int rem=0;
			int ones[];
			ones = new int[3];

			for(int i=0;i<3;i++)
			{	
				rem=arr[i]%10;
				ones[i]=rem;
			}

			int min=ones[0];
			for(int i=0;i<3;i++)
			{
				if(ones[i]<min)
				{
					min=ones[i];
				}
			}

			return min;
		}

		static int tens_digit(int arr[])
		{
			int rem=0,count;
			int tens[];
			tens = new int[3];
			int ar1[];
			ar1 = new int[3];
			int temp;
			for(int i=0;i<3;i++)	
			{	count=0;
				
				temp=arr[i];
				while(count<2)
				{
					rem=temp%10;
					temp=temp/10;
					count++;
				}
				tens[i]=rem;
			}
			
			int min=tens[0];
			for(int i=0;i<3;i++)
			{
				if(tens[i]<min)
				{
					min=tens[i];
				}
			}

			return min;
		}

		static int hund_digit(int arr[])
		{
			int rem=0,count=0;
			int hunds[];
			hunds = new int[3];
			int temp;
			for(int i=0;i<3;i++)
			{
				temp=arr[i];
				while(temp!=0)
				{
					rem=temp%10;
					temp=temp/10;
				}
				hunds[i]=rem;
			}

			int min=hunds[0];
			for(int i=0;i<3;i++)
			{
				if(hunds[i]<min)
				{
					min=hunds[i];
				}
			}

			return min;
		}

		static int thous_digit(int arr[])
		{
			int rem=0;
			int thous[];
			thous = new int[9];
			int j=0;
			int temp;
			for(int i=0;i<3;i++)
			{	
				temp=arr[i];
				while(temp!=0)
				{
					rem=temp%10;
					temp=temp/10;
					thous[j]=rem;
					
					j++;
				}
			}

			int max=0;
			for(int i=0;i<9;i++)
			{	
				if(thous[i]>max)
				{
					max=thous[i];
				}
			}

			return max;
		}
			
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int arr[];
			
			arr = new int[3];
			for(int i=0;i<3;i++)	
			{
				arr[i]=sc.nextInt();
			}

			int one = ones_digit(arr);
			int ten = tens_digit(arr);
			int hun = hund_digit(arr);
			int th = thous_digit(arr);
			System.out.printf("%d%d%d%d",th,hun,ten,one);
			
			
		}
	}