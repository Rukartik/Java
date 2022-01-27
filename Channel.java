import java.util.*;
class Channel implements Comparable
{
	String name;
	double price;

	Channel(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public int compareTo(Object o) 
		{
			Channel cc=(Channel)o;
			return (int)(this.price-cc.price);
		}
}

class RegionalPack implements Comparable
{
	String name;
	double price;

	RegionalPack(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) 
		{
			RegionalPack rr=(RegionalPack)o;
			return (int)(this.price-rr.price);
		}
}

class TataSky
{
	String name = "Nobita";
	long contact_no = 34566789;
	String dob = "18/12/2021";
	String gender = "Both";
	String mail_id = "My id is my id none of your id";
	int tataSky_id = 899774411;
	double balalnce = 1.00;

	TreeSet <Channel> hc = new TreeSet<>();
	TreeSet <RegionalPack> hp =new TreeSet<>();

	Scanner s = new Scanner(System.in);

	/*public int compareTo(Object o1)
	{
		Channel i1 =(Channel)o1;
		return String this.name-i1.name double this.price-i1.price;
	}

	public int compareTo(Object o2)
	{
		Channel i2 =(Channel)o2;
		return String this.name-i2.name double this.price-i2.price;
	}*/

	public void modifyPack()
	{
		System.out.println("***************************");
		System.out.println("1. Add channel pack");
		System.out.println("2. Add regional pack");
		System.out.println("3. Remove channel");
		System.out.println("4. Remove regional pack");
		System.out.println("***************************");

		 int a=s.nextInt();
		   
		  switch(a)
			  {
				case 1 : addChannel();
				break;

				case 2 : addRegionalPack();
				break;

				case 3 : removeChannel();
				break;
		   
				case 4 :removeRegionalPack();
			}
	}

	public void addChannel()
	{ 
		boolean flag = true;

		do
		{
			System.out.println("***************************");
			System.out.println("Choose the channel you want to add:\n");
			System.out.println("1. Star Plus");
			System.out.println("2. Sony");
			System.out.println("3. Zee Tv");
			System.out.println("4. Exit");
			System.out.println("***************************");

			int b = s.nextInt();
	

			switch (b)
				{
					case 1: hc.add(new Channel("Star Plus", +21.0));
					break;

					case 2: hc.add(new Channel("Sony", +29.0));
					break;

					case 3: hc.add(new Channel("Zee tv", +18.0));
					break;

					case 4: flag = false;

					default  :System.out.println("Please add the valid channel");
		
				}
		}
		while(flag);

	}

	public void addRegionalPack()
	{
		boolean flag1 = true;
		do
		{
			System.out.println("***************************");
			System.out.println("Add the Regional Pack:\n");
			System.out.println("1. Hindi Pack");
			System.out.println("2. Kannada Pack");
			System.out.println("3. Marathi Pack");
			System.out.println("4. Exit");
			System.out.println("***************************");

			int c = s.nextInt();

			switch (c)
			{
				case 1: hp.add(new RegionalPack("Hindi Pack", 355.00));
				break;

				case 2: hp.add(new RegionalPack("Kannada Pack", 300.00));
				break;

				case 3: hp.add(new RegionalPack("Marathi Pack", 299.00));
				break;

				case 4: flag1 = false;

				default  :System.out.println("Please add the valid Regional Pack\n");
		
			}
		}
		while(flag1);

	}

	public void removeChannel()
	{
		System.out.println("***************************");
		System.out.println("Select the channel to remove\n");
		System.out.println("1. Star Plus");
		System.out.println("2. Sony");
		System.out.println("3. Zee Tv");
		System.out.println("4. Exit");		
		System.out.println();

		String str=s.next();
		for(Channel ch : hc) 
			{
			  if(str==ch.name) 
				  {
					hc.remove(ch);
					System.out.println("The Channel has been removed Sucessfuly");
				  }
			}
	}



	public void removeRegionalPack()
	{
		System.out.println("***************************");
		System.out.println("Select the regional pack to remove\n");
		System.out.println("1. Hindi");
		System.out.println("2. Kannada");
		System.out.println("3. Marathi");
		System.out.println("4. Exit");
		System.out.println("***************************");

		 String str=s.next(); 
		  for(RegionalPack rp : hp) 
			  {
				if(str==rp.name) 
					{
						hp.remove(rp);
						System.out.println("The RegionalPack is Removed Sucessfuly\n");
					}
			}
	}

