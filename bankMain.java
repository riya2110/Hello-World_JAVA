import java.util.Scanner;

abstract class bank
	{
		int amt;
		int time;
	
		bank(int a,int t)	
		{
			amt=a;
			time=t;
		}
		
		abstract double interest();
	}

class sbi extends bank
	{
		float rate;

		sbi(int a,int t,float r)
		{
			super(a,t);
			rate=r;
		}

		double interest()
		{
			return (amt*time*rate);
		}
	}

class pnb extends bank
	{
		float rate;
	
		pnb(int a,int t,float r)
		{
			super(a,t);
			rate=r;
		}

		double interest()
		{
			return (amt*time*rate);
		}
	}

class bankMain
	{
		public static void main(String[] args)
		{
			bank b1 = new sbi(1000,2,3);
			System.out.println("Simple Interest - SBI : "+b1.interest());

			bank b2 = new pnb(1000,2,4);
			System.out.println("Simple Interest - PNB : "+b2.interest());
		}
	}