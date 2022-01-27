import java.io.*;
import java.util.*;

public class OutputStream1
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the scentance");

		String str = s.nextLine();

		FileOutputStream n = new FileOutputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\kartik.txt");

		for(int i=0; i<str.length(); i++)
		{
			n.write(str.charAt(i));
		}
		n.close();

		System.out.println("File has been created succcesfully and the sectence has been added to the file");
	}

}







