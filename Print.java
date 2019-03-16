import java.util.Scanner;

class Print
	{
		int n1=1,n2=2,n3=3,n4=4;
		
		void dispNum()
		{
			System.out.println(n1+" "+n2+" "+n3+" "+n4);
			System.out.print(n1+" "+n2+" "+n3+" "+n4);
			System.out.printf("\n%d %d %d %d",n1,n2,n3,n4);
		}
		
		public static void main(String[] args)
		{
			Print p = new Print();
			p.dispNum();
		}
};
 