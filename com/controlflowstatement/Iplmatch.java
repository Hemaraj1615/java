package com.controlflowstatement;
import java.util.Scanner;
/**
 * switch case
 * @author hagunaseelan
 * @since 31-05-2023
 */

 public class Iplmatch {
	 public static void main (String[]args) {
		 Scanner sc = new Scanner(System.in);
		 String date = sc.next();
		 switch(date) {
		 case  "27/05/2023" :
			 System.out.println("RRvscsk");
			 break;
		 case "28/05/2023":
			 System.out.println("punjab vs kkr");
			 break;
		 case "29/05/2023":
			 System .out.println("rcb vs mi");
			 break;
		 case " 30/05/2023":
			 System.out.println("csk vsgt");
			 break;
		 case " 31/05/2023":
			 System.out.println(" mi vs lsg");
			 break;
		 case " 1/06/2023" :
			 System.out.println(" srh vs mi");
			 break;
		 case "2/05/2023":
			 System.out.println(" RR VS RCB");
			 
			 break;
		 default:
			 System.out.println(" no match");
		 }
		 sc.close();
	 }
		 
	 }
 
	

