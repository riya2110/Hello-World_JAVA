import java.util.Scanner;

class stack 
{
	int top;
	//int size;
	int arr[];

	stack(int n)
	{
		top=-1;	
		arr=new int[n];
	}
	public void push(int num)
	{
		//System.out.println(top);
		if(top==arr.length)
		{
			System.out.println("Overflow!!");
		}

		else
		{
			top++;
			arr[top]=num;
		}
	}

	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			top--;
		}
	}
	
	int peep()	
	{
		return arr[top];
	}

	void display()
	{
		int i=top;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
	}

	int isEmpty()
	{
		if(top==-1)
		return 1;
		return 0;
	}

	int matchingBraces(String s)
	{
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
			{
				push(s.charAt(i));
			}
			if(s.charAt(i)-peep()==1||s.charAt(i)-peep()==2)
			{	
				pop();
			}
			
		}

		if(isEmpty()==1)
		return 1;
		return 0;
	}
}

class Stack_match
{
	public static void main(String[] args)
	{
		
		String str;
		Scanner sc = new Scanner(System.in);

		str=sc.nextLine();
		int len=str.length();
		stack s=new stack(len);
		if(s.matchingBraces(str)==1)
		System.out.println("Balanced");
		else
		System.out.println("Imbalanced");
	}
}
		