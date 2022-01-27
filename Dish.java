//Project billing system
import java.util.*;
public class Dish implements Comparable
{
	private int id;
	private double price;
	private String name ;
	private String description;
	public Dish(int id, double price, String name, String description) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(Object o)
	{
		Dish i =(Dish)o;
		return (int)(this.price-i.price);
	}
	
}


 class Bill
{
	private ArrayList dishes=new ArrayList();
	private int order_no;
	private String date;
	private String time;
	static double sum=0;
	Scanner s = new Scanner(System.in);
	public ArrayList getDishes() {
		return dishes;
	}
	public void setDishes(ArrayList dishes) {
		dishes = dishes;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	} 
	public void addDish()
	{
		System.out.println("1.Idly");
		System.out.println("2.Dosa");
		System.out.println("3.Puri");
		System.out.println("enter your choice");
		int a =s.nextInt();
		switch(a)
		{
		case 1 : dishes.add(new Dish(1,30,"Idly","......"));
		break;
		case 2 : dishes.add(new Dish(2,50,"Dosa",".........."));
		break;
		case 3 : dishes.add(new Dish(3,60,"Puri",".........."));
		break;
		
		
	
		}
	}
	public void removedish()
	{
		 System.out.println();
		 System.out.println("Enter the dish to be removed");
		 String str=s.next().trim();
		 Iterator i = dishes.iterator();
		 while(i.hasNext())
		{
			 Dish d=(Dish)i.next();
			 if( str.equals(d.getName()))
			{
				i.remove();
			}
		}

	}
	public void search()
	{
		System.out.println();
		System.out.println("Enter the name of the dish to be searched");
		String str=s.next().trim();
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			if( str.equals(d.getName()))
			{
				System.out.println("The dish is avilable"+dishes.indexOf(o));
			}
			else 
				System.out.println("The dish is not avilable");
				 
		 }
		
	}
	public void sortByPrice()
	{
		Collections.sort(dishes);
	}
	
	public void calculateTotal()
	{ 
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			sum+=d.getPrice();
				 
		 }
		
	}
	
	public void generatebill()
	{ if(dishes==null)
	{
		return;
	}
		System.out.println("************************");
		System.out.println("Date       :   17-12-2021");
		System.out.println("Time       :       5:00PM");
		System.out.println("-------------------------");
		System.out.println("Dish                Price");
		for(Object o :dishes)
		 {
			 Dish d=(Dish)o;
			 System.out.println(d.getName()+"                     "+d.getPrice());
			  
		 }
		System.out.println("-------------------------");
		System.out.println("Total                  "+sum);
		System.out.println("SGST                     5%");
		System.out.println("CGST                     5%");
		System.out.println("Total                  "+(sum*1.1));
		System.out.println("Total amount to be paid is Rs "+(sum*1.1)+" only");
		System.out.println("************************");
		sum=0;
		System.out.println(sum);
	}
	
}

class Driver
{
	public static void main(String[] args)
	{ Bill b = new Bill();
	Scanner s = new Scanner(System.in);
	boolean f =true;
	
	do {
		System.out.println("==============================");
		System.out.println("1.add dish");
		System.out.println("2. remove dish");
		System.out.println("3. search ");
		System.out.println("4. sort dish");
		System.out.println("5. generate bill");
		System.out.println("6. exit");
		System.out.println("==============================");
		System.out.println("Enter your choice");
		
		int a =s.nextInt();
		switch(a)
		{
		    
		case 1 : b.addDish();
		break;
		case 2 : b.removedish();
		break;
		case 3: b.search();
		break;
		case 4: b.sortByPrice();
		break;
		case 5:{b.calculateTotal();
			     b.generatebill();}
		break;
		case 6: f=false;
		
		}
	}while(f);
		
		
	}
}
