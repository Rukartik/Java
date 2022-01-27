import java.util.*;
import java.io.*;

class FileInput extends Thread
{
	public void ReadFile()
	{
		try
		{
			 FileInputStream fi = new FileInputStream("C:\\ludo.txt");	
			 int a = fi.read();
				while (a != -1)
				{
					System.out.print((char)a);
					a = fi.read();
					Thread.sleep(2000);
				}
		}
		catch (Exception r)
		{
			System.out.println("Exception Handling by Read");
		}
		
	}

		public void WriteFile(String str)
		{
			FileOutputStream fo =null;
			try
			{
				fo = new FileOutputStream("C:\\ludo.txt");
			}
			catch (FileNotFoundException e)
			{
				System.out.println("Exception Handling by Write");
			}
			for (int i=0; i<str.length(); i++)
				try
				{
						fo.write(str.charAt(i));
				
				}
					catch (IOException h)
					{
						System.out.println("handled");
					}
				
					
		}


	public static void main(String[] args) throws IOException , FileNotFoundException
	{
		FileInput f2 = new FileInput();
		f2.WriteFile("Helllo");

		FileInput f1 = new FileInput();
		f1.ReadFile();

		
	}
}