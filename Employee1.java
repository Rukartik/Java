import java.util.*;
class Employee1 implements Comparable
{
	int eid;
	double salary;
	String name;

	Employee1(int eid, String name, double salary)
	{
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}

	public void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public int compareTo(Object o)
	{
		Employee1 e = (Employee1) o;
		if(this.salary>e.salary)
			return +1;

		else if (this.salary < e.salary)
		{
			return -1;
		}
		else
			return 0;
	}

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(new Employee1(101, "Pikachu", 10000));
		a.add(new Employee1(102, "Doremon", 20000));
		a.add(new Employee1(103, "Hatori", 30000));
		
		Collections.sort(a);
		System.out.println(a);

		for(Object o : a)
		{
			Employee1 e = (Employee1) o;
			
			e.display();
			System.out.println("===============================");
			//((Employee1)o).display();
		}
	}
}
