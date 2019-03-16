import java.util.Scanner;

class product
{	
	int n1,n2,n3,res;

	void getIn()
	{
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
	}

	void prod()
	{
		res=n1*n2*n3;
		System.out.print("Product : ");
		System.out.print(res);
	}

	
	public static void main(String[] args)
	{
		product p = new product();
		p.getIn();
		p.prod();
	}

};