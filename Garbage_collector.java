package com;
class details{
int id;
String name;
public details(int id, String name) {
super();
this.id = id;
this.name = name;}
public void view(){
System.out.println("ID:"+id+" NAME:"+name);
}
}
public class Garbage_collector {

 public static void main(String[] args) {
details d1 = new details(10,"X");
details d2 = new details(20,"Y");
d1.view();
d2.view();
d2=null;
System.gc();
System.out.println("garbage collector called");
System.runFinalization();
System.out.println("garbage collector called");
d1.view();
d2.view();//it will be destroyed by GC
}
}