package com.controlflowstatement;
import java.util.Scanner;
/**
 * finding the number greater orsmaller
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Ifelsecondition {
	public static void main(String[] args) {
		int first;
		int second;
	Scanner read = new Scanner(System.in);
	//reading the inputs from the user
	 System.out.println("enter the first number");
		first = read.nextInt();
		System.out.println("enter the second number");
		second = read.nextInt();
		//provide condition for testing
		//if else condition testing
//		if (first>0 || second>0) {
//		if(first>second) {
//			System.out.println(first + "greater than" + second);
//		}else {
//			 System.out.println(second + "greater than" + first);
//		}
		// nested if else
        	if ((first >2 && second > -2) || (first!=second)){
        		if(first > second) {
        	
			System.out.println(first + "is positive");
			
			}else {
			System.out.println(second +"is negative");
			}
		}else {
			System.out.println("none is use");
		}
	}
}





		

	


