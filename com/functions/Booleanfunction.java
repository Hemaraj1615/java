package com.functions;
import java.util.Scanner;

public class Booleanfunction {
	public static boolean isEligibile ( int age) {
		if (age >= 18)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("read age");
		int age = read.nextInt();
		boolean check = Booleanfunction.isEligibile(age);
		if(check)
			System.out.println("Is eligible to vote");
		else
			System.out.println("not eligible to vote");
	}
	

	}


