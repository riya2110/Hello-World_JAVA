import java.util.*;
import java.io.*;

class dup_array
	{
		static int ret_duplicate(int arr[],int n)
		{
			int frq[];
			frq = new int[n];

			int count=1;
			int index=-1;
			for(int i=0;i<n;i++)
			{	count=1;
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						frq[j]=-1;
					}
				}
				if(frq[i]!=-1)
				frq[i]=count;
			}

			/*for(int i=0;i<n;i++)
			{
				if(frq[i]>0)
				{
					System.out.println(frq[i]);
				}
			}*/

			for(int i=0;i<n;i++)
			{
				if(frq[i]>1)
				{
					index=i;
				}
			}
			

			return index;
		}	
		public static void main(String[] args)
		{
			int n;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();

			int arr[];
			arr = new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}

			int x = ret_duplicate(arr,n);

			System.out.printf("Index returned : %d",x);
			
			do
			{	
				arr[x]++;
				x = ret_duplicate(arr,n);
			}while(x!=-1);
			
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum=arr[i]+sum;	
			}

			System.out.printf("\nSum : %d",sum);	
		}
	}
			