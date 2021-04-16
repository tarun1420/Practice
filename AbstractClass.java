package com;

abstract class AbstractClass {
	
	abstract void details();
	void method() {
		System.out.println("can have normal methods");
	}
}
	class display extends AbstractClass
	{
		void details() {
			int emp_id=11;
			String emp_name="Ram";
			System.out.println(emp_id+" "+ emp_name);
			
		}
		public static void main(String[] args) {
		AbstractClass ac=new display();
		ac.method();
		ac.details();
	}
	}