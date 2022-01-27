//Get, set , override toString() & equals() & hashcode()
class EmployeeOSEH
{
	private int id_number;
	private String emp_name;
	private double emp_salary;

	public void setid(int id_number)
	{
		this.id_number = id_number;
	}

	public void setname(String emp_name)
	{
		this.emp_name = emp_name;
	}

	public void setsalary(double emp_salary)
	{
		this.emp_salary = emp_salary;
	}

	public int getid()
	{
		return id_number;
	}

	public String getname()
	{
		return emp_name;
	}

	public double getsalary()
	{
		return emp_salary;
	}

	public void display()
	{
		System.out.println(id_number);
		System.out.println(emp_name);
		System.out.println(emp_salary);
	}

	EmployeeOSEH(int id_number, String emp_name, double emp_salary)
	{
		this.id_number = id_number;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public String toString()
	{
		//return "Employee id is:" +id_number;
		//return "Employee name is:" +emp_name;
		return "Employee salary is:" +emp_salary;
	}

	public boolean equals(Object o)
	{
		EmployeeOSEH e = (EmployeeOSEH) o;

		if (this.id_number == e.id_number)
			return true;
		else
			return false;
	}
	
	public int hashCode()
	{
		return id_number;
	}

	public static void main(String[] args)
	{
		EmployeeOSEH e1 = new EmployeeOSEH(123, "Rolando", 20000000.00);
		EmployeeOSEH e2 = e1;
		EmployeeOSEH e3 = new EmployeeOSEH(456, "Messi", 10000000.00);

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

		System.out.println(e1.hashCode()==e3.hashCode());
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}