import java.util.Scanner;

class stack 
{
	int top;
	//int size;
	int arr[];

	stack(int n)
	{
		top=-1;	
		//size=n;
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
}
	
class thread_stack
	{
		public static void main(String[] args)
		{
			stack s = new stack(5);
			
			int c;
			int ch;
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.println("1.Push.\n2.Pop.\n3.Peep.\n4.Display.\n5.Exit\nEnter Choice : ");
				c = sc.nextInt();

				switch(c)
				{
					case 1:
					{
						int x;
						x=sc.nextInt();
						s.push(x);
						break;
					}
					case 2:
					{
						s.pop();
						break;
					}
					case 3:
					{
						System.out.println(s.peep());
						break;
					}
					case 4:
					{
						s.display();
						break;
					}
					case 5:
					{
						break;
					}
					default:{}
				}
			
				System.out.println("Wanna Continue(1/0)?");
				
				ch=sc.nextInt();
			}while(ch==1); 

			
			
		}
	}
			
			
			