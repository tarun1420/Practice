package polymorphism;

	class Def extends Abc {
	     public void add(){
	    	 System.out.println("Numbers are added");
	     }	
	}
	public class Xyz{
		public static void main(String[] args) {
			Abc a = new Abc();
			Abc b = new Def();
			a.add();
			b.add();
		}
	}

//OverRiding Basic Example
