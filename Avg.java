import java.util.Scanner;

class Avg
	{
		double avg,sum=0;

		double average(double arr[],int n)
		{
			for(int i=0;i<n;i++)
			{
				sum=sum+arr[i];
			}
			
			avg=sum/n;
			return avg;
		}
			
		public static void main(String[] args)
		{
			Avg a = new Avg();
			double grades[];
			int i;
			grades = new double[20];
			Scanner sc=new Scanner(System.in);

			for( i=0;i<20;i++)
			{
				grades[i]=sc.nextDouble();
				if(grades[i]==-1)
				break;
			}

			System.out.printf("%.2f",a.average(grades,i));

		}
	};



			