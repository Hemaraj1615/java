package com.controlflowstatement;

import java.util.Scanner;

/**
 * sumofdigitsofnumber
 * 
 * @author hagunaseelan
 * @since 31/05/2023
 */

public class Sumofdigitofnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		 int number,digit,sum=0;
		 System.out.println("Enter the number:");
		 number=sc.nextInt();
	 while(number>0) {
		 digit =number % 10;
		 sum = sum + digit;
		 number = number/10;
	 }
	 System.out.println("sum of digits of a given number:" +sum);
	 sc.close();
	 }
}
