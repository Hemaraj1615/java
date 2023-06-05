package javafundamental;

import java.util.Scanner;

public class Greettheperson {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the name of person 1 and person 2 :");
		String person1=read.next();
		String person2=read.next();
		System.out.println("Welcome "+person1+"!"+"Welcome "+person2+"too!");
		read.close();
	}
}
