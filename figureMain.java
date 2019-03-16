import java.util.Scanner;

abstract class figure
	{
		int l,b;

		figure(int l,int b)
		{
			this.l=l;
			this.b=b;
		}
		abstract int area();
	}

class rect extends figure
	{
		rect(int l,int b)
		{	
			super(l,b);
		}
		
		int area()
		{	
			return (l*b);
		}
	}

class tri extends figure
	{
		tri(int l,int b)
		{
			super(l,b);
		}

		int area()
		{
			return (l*b)/2;
		}
	}

class figureMain
	{
		public static void main(String[] args)
		{
			figure f1=new rect(5,6);
			
			System.out.println("Area of rectangle "+f1.area());
			
			figure f2=new tri(8,10);
	
			System.out.println("Area of Triangle "+f2.area());
		}
	}
		
		