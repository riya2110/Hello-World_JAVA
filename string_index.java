import java.util.Scanner;

class string_index
	{
		public static void main(String[] args)
		{
		
		String s[];
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("\nEnter size of String array : ");
		size=sc.nextInt();

		s = new String[size];

		for(int i=0;i<size;i++)
		{
			s[i]=sc.next();
		}

		String chk;
		
		System.out.print("\nEnter string to chk its index in the given string array : ");
		chk=sc.next();
	
		int index=0;
		for(int i=0;i<size;i++)
		{
			if(s[i].equals(chk))
			{
				index=i;
				break;
			}
		}

		System.out.printf("\nIndex : %d",index);
		}
}
		