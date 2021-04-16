package map;
	import java.util.*;

	public class Map_Ex {
			 public static void main(String args[]) 
			    { 
			        Map<String,Integer> hm = new HashMap<String, Integer>(); 
			  
			        hm.put("a", 100); 
			        hm.put("b", 200); 
			        hm.put("c", 300); 
			        hm.remove("b");
			        System.out.println("The Numbers are = " + hm);
			    }
		}
		
