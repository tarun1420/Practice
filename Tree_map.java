package map;

	import java.util.*; 
	public class Tree_map { 
	    public static void main(String args[]) 
	    {  
	        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(); 
	  
	        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(); 
	  
	        tm1.put(1, "We"); 
	        tm1.put(2, "Drive"); 
	        tm1.put(3, "Cars"); 
	  
	        tm2.put(1, "As well as"); 
	        tm2.put(2, "Bikes"); 
	        tm2.put(3, "also"); 
	  
	        System.out.println(tm1); 
	        System.out.println(tm2); 
	    } 
	}


