import java.util.Scanner;

class string_minMax
	{
		public static void main(String[] args)
		{
			String s,s1[];
			s1=new String[20];
			Scanner sc = new Scanner(System.in);

			s=sc.nextLine();

			int size=s.length();

			int j=0;
			for(int i=0;i<size-2;i++)
			{
				s1[j]=s.substring(i,i+3);
				System.out.printf("\n%s",s1[j]);
				j++;
			}

			String min,max;
			min=s1[0];
			max=s1[0];

			for(int i=0;i<j;i++)
			{
				if(s1[i].compareTo(max)>0)
				{
					max=s1[i];
				}
				if(s1[i].compareTo(min)<0)
				{
					min=s1[i];
				}	
			}
			System.out.printf("\nMaximum : %s \n Minimum : %s",max,min);	
		}
	}
						