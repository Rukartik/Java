class SavingAccount 
{
	long account_no;
	String name;
	double balance;

	SavingAccount(long account_no, String name, double balance)
	{
		this .account_no=account_no;
		this.name=name;
		this.balance=balance;
	}
	@Override

	public String toString()
	{
		return "account_no:" +account_no;
	}
	/*
	public String toString()
	{
		return "name:" +name;
	}
	
	public String toString()
	{
		return "balance:" +balance;
	}*/


	public static void main(String[] args) 
	{
		SavingAccount sa = new SavingAccount(123456789, "Kartik", 10000.00);
		System.out.println(sa);
	}
}
