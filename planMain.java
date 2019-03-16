import java.util.Scanner;

abstract class plan
	{
		int rate,units;
		
		abstract void getRate();
		
		int calcBill(int units)
		{
			return rate*units;
		}
	}

class commPlan extends plan
	{
		int rate;
	
		void  getRate()
		{
			cin>>rate;
		}
	}
		
		