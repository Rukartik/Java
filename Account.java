class Account  
{
	private String account_holder_name = "ABCD";
	private int account_no = 123456789;
	private double balance = 12345.00;

	public void getaccountDeatils()
	{
		System.out.println("Account Holder Name:" +account_holder_name);
		System.out.println("Account no:" +account_no);
		System.out.println("Balance:" +balance);

	}

	public String setaccount_holder_name(String account_holder_name)
	{
		this.account_holder_name = account_holder_name;
	}

	public int setaccount_no(int account_no)
	{
		this.account_no = account_no;
	}

	public double setbal(double balance)
	{
		this.balance = balance;
	}

}

class Branch
{
	private String Manager_name = "NIKKI MINJA";
	private String Ifsc = "SBIN00008147";
	Account a1;

	public void setManager_name(String Manager_name)
	{
		this.Manager_name = Manager_name;
	}

	public void createAccount(Account a1)
	{
		this.a1 = a1;
		a1.getaccountDeatils();
	}

	Branch(String Manager_name)
	{
		this.Manager_name = Manager_name;
	}

	public void brachAttributes()
	{
		System.out.println("Manager Name:" +Manager_name);
		System.out.println("IFSC Code:" +Ifsc);
	}
}

	class Driver00
	{
		public static void main(String[] args)
		{
			Branch b1 = new Branch();
			b1.createAccount(new Account());
		}
	}
