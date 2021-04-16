package com;
 
class Department implements Cloneable{
    String empId;
 
    String grade;
 
    String designation;
 
    public Department(String empId, String grade, String designation) {
        this.empId = empId;
 
        this.grade = grade;
 
        this.designation = designation;
    }
    //Default version of clone() method.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 
class Employee implements Cloneable {
    int id;
 
    String name;
 
    Department dept;
 
    public Employee(int id, String name, Department dept) {
        this.id = id;
 
        this.name = name;
 
        this.dept = dept;
    }
 
    // Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
 
        emp.dept = (Department) dept.clone();
 
        return emp;
    }
}
 
public class Deep_Copy {
    public static void main(String[] args) {
        Department dept1 = new Department("1", "A", "AVP");
 
        Employee emp1 = new Employee(111, "John", dept1);
 
        Employee emp2 = null;
 
        try {
 
            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        System.out.println(emp1.dept.designation);
 
        emp2.dept.designation = "Director";
 
        System.out.println(emp1.dept.designation); 
    }
}