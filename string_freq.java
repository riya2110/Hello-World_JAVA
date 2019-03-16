import java.util.Scanner;

class string_freq
	{
		public static void main(String[] args)
		{
		String s[];
		Scanner sc = new Scanner(System.in);
		
		String chk,str;
		
		System.out.print("\nEnter string : ");
		chk=sc.nextLine();
	
		int freq=1*,size,i=0;
		size=chk.length();

		while(i<size)
		{	
			if(chk.charAt(i)==' ')
			{
				freq++;
			}
			i++;
		}
		System.out.print(freq);
		}
		
	}
		