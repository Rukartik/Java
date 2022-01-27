class Account 
{
	private long acc_no;
	private String ifsc;

	public void setacc_no(long accc_no)
	{
		this.acc_no = acc_no;
	}

	public void setifsc(String ifsc)
	{
		this.acc_no = acc_no;
	}

	 public void setifsc(String ifsc)
	{
		 this.ifsc = ifsc;
	}

	public long getacc_no()
	{
		return acc_no;
	}

	public String getifsc()
	{
		return ifsc;
	}

	Account(long acc_no, String ifsc)
	{
		this.acc_no = acc_no;
		this.ifsc = ifsc;
	}

	public String toString()
	{
		return "Account Number:" +acc_no;
	}

	public boolean equals(Object o)
	{
		Account a = (Account) o;

		if (this.acc_no == acc_no)
			return true;
		else
			return false;
	}

	public int hashCode()
	{
		return acc_no;
	}
}

class SavingAccount extends Account
{
	private double balance;

	public void dispalayAttributes()
	{
		System.out.println("The remaing balance is:" +balance);
	}

	public void set
}