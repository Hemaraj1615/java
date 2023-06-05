package com.controlflowstatement;
import java.util.Scanner ;
/**
 * evenforloop
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Evenforloop {
	public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int N =sc.nextInt();// enter the user value 
	 for ( int counter =1; counter <=N ; counter++) {
	if(counter % 2 == 0) {// make modulus foe even number
	 System.out.println(counter + "");
	 sc.close();
		 }
	 }
		 }
	 }
	

	




