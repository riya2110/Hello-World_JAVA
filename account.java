import java.util.Scanner;

class account
	{
		int acc_no;
		int bal;

			void set_accno(int ac)
			{
				acc_no=ac;
			}
			
		 	void set_bal(int b)
			{
				bal=b;
			}

			int get_accno()
			{
				return acc_no;
			}

			int get_bal()
			{
				if(bal<500)
				return 0;

				return bal;
			}

			int deposit(int d)
			{
				return (bal+d);
			}

			int withdraw(int w)
			{
				if((bal-w)<500)
				return 0;
	
				else
				return (bal-w);
			}

	
			public static void main(String[] args)
			{
				account ac1=new account();

				int acno,balance;
				
				Scanner sc=new Scanner(System.in);
			
				System.out.print("Enter Acc no : ");
				int ac=sc.nextInt();
				ac1.set_accno(ac);
				acno=ac1.get_accno();

				System.out.print("\n First Deposit : ");
				int dep=sc.nextInt();

				while(dep<500)
				{
					System.out.print("\nInsufficient Deposit(min Rs500) !! \nEnter amount again : ");
					dep=sc.nextInt();
				}
				ac1.set_bal(dep);
				balance=ac1.get_bal();
				
				int s;
				
				do
				{
					int c,d,w;
					
					System.out.println("\n\nFor more transactions : \n Enter 1 for deposit.\n Enter 2 for withdrawl. \n Enter 3 to chk balance.\n ");
					c=sc.nextInt();
				
					if(c==1)
					{
						System.out.print("Enter deposit amount : ");
						d=sc.nextInt();
						balance=ac1.deposit(d);	
						ac1.set_bal(balance);
					}
					if(c==2)
					{
						System.out.print("Enter withdrawl amount : ");
						w=sc.nextInt();
						
						if(ac1.withdraw(w)==0)				
						{
							System.out.print("\n Insuffecient balance in your account !!");
						}
						else 
						{
							balance=ac1.withdraw(w);
							ac1.set_bal(balance);
						}						
					}

					if(c==3)
					{
						System.out.printf("\n Balance : %d",balance);
					}

					
				
					System.out.print("\n\nWant to do more transactions ??(y(1)/n(0))");
					s=sc.nextInt();
				}while(s==1);
			
			}
		};
				
				
				

				
			
	
		

		