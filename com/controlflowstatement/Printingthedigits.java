package com.controlflowstatement;
import java.util.Scanner;
/**
 * printing the digits
 * @author hagunaseelan
 * @since 31/05/2023
 */
 public class Printingthedigits {
   public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int number = sc.nextInt();
	 int digit=0;
	 int i=0;
	 while(number!=0) {
	 digit=(number%10);
	 System.out.println(digit);
	 number=number/10;
	 }
	 System.out.println(i);
	 sc.close();
   }
 }


