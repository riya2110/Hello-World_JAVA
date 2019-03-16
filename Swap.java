import java.util.*;

class Swap
{
	static int swap_func(int a,int b)	
	{
		return a;
	}

	public static void main(String[] args)
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();

		
		a=swap_func(b,b=a);

		System.out.println(a+" "+b);
		
	}
}
	