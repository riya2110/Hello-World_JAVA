import java.util.*;

class stack
{
	public static void main(String[] args)
	{
		Stack<Integer>s = new Stack<Integer>();
		int size,num,min=0;
		int max=0;
		Scanner sc = new Scanner(System.in);
		
		size = sc.nextInt();

		for(int i=0;i<size;i++)
		{
			num = sc.nextInt();
			s.push(num);
			min=num;
		}

		for(int i=0;i<size;i++)
		{
			if(s.peek()<min)
			min = s.peek();

			if(s.peek()>max)
			max = s.peek();

			s.pop();
		}

		System.out.printf("Largest : "+max+" ");
		System.out.printf("Smallest : "+min);
	}
}			