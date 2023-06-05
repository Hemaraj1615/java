package com.fundamentals;
import java.util.Scanner;
/**
 * welcomenames
 * @author hagunaseelan
 * @since 30-05-2023
 */
public class Readpersonsname {
   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		 String str1=scan.next(); //first person of name

		 String str2=scan.next(); // second person 

		 String str3=scan.next();

		System.out.println("Welcome "+str1+"! Welcome "+str2+"! Welcome "+str3+" too!");
	

	}

}
