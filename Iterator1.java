package com;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Audi");
    cars.add("BMW");
    cars.add("Maseti");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}