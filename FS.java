class FS 
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int n3, count;

		System.out.println(n1+ "\n" +n2);
		int n;
		while (count < n)
		{
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			count++;
		}
	}
}
