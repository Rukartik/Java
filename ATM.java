//Advantages of gettre & setter method
import java.util.Scanner;
class ATM
{
	private long account_no=123456789;
	private double balance=0.0;
	private int password=1234;
	private String account_holder_name = "Rara-Sara-Sara-Rara";

	public void addbalance(double balance)
	{
		if ((balance%100==0) || (balance%500==0) || (balance%2000==0))
		{
			this.balance=this.balance+balance;
		}
		else 
		{
			System.out.println("Enter the valid amount in multiples of 100, 500 and 2000");
		}
}

	public double checkbalance()
	{
		System.out.println("Remaining Balance is :" +balance);
		return balance;
		
	}


	public double withdraw(double amount)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password:\n");
		int password = s.nextInt();
		if (this.password==password)
		{
			if (amount<balance)
			{
				balance = balance - amount;
				System.out.println("\nsuccessfully withdrawn \n" +amount);
			}
			else
			{
				System.out.println("\ninsufficeint balnace");
			}
		}
		else 
		{
			System.out.println("\nInvalid passsword. \n Please enter Valid password!");
		}
		return amount;
	}

	public long getaccount_no()
	{
		return account_no;
	}

	public void setaccount_holder_name(String name)
	{
		account_holder_name=name;
	}

	public static void main(String[] args)
	{
		ATM a = new ATM();
		boolean flag = true;
		do
		{

		System.out.println("*=====*=====*=====*");
		System.out.println("1. Deposite Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("*=====*=====*=====*");
		System.out.println("\n SELECT YOUR OPTION");

		Scanner s2 = new Scanner(System.in);
		int a1 = s2.nextInt();

		switch (a1)
		{
		case 1:
			{
				System.out.println("Enter the amount to be deposite\n");
				int b = s2.nextInt();
				a.addbalance(b);
			}
			break;

			case 2:
			{
				System.out.println("Enter  the amount to be withdraw\n");
				int c = s2.nextInt();
				a.withdraw(c);
			}
			break;

			case 3:
			{
				
				a.checkbalance();
			}
			break;

			case 4:
			{
				flag=false;
			}
		}
		}while(flag == true);
		

	}
}