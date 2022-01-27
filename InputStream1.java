import java.io.*;
import java.util.*;

public class InputStream1
{
	public static void main(String[] args) throws Exception //IOException, FileNotFoundException
	{
		

		FileInputStream n = new FileInputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\kartik.txt");

		int a = n.read();
		while((a)!= -1)
		{
			System.out.print((char)a);

			a=n.read();
		}
		n.close();

		System.out.println("\n \nPrinted all the data present in the file!!");

		//System.out.println("File has been created succcesfully and the sectence has been added to the file");
	}

}







