class Shape
{
}

class Circle extends Shape
{
	int radius;

	Circle(int radius)
	{
		this.radius = radius;
	}
	@Override

	public String toString()
	{
		return "radius:" +radius;
	}
}

class Rectangle extends Shape
{
	int length;
	int breath;

	Rectangle(int length, int breath)
	{
		this.length=length;
		//this.breath=breath;
	}
	@Override

	public String toString()
	{
		return "length:" +length;
		//return "breath:" +breath;
	}

}

class Driver
{
	public static void main(String[] args)
	{
		Circle c = new Circle(10);
		System.out.println(c);

		Rectangle r = new Rectangle(100,200);
		System.out.println(r);
	}

}