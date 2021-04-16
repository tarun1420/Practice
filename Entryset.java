package com;
import java.util.*;
import java.util.Map.Entry;
public class Entryset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String, String> hm=new HashMap<>();
hm.put("actor", "Raina");
hm.put("singer", "Jaddu");
hm.put("dancer", "Curran");
Iterator<Entry<String, String>>  iterator =hm.entrySet().iterator();
while(iterator.hasNext()){
	Entry<String,String> tarun=iterator.next();
	System.out.println(tarun.getValue());
	System.out.println(tarun.getKey());
	
}
	}

}