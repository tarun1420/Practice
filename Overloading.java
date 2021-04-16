package polymorphism;

	public class Overloading{
	       public String motor(String Bike, String Car){
			System.out.println("Vehicle Type");
	    	   return "Genre";
	       }
	public String motor(String Hysoung,String RR,String Audi){
		System.out.println("Vehicle Name");
		return "Vehicle Name";
	}
	public static void main(String args[]){
	Overloading a = new Overloading();
	a.motor("Bike", "Car");
	a.motor("Hysoung", "RR", "Audi");	
	}
	}


