import java.util.Scanner;

class string_extract
	{
		public static void main(String[] args)
		{
			String s1,s2;
			String s[];
			s = new String[10];

			Scanner sc = new Scanner(System.in);
			
			s1=sc.nextLine();
			s2=sc.nextLine();

			int l1=s1.length();
			int l2=s2.length();

			int i=0,j,k,l,n=0,m=0;
			

			while(i<l1)
			{
				j=0;
				while(j<l2)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						k=i;
						l=j;
						 m=0;
						while(((k<l1)&&(l<l2))&&(s1.charAt(k)==s2.charAt(l)))
						{
							m++;
							k++;
							l++;
						}
						if(m>0)
						{
							s[n]=s2.substring(j,j+m);
							System.out.printf("\n%s",s[n]);
							n++;
						}
					}
					
					j++;
					
				}
				i++;
			}
			int max=s[0].length();
			String ans=" ";
			for(int x=0;x<n;x++)
			{
				if(s[x].length()>max)
				{
					ans=s[x];
					max=s[x].length();					

				}
			}

			System.out.printf("\n\nLargest common Substring : %s \n",ans);
						
		}
	}

				