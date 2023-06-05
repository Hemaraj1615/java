package com.oops2;
//Base class Employee
class Employee{
	int empId;
	String empName;
	public void setData(int empId , String empName) {
		this.empId = empId;
		this.empName = empName;
}
 public void getData() {
	 System.out.println("Employee Id :" + empId + "|" + "Employee Name :" + empName + "|");
 }
}
// dervied class Manager
 class Manager extends Employee {
	 String empDept;
	 public void setDept(String empDept) {
		 this.empDept = empDept ;
	 }
   public void getDept() {
	   System.out.println("Employee Department :" + empDept);
   }
 }
public class Singleinheritance {
	 public static void main(String[]args ) {
		 Manager manager = new Manager() ;
		 manager .setData( 1234 ,"hemaraj");
		 manager.setDept ("Qa");
		 manager.getData();
		 manager.getDept();
		 
	 }
}
