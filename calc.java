import java.util.Scanner;
class calc
{
	int num1,num2,res;

	void getInput()
	{
		Scanner sc= new Scanner(System.in);
		num1=sc.nextInt();

		num2=sc.nextInt();
	}

	void addNum()
	{
		res=num1+num2;
		System.out.print("Sum : ");
		System.out.println(res);
	}

	void subNum()
	{
		res=num1-num2;
		System.out.print("Sub : ");
		System.out.println(res);
	}

	void multNum()
	{
		res=num1*num2;
		System.out.print("Mult : ");
		System.out.println(res);
	}

	void divNum()
	{
		res=num1/num2;
		System.out.print("Div : ");
		System.out.println(res);
	}


public static void main(String args[])
{
	calc c= new calc();

	c.getInput();
	c.addNum();
	c.subNum();
	c.multNum();
	c.divNum();

}
};
