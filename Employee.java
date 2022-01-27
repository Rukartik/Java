class  Employee
{
	int eid;
	String name;
	double salary;

	public void toSetAttributes(int eid, String name, double salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public void toPrintAttributes()
	{
		System.out.println("\n Employee ID:" +eid);
		System.out.println("\n Employee Name:" +name);
		System.out.println("\n Employee Salary:" +salary);
	}


	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.toSetAttributes(1,"KARTIK" , 500000);
		e2.toSetAttributes(2,"SHET" , 600000);
		e3.toSetAttributes(3,"KULDEEP" , 700000);

		e1.toPrintAttributes();
		System.out.println("============================");
		e2.toPrintAttributes();
		System.out.println("============================");2
		e3.toPrintAttributes();


	}
}
