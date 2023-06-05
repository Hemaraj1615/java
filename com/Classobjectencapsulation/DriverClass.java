package com.Classobjectencapsulation;
import java.util.Scanner;
 class counter {
	 

		 private String id;

		 private String name;

		 private int balance;

		 public counter(String id, String name) {

		 super();

		 this.id = id;

		 this.name = name;

		 }

		 public counter(String id, String name, int balance) {

		 super();

		 this.id = id;

		 this.name = name;

		 this.balance = balance;

		 }

		 public String getId() {

		 return id;

		 }

       String getName() {

		 return name;

		 }
		 
		 public int getBalance() {

		 return balance;

		 }

		 @Override

		 public String toString() {

		 return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";

		 }

		 public int credit(int amount) {

		 return (amount+balance);

		 }

		 public int debit(int amount) {

		 if(amount<=balance) {

		 balance=(balance-amount);

		 return balance;

		 }else

		 System.out.println("Amount exceeded balance,your balance is ");
		 return balance;
		 }
		 //public int transferTo()

		}

		public class DriverClass {

		 public static void main(String[] args) {

		 counter new1=new counter("hemaraj","hemaraj",25000);

		 System.out.println(new1);

		 System.out.println(new1.credit(2000));

		 System.out.println(new1);

		 System.out.println(new1.debit(4000));

		 System.out.println(new1);

		 }

		 }


		 

		
 

