import java.util.*;

class Channel implements Comparable {
String name;
double price;
Channel(){
}
Channel(String name,double price){
	this.name=name;
	this.price=price;
}
@Override
public int compareTo(Object o) {
	Channel r=(Channel)o;
	return (int)(this.price-r.price);
}

}


class RegionalPack implements Comparable{
	String name;
	double price;
	RegionalPack(){}
	RegionalPack(String name,double price){
	this.name=name;
	this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		RegionalPack r=(RegionalPack)o;
		return (int)(this.price-r.price);
	}
	}



  class TataSky  {
	  String name;
	  long contactNumber;
	  String dateofbirth;
	  String gender;
	  String emailId;
	  long tataSkyId;
	  double balance;
	  TreeSet <Channel>channel=new TreeSet<>();
	  TreeSet <RegionalPack>pack=new TreeSet<>();
	  Scanner sc=new Scanner(System.in);
	  public void addchanel() {
		  System.out.println("1.Gemini");
		  System.out.println("2.Tv9");
		  System.out.println("3.E tv");
		  System.out.println("4.Discovery");
		  System.out.println("5.Star Sports");
		  System.out.println("enter your choice");
		  int b=sc.nextInt();
		  switch(b) {
		  case 1 :channel.add(new Channel("Gemini",48.00));
		  break;
		  case 2 :channel.add(new Channel("Tv9",38.00));
		  break;
		  case 3 :channel.add(new Channel("E tv",58.00));
		  break;
		  case 4 :channel.add(new Channel("Discovery",75.00));
		  break;
		  case 5 :channel.add(new Channel("Star Sports",50.00));
		  break;
		  default  :System.out.println("enter the valid Channel");
		  }
	  }
	  public void addRegionalPack() {
		  System.out.println("1.Telugu");
		  System.out.println("2.English");
		  System.out.println("3.Tamil");
		  System.out.println("4.Kannada");
		  System.out.println("5.Hindi");
		  System.out.println("enter your choice");
		  int b=sc.nextInt();
		  switch(b) {
		  case 1 :pack.add(new RegionalPack("Telugu",145.00));
		  break;
		  case 2 :pack.add(new RegionalPack("English",300.00));
		  break;
		  case 3 :pack.add(new RegionalPack("Tamil",258.00));
		  break;
		  case 4 :pack.add(new RegionalPack("Kannada",175.00));
		  break;
		  case 5 :pack.add(new RegionalPack("Hindi",350.00));
		  break;
		  default  :System.out.println("enter the valid RegionalPack");
		  }
	  }
	  public void removeChannel()
	  {	 
		  System.out.println("enter the channel name");
		  String a=sc.next(); 
		  for(Channel c:channel) {
			  if(a==c.name) {
				  channel.remove(c);
				  System.out.println("The Channel is Removed Sucessfuly");
			  }
			  
		  }
	  }
	  public void removeRegionalPack() {
		  System.out.println("enter the RegionalPack name");
		  String a=sc.next(); 
		  for(RegionalPack c:pack) {
			  if(a==c.name) {
				  pack.remove(c);
				  System.out.println("The RegionalPack is Removed Sucessfuly");
			  }
		  }
	  }
		  public void modifyPack() {
	  
		  System.out.println("1.addChannel");
		  System.out.println("2.addRegionalPack");
		  System.out.println("3.removeChannel");
		  System.out.println("4.removeRegionalPack");
		   int a=sc.nextInt();
		   switch(a) {
		   case 1 : addchanel();
		   break;
		   case 2 : addRegionalPack();
		   break;
		   case 3 :removeChannel();
		   break;
		   case 4 :removeRegionalPack();
		   }
		  
	  }
    public void myAccount() {
    	System.out.println("--------------------presonal Details-------------------------");
    	System.out.println("name          : "+this.name);
    	System.out.println("Date of barth : "+this.dateofbirth);
    	System.out.println("Gender        : "+this.gender);
    	System.out.println("--------------------Contact Details-------------------------");
    	System.out.println("ContactNumber : "+this.contactNumber);
    	System.out.println("EmailId       : "+this.emailId);
    	System.out.println("If You want to Madify the Details enter the number");
    	System.out.println("1.Modify name");
    	System.out.println("2.Modify Date of barth");
    	System.out.println("3.Modify ContactNumber");
    	System.out.println("4.Modify EmailId");
    	System.out.println("enter the choice");
    	int a=sc.nextInt();
    	switch(a) {
    	case 1 :{
    		     System.out.println("enter the new Name");
    		     String s=sc.next();
    		     setName(s);
    		     break;
    	}
    	case 2 :{
    		System.out.println("enter the  new ContactNumbe ");
		     long l=sc.nextLong();
		     setContactNumber(l);
		     break;
    	}
    	case 3 :
    	{
    		System.out.println("enter the  new dateofbirth ");
		     String l=sc.next();
		     setDateofbirth(l);
		     break;
    	}
    	case 4 :
    	{
    		System.out.println("enter the  new EmailId ");
		     String l=sc.next();
		     setEmailId(l);
		     break;
    	}
    	
    	}
    	
    	
    }
    
	public void setName(String name) {
		System.out.println("The Name is Sucessfully Updated");
		this.name = name;
	}
	public void setContactNumber(long contactNumber) {
		System.out.println("The ContactNumbe is Sucessfully Updated");
		this.contactNumber = contactNumber;
	}
	public void setDateofbirth(String dateofbirth) {
		System.out.println("The dateofbirth is Sucessfully Updated");
		this.dateofbirth = dateofbirth;
	}
	public void setEmailId(String emailId) {
		System.out.println("The EmailId is Sucessfully Updated");
		this.emailId = emailId;
	}
	
	public void recharge() {
		double sum =0;
		for(Channel c:channel) {
			sum=sum+c.price;
		}
		for(RegionalPack r:pack) {
			sum=sum+r.price;
		}
		System.out.println("The total Amount for the Channels &RegionalPack ="+sum);
		System.out.println("eneter the Amount to recharge");
		if(sum==sc.nextDouble()) {
			System.out.println("The Recharege is Sucessfuly Done");
		}
	}
	

}










public class Driver18 {

	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		TataSky a=new TataSky();
		boolean fa=true;
		System.out.println("****Welcome To Tata Sky*****");
		System.out.println("1.Enter The Name");
		a.name=sa.next();
		System.out.println("2.Enter the contactNumber");
		a.contactNumber=sa.nextLong();
		System.out.println("3.Date of Barth");
		a.dateofbirth=sa.next();
		System.out.println("4.Gender");
		a.gender=sa.next();
		System.out.println("5.EmailId");
		a.emailId=sa.next();
		System.out.println("6.tataSkyId");
		a.tataSkyId=sa.nextLong();
		do {
		System.out.println("****Welocme****");
		System.out.println("1.Modify Pack");
		System.out.println("2.My Account");
		System.out.println("3.Recharge");
		System.out.println("4.exit");
		int c=sa.nextInt();
		switch(c) {
		case 1:a.modifyPack();
		break;
		case 2 :a.myAccount();
		break;
		case 3 :a.recharge();
		break;
		case 4 :fa=false;
		}
		}while(fa);
		System.out.println("******Thank You*********");

	}

}