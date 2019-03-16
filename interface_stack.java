import java.util.Scanner;

interface int1
{
	void push(int num);
	void pop();
	void display();
}
class imp implements int1
{
	void display()
	{
		System.out.println("Hello ");
	}
}

class stack implements int1
{
	int top;
	int size;
	int arr[]=new int[100];

	stack()
	{
			
	}
	stack(int n)
	{
		top=-1;
		size=n;
		arr=new int[size];
	}
	public void push(int num)
	{
		if(top==size-1)
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

	void display()
	{
		int i=top;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
	}
}
	class interface_Stack
	{
		public static void main(String[] args)
		{
			stack s = new stack(4);
			imp i = new imp();
			
			i.display();

			int num;
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			
			s.display();
	
			s.pop();
			
			s.display();
		}
	}
			
			
			