import java.util.Scanner;

class arrayPrint
	{
		public static void main(String[] args)
		{
			int count[]={0,0,0,0,0,0,0,0,0,0};
			
			int bonus[];
			bonus = new int[15];

			for(int i=0;i<15;i++)
			{
				bonus[i]=+1;
			}

			int bestScores[]={10,20,30,40,50};

			for(int i=0;i<5;i++)
			{
				System.out.printf("\n%d",bestScores[i]);
			}
		}
	};


			