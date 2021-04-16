package set;

	import java.util.*;
	public class Set_Example {

	  public static void main(String args[]) { 
	    int count[] = {81, 32, 59, 47, 55};
	    Set<Integer> hset = new HashSet<Integer>();
	    try{
	      for(int i = 0; i<4; i++){
	         hset.add(count[i]);
	      }
	      System.out.println(hset);
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
	  }
	}

