import java.util.Scanner;
import java.util.*;
class Celcius
{	
	double f,c;

	void getIn()
	{
		System.out.print("Enter value in Farhenite : ");
		Scanner sc = new Scanner(System.in);
		f=sc.nextFloat();
		
	}

	void convertC()
	{
		c=((5.0/9.0)*(f-32.0));
		System.out.print("Celcius : ");
		System.out.printf("%f",c);
	}

	
	public static void main(String[] args)
	{
		Celcius C = new Celcius();
		C.getIn();
		C.convertC();
	}

};