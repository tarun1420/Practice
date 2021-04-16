package inheritance;

public class Multiple_Interface {

	interface Company_One{
		public void first();
	}
	interface Company_Two{
		public void second();	
	    }

	class AutoMobile implements Company_One , Company_Two{

		public void first() {
			System.out.println("The Company_One are Cars");
		}
		public void second() {
			System.out.println("The Company_Twos are Bikes");
		}
	}
	public class Multiple{
		public void main(String[] args) {
			AutoMobile ma = new AutoMobile();
			ma.first();
			ma.second();
		}
	}

	//This is Multiple Inheritance achieved by Interface.
	//Here the method can only be void type and static type will not be accepted.
	//Where as in java 8 it allows default and static methods.

}
