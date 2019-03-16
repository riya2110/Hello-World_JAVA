import java.util.Scanner;

class getSet
	{
		int roll;
		String name;
		int marks;

		void set_roll(int n)
		{
			roll=n;
		}

		void set_name(String nm)
		{
			name=nm;
		}

		void set_marks(int m)
		{
			marks=m;
		}

		int get_roll()
		{
			return roll;
		}

		String get_name()
		{
			return name;
		}
		
		int get_marks()
		{
			return marks;
		}

		public static void main(String[] args)
		{
			getSet gs = new getSet();

			Scanner sc= new Scanner(System.in);

			int rn,mrks;
			String name;

			System.out.print("Enter Roll no. : ");
			rn=sc.nextInt();

			System.out.print("Enter Name : ");
			name=sc.next();
			
			System.out.print("Enter marks : ");
			mrks = sc.nextInt();

			
			gs.set_roll(rn);
			gs.set_name(name);
			gs.set_marks(mrks);

			System.out.printf("\n%d",gs.get_roll());

			System.out.printf("\n%s",gs.get_name());

			System.out.printf("\n%s",gs.get_marks());
		}
	};

	
		

		