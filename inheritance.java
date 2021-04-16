package inheritance;

public class inheritance {

	//Static method in Interface
	interface Method_One{
	   //Default Method
		default void newOne(){
			System.out.println("New_One is the default Method");
		}
		
		//Static Method
		static void anotherOne(){
		System.out.println("Another_One is newly added Static Method");
		}
	}

	public static class Static implements Method_One{

		public static void main(String[] args) {
		Static st = new Static();
		Method_One.anotherOne();
		st.newOne();
	}
	}

	//This is code of static method in Interface.
	//We can create default the Static method in the same interface in java 8.

}
