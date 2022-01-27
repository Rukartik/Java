//Method Overriding
class AppV1
{
	public void feature1()
	{
		System.out.println("Oldest");
	}
}

class AppV2 extends AppV1
{
	public void feature2()
	{
		System.out.println("New Feature");
	}

	public void feature1()
	{
		System.out.println("Updated Feature");
	}

}

class MethodOverrinding
{
	public static void main(String[] args)
	{
		AppV1 app = new AppV2();
		app.feature1();
	}
}