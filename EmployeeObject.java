import java.util.*;
class Employee implements Comparable
{
	int eid;
	double salary;
	String name;

	Employee(int eid, double salary, String name)
	{
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}

	public void display()
	{
		System.out.println(eid);
		System.out.println(salary);
		System.out.println(name);
	}
	
	public int compareTo(Object o)
	{
		Employee e = (Employee) o;
		return this.salary-e.salary;
	}

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(new Employee(101, Pikachu, 10,000));
		a.add(new Employee(102, Doremon, 20,000));
		a.add(new Employee(103, Hatori, 30,000));
		
		Collections.sort(a);
		System.out.println(a);

		for(Object o : a)
		{
			Employee e = (Employee) o;
			e.display();

			((Employee)o).display();
		}
	}
}
