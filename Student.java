class Student
{
		String sname;
		int sid;


	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.sname = "Kishore";
		s1.sid = 01;

		s2.sname = "Bhag";
		s2.sid = 02;

		System.out.println("Details of student 1 is :\n");
		System.out.println("Name :" +s1.sname);
		System.out.println("Id :" +s1.sid);


		System.out.println("\n Details of student 2 is: \n" +s2.sname +"\n" +s2.sid);
	}
}
