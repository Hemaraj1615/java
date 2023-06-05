package com.Classobjectencapsulation;
import java.util.Scanner;

 class Employees {
	String empId;
	String empName;
	String emailId;
	long phonenumber;
	double salary;
	
	
	 public void setEmployeeDetails (String id,String name,String emailid, long phno, double sal) {
		 empId = id;
		 empName =  name;
		 emailId = emailid;
		 phonenumber = phno;
		 salary = sal;
	 }
	 public void getEmployeeDetails () {
		 System.out.println("empId:"+ empId);
		 System.out.println("empName:"+ empName);
		 System.out.println("empEmailId:"+ emailId);
		 System.out.println("empphonenumber:"+ phonenumber);
		 System.out.println("empsalary:"+ salary);
	 }
 }
 public class Employee{
    	  public static void main(String[] args) {
    		  String id,name,emailid;
    		  long phoneno;
    		  double sal;
    		  Scanner scan = new Scanner(System.in);
    		  Employees employee = new Employees();
    		  System.out.println(" EmployeeId:");
    		  id = scan.next();
    		  System.out.println("\nEmployeeName:");
    		  name = scan.next();
    		  System.out.println("\nEmployeeemailId:");
    		  emailid= scan.next();
    		  System.out.println("\nEmployeephonenumber:");
    		  phoneno= scan.nextLong();
    		  System.out.println( "\nSalary : ");
    		  sal = scan.nextDouble();
    		  employee.setEmployeeDetails(id, name, emailid, phoneno, sal);
    		  employee.getEmployeeDetails();
    		  Employee Employees1= new Employee();
    		  employee.setEmployeeDetails("es6030", "hemaraj", "hemaraj@123", 123454567L ,5900);
    		  employee.getEmployeeDetails();
    		  scan.close();
    	  }
      }
    		  
    		  

	
      

