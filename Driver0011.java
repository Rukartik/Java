//UpCasting & DownCasting
class Fruit  
{
	String name = "Apple";
	
}
class Vegetable extends Fruit
{
	String name = "Pundi-Pallya";
	
}

class Driver0011
{
	public static void main(String[] args) 
	{
		Fruit f = new Fruit();
		Vegetable v = new Vegetable();

		Fruit f1 = new Vegetable();
		Vegetable v1 = (Vegetable)new Fruit();

		//System.out.println(f.name);
		//System.out.println(v.name);

	}
}
