package map;

	import java.util.*; 

	public class Linked_Hashmap { 
	  
	    public static void main(String args[]) 
	    { 
	        LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>(); 
	  
	        // Add mappings using 
	        // put() method 
	        hm1.put(1,"A"); 
	        hm1.put(2,"For"); 
	        hm1.put(3,"Apple"); 
	  
	        // print mappings to the console 
	        System.out.println("Mappings of LinkedHashMap : "+ hm1); 
	    } 
	}


