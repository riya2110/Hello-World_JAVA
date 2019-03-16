import java.util.Scanner;

interface area
{
	int sArea();
	double cArea();
}
	
	class SquareArea implements Area
	{
		int s;
	
		SquareArea(int s)
		{
			this.s=s;
		}
		public int sArea()
		{
			return s*s;
		}
		public double cArea()
		{
			return 0;
		}
	}

	class CircleArea implements Area
	{
		int r;
		CircleArea()
		{
			this.r=r;
		}
		public int sArea()
		{
			return 0;
		}
		public double cArea()
		{
			return (3.14*r*r);
		}
	}

	class AreaMain
	{
		public static void main(String[] args)
		{
			Area obj;
			
			obj = new SquareArea(5);
			System.out.println("Square Area = "+obj.sArea());
			
			obj = new CircleArea(4);
			System.out.println("Circle Area = "+obj.cArea());
		}
	}