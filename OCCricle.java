class OCCricle 
{
	int radius;
	OCCricle(int radius)
	{
		this.radius = radius;
	}
	@Override
	public String toString()
	{
		return "radius :" +radius;
	}

	public static void main(String[] args) 
	{
		OCCricle c = new OCCricle(5);
		System.out.println(c);
	}
}
