import java.util.*;
import java.io.*;

class  OSSerial implements Serializable
{
	int id;
	String name;
	double salary;

	OSSerial(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
	

	public static void main(String[] args) throws Exception
	{
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\1234.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		

		OSSerial os = new OSSerial(1, "Kartik", 20000.00);
		System.out.println("\nSerialization is done\n");
		o.writeObject(os);

		System.out.println("Scucessfully stored\n");
		o.close();

		FileInputStream f1 = new FileInputStream("C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\java\\1234.txt");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		System.out.println(o1.readObject());
		o1.close();

	}
}
