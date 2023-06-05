package com.Classobjectencapsulation;
class Employeencap{
	String empId;
	String empName;
	String emailId;
	long phonenumber;
	double salary;
	
	public Employeecap() {
		super();
	}
	public Employeencap( String empId , String empName ,String emailId , long phonenumber ,double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phonenumber = phonenumber;
		this.salary = salary;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmailId() {
		return emailId;	
		}
    public String setEmailId() {
    	return emailId;
    }
    public long getphonenumber() {
		return phonenumber;	
		}
    public long setphonenumber() {
    	return phonenumber;
    }
    public double getsalary() {
		return salary;	
		}
    public double setsalary() {
    	return salary;
    }
	}
	
	
	
	
	


public class EmployeencapDriver {

	public static void main(String[] args) {
		Employeencap ec2 = new Employeencap("ES6030","hemaraj", " hemaraj@123",7010695388 ,9000);
		System.out.println(ec2.getEmp)
		
    
	}

}
