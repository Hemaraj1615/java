package com.controlflowstatement;
import java.util.Scanner;
/**
 * reverse the numbers
 * @author hagunaseelan
 * @since 31/05/2023
 */
public class Reversethenumbers {
 public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int f = sc.nextInt();
	 int rev=0;
	 int rem=0;
	 while(f!=0) {
	 rem=f%10;
	 rev=rev*10+rem; // reverse the numbers
	 f=f/10;
	 }
	 System.out.println(rev);
	 sc.close();
	}
}