	public void myAccount()
	{
		System.out.println("***************************************************");
		System.out.println("******************MY ACCOUNT**************************");
    	System.out.println("name          : "+this.name);
    	System.out.println("Date of birth : "+this.dob);
    	System.out.println("Gender        : "+this.gender);
    	System.out.println("ContactNumber : "+this.contact_no);
    	System.out.println("EmailId       : "+this.mail_id);
		System.out.println();
    	System.out.println("Edit MY ACCOUNTS\n");
    	System.out.println("1.Modify Name");
    	System.out.println("2.Modify Dob");
    	System.out.println("3.Modify Contact Number");
    	System.out.println("4.Modify EmailId");
		System.out.println();
    	System.out.println("Enter your choice");
		System.out.println();
		
    	int d=s.nextInt();
    	switch(d) 
			{
    			case 1 :
					{
    					System.out.println("Enter your name to update\n");
    					String str =s.next();
    					 setName(str);
    					 break;
    				}

    			case 2 :
					{
    					System.out.println("Enter your Contact number to update\n");
						long l=s.nextLong();
						setContact_no(l);
						break;
    				}

    			case 3 :
    				{
    					System.out.println("enter the  new dateofbirth\n");
						String l=s.next();
						setDob(l);
						break;
    				}

    			case 4 :
    				{
    					System.out.println("enter the  new EmailId\n");
						String l=s.next();
						setMail_id(l);
						break;
    				}
    	
    		}
		
	}

	public void setName(String name) 
		{
			System.out.println("Name has been updated sucessfully\n");
			this.name = name;
		}

	public void setContact_no(long contact_no) 
		{
			System.out.println("Contact number has been updated sucessfully\n");
			this.contact_no = contact_no;
		}

	public void setDob(String dof) 
		{
			System.out.println("DOB has been updated sucessfully\n");
			this.dob = dob;
		}

	public void setMail_id(String mail_id) 
		{
			System.out.println("Mail has been updated sucessfully\n");
			this.mail_id = mail_id;
		}
	
	public void recharge() 
		{
			double sum = 0;

			for(Channel ch : hc) 
				{
					sum += ch.price;
				}

			for(RegionalPack rp : hp) 
				{
					sum += rp.price;
				}
			
			System.out.println("***************************************************");
			System.out.println("The Total Amount for the Channels & RegionalPack = "+sum);
			System.out.println();
			System.out.println("Eneter the Amount to rechagre\n");

			if(sum==s.nextDouble()) 
				{
					System.out.println("The Recharege is Sucessfuly Done\n");
				}
		}
}


class Driver
	{

		public static void main(String[] args) 
			{
				Scanner sa=new Scanner(System.in);
				TataSky a1=new TataSky();

				boolean flag = true;
				System.out.println("\n!!!!!!!!!!!!!!! WELCOME TO TATASKY !!!!!!!!!!!!!!!!!!!\n");
				System.out.println("*************Isko Laga Dala Toh Life Jhinga-lala*******************\n");

				System.out.println("1.Enter the Name");
				a1.name=sa.next();
				System.out.println();
				System.out.println("2.Enter the Contact Number");
				a1.contact_no=sa.nextLong();
				System.out.println();
				System.out.println("3. Date of Birth");
				a1.dob=sa.next();
				System.out.println();
				System.out.println("4. Gender");
				a1.gender=sa.next();
				System.out.println();
				System.out.println("5. Mail Id");
				a1.mail_id=sa.next();
				System.out.println();
				System.out.println("6.Tata Sky Id");
				a1.tataSky_id=sa.nextInt();
				System.out.println();
				
				do
				{
					System.out.println("***********Welocme**********");
					System.out.println("1.Modify Pack");
					System.out.println("2.My Account");
					System.out.println("3.Recharge");
					System.out.println("4.Exit");
					System.out.println();
		
					int e=sa.nextInt();
					switch(e) 
						{
							case 1:a1.modifyPack();
							break;
		
							case 2 :a1.myAccount();
							break;
							
							case 3 :a1.recharge();
							break;
							
							case 4 :flag = false;
						}
				}while(flag);

				System.out.println("!!!!!!!!!!!!!!!!!!!! THANK YOU !!!!!!!!!!!!!!!!!!!!");
	}

}
