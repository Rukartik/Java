//wajp to sort elements in the array in asc and dsc
class SortAD 
{
	public static void main(String[] args) 
	{
		int a[] = new int [] {20,10,40,30,50};
		int temp = 0;

		System.out.println("Array Stored values are:");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

		for (int i=0; i<a.length;i++ )
		{
			for (int j=i; j<a.length; j++)
			{
				//if (a[i] > a[j]) //asc
				if (a[i] < a[j]) //dsc
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		//System.out.println("Sorted array in ascending order");		
		System.out.println("Sorted array in descending order");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}
}
