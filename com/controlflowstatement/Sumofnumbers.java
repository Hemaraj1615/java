package com.controlflowstatement;
import java.util.Scanner;

public class Sumofnumbers {
	public static void main ( String [] arg) {
		Scanner sc = new Scanner( System.in);
		int G = sc.nextInt();
		int sum =0;
		for ( int i=1; i< G ;i++) {
			sum = sum+i ;
			System.out.println( sum);
			sc.close();
			
		}
	}

}
