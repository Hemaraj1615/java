package com.controlflowstatement;
import java.util.Scanner;
 public class GreaterOrSmallerNestedIfElse {
	 public static void main(String[]arg) {
		 int first;
		 int second;
	 Scanner sc = new Scanner(System.in);
		  //Reading the input from user
 System.out.println("Please dont enter the same values");
	 System.out.println("Enter the first num");
		 first = sc.nextInt();
		  System.out.println("Enter the second num");
		 second = sc.nextInt();
      //Providing condition for testing
	 //Nested if...else condition testing
       if((first > 0 && second > 0) || (first !=second)) {
      	 if(first > second) {
		 System.out.println(first +" is greater than " +second);
		 }else {
		 System.out.println(second +" is greater than " +first);
		 }
        }else {
	 System.out.println("Please enter values greater than zero");
        }
         sc.close():
	 }
 }
 

		 


