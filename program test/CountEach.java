import java.util.*;
class CountEachString
{
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to get its count\n");
		String str = s.next().toLowerCase().trim();
		char[]ch = str.toCharArray();

		for (int i=0; i<ch.length; i++)
		{
			int count = 1;
			if(ch[i] ==0) continue;
			{
				for (int j=i+1; j<ch.length; j++)
				{
					if (ch[i] == ch[j])
					{
						count++;
						ch[j] = 0;
					}
				}
			}

			System.out.println("The count of each char " +ch[i]+ " is: " +count);
		}

	}
}