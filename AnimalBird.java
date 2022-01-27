// animal & bird (add to cart)
import java.util.Scanner;
class Animal
{
	public Dog addDog()
	{
		Dog d = new Dog();
		return d;
	}

	public Cat addCat()
	{
		Cat c = new Cat();
		return c;
	}
}

class Dog extends Animal
{
	double price = 10000;
	String color = "Balck";
	String age = "10 Months";
}

class Cat extends Animal 
{
	double price = 5000;
	String color = "White";
	String age = "5 Months";
}

class Bird
{
	public Parrot addParrot()
	{
		Parrot p = new Parrot();
		return p;
	}

	public Pegion addPegion()
	{
		Pegion p1 = new Pegion();
		return p1;
	}
}

class Parrot extends Bird
{
	double price = 500;
	String age = "1 Month";
}

class Pegion extends Bird
{
	double price = 1000;
	String age = "5 Month";
}

class Cart
{
	Animal a;
	Bird b;

	public void addCart()
	{
		System.out.println("1. Animal");
		System.out.println("2. Brid");
		System.out.println("Please enter your choice");
		System.out.println("*=====*=====*=====*=====*=====*\n");
		Scanner s = new Scanner(System.in);
		int a3 = s.nextInt();
		System.out.println("\n");
		switch(a3)
		{
			case 1:
			{
				a=new Animal();
				System.out.println("1. Dog");
				System.out.println("2. Cat");
				System.out.println("Please enter your your choice");
				System.out.println("*=====*=====*=====*=====*=====*\n");
				int a1 = s.nextInt();
				System.out.println("\n");
				switch(a1)
				{
					case 1: 
					{
						a=a.addDog();
						System.out.println("Dog has been added to cart");
					}
					break;
					case 2: 
					{
						a=a.addCat();
						System.out.println("Cat has been added to cart");
					}
				}
			}
			break;

			case 2:
			{
				b = new Bird();
				System.out.println("1. Parrot");
				System.out.println("2. Pegion");
				System.out.println("Please enter your choice");
				System.out.println("*=====*=====*=====*=====*=====*\n");
				int a1 = s.nextInt();
				System.out.println("\n");
				switch(a1)
				{
					case 1:
					{
						b=b.addParrot();
						System.out.println("Parrot has been added to cart");
					}
					break;
					case 2: 
					{
						b=b.addPegion();
						System.out.println("Pegion has been added to cart");
					}
				}
			}
		}
	}
	
	public void isempty()
	{
		if ((a==null) && (b==null))
		{
			System.out.println("Cart is empty");
		}

		else
		{
			System.out.println("There is some items in the cart");
		}
	}

	public void display()
	{
		if (a!=null)
		{
			if (a instanceof Dog)
			{
				Dog d = (Dog) a;
				System.out.println("*=====*=====*=====*=====*=====*\n");
				System.out.println("The details of the dog's are as follows:\n");
				System.out.println("The price of dog is:" +d.price);
				System.out.println("The color of dog is:" +d.color);
				System.out.println("The age of dog is:" +d.age);
				System.out.println("*=====*=====*=====*=====*=====*\n");
			}
			else //if (a instanceof Cat)
			{
				Cat c = (Cat) a;
				System.out.println("*=====*=====*=====*=====*=====*\n");
				System.out.println("The details of the cat's are as follows:\n");
				System.out.println("The price of cat is:" +c.price);
				System.out.println("The color of cat is:" +c.color);
				System.out.println("The age of cat is:" +c.age);
				System.out.println("*=====*=====*=====*=====*=====\n");
			}
			
		}

		else if (b!=null)
		{
			if(b instanceof Parrot)
			{
				Parrot p = (Parrot) b;
				System.out.println("*=====*=====*=====*=====*=====*\n");
				System.out.println("The details of the parrot are as follows:\n");
				System.out.println("The price of parrot is:" +p.price);
				System.out.println("The age of parrot is:" +p.age);
				System.out.println("*=====*=====*=====*=====*=====*\n");
			}

			else if(b instanceof Pegion)
			{
				Pegion p1 = (Pegion) b;
				System.out.println("*=====*=====*=====*=====*=====*\n");
				System.out.println("The details of the pegion are as follows:\n");
				System.out.println("The price of pegion is:" +p1.price);
				System.out.println("The age of pegion is:" +p1.age);
				System.out.println("*=====*=====*=====*=====*=====*\n");
			}
			else 
			{
				System.out.println("There is no item to display. Please add items to cart!");
			}
		}
	}
}

class Driver
{
	public static void main(String[] args)
	{
		Cart c = new Cart();
		boolean flag = true;
		do
		{
			System.out.println("*=====*=====*=====*=====*=====*\n");
			System.out.println("1. Add to cart");
			System.out.println("2. Is Empty");
			System.out.println("3. Display the item's present in cart");
			System.out.println("4. Exit");
			System.out.println("*=====*=====*=====*=====*=====*\n");
			Scanner s = new Scanner(System.in);
			int a=s.nextInt();
			System.out.println("\n");
			switch(a)
			{
				case 1: c.addCart();
				break;
				case 2: c.isempty();
				break;
				case 3: c.display();
				break;
				case 4: flag=false;

			}
		}
		while(flag == true);
	}
}

