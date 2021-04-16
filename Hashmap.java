package map;

	import java.util.*;

	public class Hashmap {

		public static void main(String[] args) {
			HashMap<String, String> cars = new HashMap<>();
			
			cars.put("BMW", "Sedan");
			cars.put("Rolls", "Classy");
			cars.put("Buggati", "Racer");
			cars.remove("BMW");
			System.out.println("The Cars are" + cars);
		
		
		}
	}


