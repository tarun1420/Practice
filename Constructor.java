package com;

public class Constructor {

	int emp_id;
	String emp_name;
	int sal;

	Constructor(int id, String name)
	{
		emp_id=id;
		emp_name=name;
		
	}
	Constructor(int id, String name, int salary)
	{	
		this.emp_id=id;
		this.emp_name=name;
		this.sal=salary;
		
	}
	void display()
	{
		System.out.println(emp_id+" "+emp_name+" "+sal);
	}
	

	public static void main(String[] args) {
		
		Constructor c=new Constructor(211,"Ravi");
		Constructor c1=new Constructor(212,"jagan",22000);
		c.display();
		c1.display();
	}

}
