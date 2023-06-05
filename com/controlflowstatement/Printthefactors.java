package com.controlflowstatement;
import java.util.Scanner;
/**
 * printthefactors
 * @author agunaseelan
 * @since 31/05/2023
 */
 public class Printthefactors {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	     int number=sc.nextInt(); // print yhe input value for user
	      for (int i=1;i<number;i++) {
	       if (number %i == 0) {
	        System.out.println(i);
	            sc.close();
	       }
	      }
	}
}
