import java.util.*;
import java.io.*;

class string_count
	{
		public static void main(String[] args)
		{
			String s1;
			
			Scanner sc = new Scanner(System.in);
			
			s1 = sc.nextLine();
			
			int n = s1.length();
			int index=0;
			
			String str_arr[]=s1.split(" ");
			int n1=str_arr.length;

			int j,k,x,sum;
			int size;
			for(int i=0;i<n1;i++)
			{
				System.out.println(str_arr[i]);
			}
			int size2;
			for(int i=0;i<n1;i++)
			{	sum=0;
				size=str_arr[i].length();
				if(size%2==0)
				{
					size2=size-1;
				}
				else
				size2=size;
				for(j=0;j<=(size2/2);j++)
				{
					if(j==((size-1)-j))
					{
						x=str_arr[i].charAt(j)-64;						
					}
					else 
					{
						x=str_arr[i].charAt(j)-str_arr[i].charAt((size-1)-j);
					}

					sum=sum+x;
				}
				System.out.print(sum);
	
			}

			
		}
	}
				
			