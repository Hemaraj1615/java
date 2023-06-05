package com.controlflowstatement;
import java.util.Scanner ;

public class Oddforloop {
	public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int N =sc.nextInt();
	 for ( int counter =1; counter <=N ; counter++) {
		 if(counter % 2 != 0) {
			 System.out.println(counter + "");
			 sc.close();
		 }
	 }
	}

}
