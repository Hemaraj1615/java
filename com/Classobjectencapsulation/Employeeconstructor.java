package com.Classobjectencapsulation;

class Employeec{


	

public  Employeec(){
	this.empId ="es6030";
	this.empName =" hemaraj";
	this.emailId = " hemaraj@123";
	this.phonenumber = 8974256l;
	this.salary = 60000.0d;
	
}         //default constructor
        public Employeec(String empId, String empName, String emailId) {
        	this.empId =empId;
        	this.empName = empName;
        	this.emailId = emailId;
        }
	//parametrized constructor
	public Employeec(String empId , String empName , String emailId, long phonenumber, double salary) {
		this.empId =empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phonenumber =phonenumber;
		this.salary = salary;

	}
     public void getEmployeeDetails() {
    	 System.out.println("empId:"+ empId);
		 System.out.println("empName:"+ empName);
		 System.out.println("empEmailId:"+ emailId);
		 System.out.println("empphonenumber:"+ phonenumber);
		 System.out.println("empsalary:"+ salary);
     }
}
public class Employeeconstructor {
	 public static void main (String[] args) {
		Employeec ec = new Employeec();
		ec.getEmployeeDetails();
		Employeec ec1 = new Employeec("es6030", "hemaraj", "hemaraj@123");
		ec1.getEmployeeDetails();
		Employeec ec2 = new Employeec("es6030", "hemaraj", "hemaraj@123",123456789, 701234);
		ec2.getEmployeeDetails();
	 }
}
		
	 

