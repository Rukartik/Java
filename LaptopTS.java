import java.util.*;
class LaptopTS implements Comparable 
{
	int id;
	double price;
	int RAM;

	LaptopTS(int id, double price, int RAM)
	{
		this.id = id;
		this.price = price;
		this.RAM = RAM;
	}

	public int compareTo(Object o)
	{
		LaptopTS l = (LaptopTS) o;
		if (this.price == l.price)
		{
			return 0;
		}
		else if (this.price > l.price)
		{
			return 1;
		}
		else
		{ 
			return -1;
		}
	}
		public void specification()
		{
			System.out.println(id);
			System.out.println(price);
			System.out.println(RAM);
			System.out.println("========================");
		}
		

		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			TreeSet t = new TreeSet();
			t.add(new LaptopTS(1,900000,4));
			t.add(new LaptopTS(2,1000000,8));
			t.add(new LaptopTS(3,700000,16));
			t.add(new LaptopTS(4,400000,8));
			t.add(new LaptopTS(5,100000,16));

			for (Object o : t)
			{
				((LaptopTS)o).specification();
			}

		}
	}

