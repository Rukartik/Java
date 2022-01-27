import java.util.*;
import java.io.*;

class Files extends Thread
{
	public void ReadFile()
	{	
		try
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\ludo.txt");
		int c=fi.read();
			while(c!=-1)
		{
			System.out.println((char)c);
			c=fi.read();
			Thread.sleep(1000);
		}
	}
	catch (Exception r)
	{
		System.out.println("FNF Handled");
	}
	
		
	}
		public void WriteFile(String s)
		{
			FileOutputStream fo=null;
			try
			{
				fo=new FileOutputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\ludo.txt");
			}
			catch (FileNotFoundException j)
			{
				System.out.println("FileNotFound Exception in Writefile handled");
			}
			for (int i=0;i<s.length ();i++ )
		try
		{
			fo.write(s.charAt(i));
			
			
		}
		catch (IOException y)
		{
			System.out.println("IO Exception caught");
		}
		
		try
		{
			fo.close();
		}
		catch (IOException v)
		{
			System.out.println("IOExcption caught while closing");
		}
	}
	
}
 class Driver
 {
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		Files f1=new Files();
		Files f2=new Files();

		f1.ReadFile();
		f2.WriteFile("Hello");

		f1.start();
		f2.start();

		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		
	}
}